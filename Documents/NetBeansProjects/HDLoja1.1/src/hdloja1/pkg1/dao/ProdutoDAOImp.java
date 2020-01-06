/**
 * J Planet 1.4.2 - http://ateoriadadesevolucao.blogspot.com/p/software-j-planet.html
 */

/*
 * ProdutoDAOImp.java
 *
 * Criado em 05/01/2020, 14:42:20
 */
package hdloja1.pkg1.dao;

import hdloja1.pkg1.banco.ConnectionFactory;
import hdloja1.pkg1.bean.Produto;
import java.awt.Frame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ProdutoDAOImp implements GenericDAO<Produto> {

    private Frame frame;
    private Connection connection;

    public ProdutoDAOImp(Frame frame) {
        this.frame = frame;

        connection = new ConnectionFactory().getConnection();
    } // fim do construtor

    @Override
    public void adiciona(Produto produto) {
        try {
            PreparedStatement statement = connection.prepareStatement(
                    "INSERT INTO produto (idproduto, nome, preco, estoque, categoria) "
                    + "VALUES (?, ?, ?, ?, ?)");

            // seta os valores
            statement.setInt(1, produto.getIdproduto());
            statement.setString(2, produto.getNome());
            statement.setDouble(3, produto.getPreco());
            statement.setDouble(4, produto.getEstoque());
            statement.setInt(5, produto.getCategoria());

            // executa
            statement.execute();
            statement.close();
        } catch (SQLException sQLException) {
            JOptionPane.showMessageDialog(frame, "Erro ao executar comando no banco de dados!\n"
                    + sQLException.getMessage());
            throw new RuntimeException(sQLException);
        } // fim do catch
    } // fim do metodo adiciona

    @Override
    public void altera(Produto produto) {
        try {
            PreparedStatement statement = connection.prepareStatement(
                    "UPDATE produto SET nome = ?, "
                    + "preco = ?, estoque = ?, "
                    + "categoria = ? "
                    + "WHERE idproduto = ?");

            // seta os valores
            statement.setString(1, produto.getNome());
            statement.setDouble(2, produto.getPreco());
            statement.setDouble(3, produto.getEstoque());
            statement.setInt(4, produto.getCategoria());
            statement.setInt(5, produto.getIdproduto());

            // executa
            statement.execute();
            statement.close();
        } catch (SQLException sQLException) {
            System.out.println("Erro ao executar comando no banco de dados!\n"
                    + sQLException.getMessage());
            throw new RuntimeException(sQLException);
        } // fim do catch
    } // fim do metodo altera

    @Override
    public void remove(Object iD) {
        try {
            PreparedStatement statement = connection.prepareStatement(
                    "DELETE FROM produto "
                    + "WHERE idproduto = ?");

            // seta o valor
            statement.setObject(1, iD);

            // executa
            statement.execute();
            statement.close();
        } catch (SQLException sQLException) {
            JOptionPane.showMessageDialog(frame, "Erro ao executar comando no banco de dados!\n"
                    + sQLException.getMessage());
            throw new RuntimeException(sQLException);
        } // fim do catch
    } // fim do metodo remove

    @Override
    public Produto listaPorID(Object iD) {
        try {
            Produto produto = null;
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT nome, preco, estoque, categoria "
                    + "FROM produto "
                    + "WHERE idproduto = ?");

            // seta o valor
            statement.setObject(1, iD);

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                // cria o objeto Produto
                produto = new Produto();
                produto.setIdproduto((Integer) iD);
                produto.setNome(resultSet.getString(1));
                produto.setPreco(resultSet.getDouble(2));
                produto.setEstoque(resultSet.getDouble(3));
                produto.setCategoria(resultSet.getInt(4));
            } // fim do if

            resultSet.close();
            statement.close();

            return produto;
        } catch (SQLException sQLException) {
            JOptionPane.showMessageDialog(frame, "Erro ao executar comando no banco de dados!\n"
                    + sQLException.getMessage());
            throw new RuntimeException(sQLException);
        } // fim do catch
    } // fim do metodo listaPorID

    @Override
    public Produto consultaSeta(String iD, int seta) {
        try {
            Produto produto = null;
            String query = "SELECT idproduto, nome, preco, estoque, categoria "
                    + "FROM produto ";
            PreparedStatement statement = null;

            switch (seta) {
                case 1:
                    statement = connection.prepareStatement(
                            query + "ORDER BY idproduto;");

                    break;
                case 2:
                    statement = connection.prepareStatement(
                            query + "WHERE idproduto < ? "
                            + "ORDER BY idproduto DESC;");

                    // seta o valor
                    statement.setString(1, iD);

                    break;
                case 3:
                    statement = connection.prepareStatement(
                            query + "WHERE idproduto > ? "
                            + "ORDER BY idproduto;");

                    // seta o valor
                    statement.setString(1, iD);

                    break;
                case 4:
                    statement = connection.prepareStatement(
                            query + "ORDER BY idproduto DESC;");

                    break;
            } // fim do switch

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                // cria o objeto Produto
                produto = new Produto();

                produto.setIdproduto(resultSet.getInt(1));
                produto.setNome(resultSet.getString(2));
                produto.setPreco(resultSet.getDouble(3));
                produto.setEstoque(resultSet.getDouble(4));
                produto.setCategoria(resultSet.getInt(5));
            }// fim do if

            resultSet.close();
            statement.close();

            return produto;
        } catch (SQLException sQLException) {
            JOptionPane.showMessageDialog(frame, 
                    "Erro ao executar comando no banco de dados!\n"
                    + "O programa vai ser fechado.\n\nErro ocorrido:\n"
                    + sQLException.getMessage());

            System.exit(0);

            throw new RuntimeException(sQLException);
        } // fim do catch
    }  // fim do metodo consultaSeta

    @Override
    public List<Produto> listaTudo() {
        try {
            List<Produto> produtos = new ArrayList<Produto>();

            PreparedStatement statement = connection.prepareStatement(
                    "SELECT nome, preco, estoque, categoria "
                    + "FROM produto "
                    + "ORDER BY idproduto");

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                // cria o objeto Produto
                Produto produto = new Produto();

                produto.setNome(resultSet.getString(1));
                produto.setPreco(resultSet.getDouble(2));
                produto.setEstoque(resultSet.getDouble(3));
                produto.setCategoria(resultSet.getInt(4));

                // adiciona o objeto na lista
                produtos.add(produto);
            } // fim do while

            resultSet.close();
            statement.close();

            return produtos;
        } catch (SQLException sQLException) {
            JOptionPane.showMessageDialog(frame, "Erro ao executar comando no banco de dados!\n"
                    + sQLException.getMessage());
            throw new RuntimeException(sQLException);
        } // fim do catch
    } // fim do metodo listaTudo

    @Override
    public int consultaProximoID() {
        try {
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT * "
                    + "FROM produto "
                    + "ORDER BY idproduto DESC");

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                return resultSet.getInt(1) + 1;
            }

            resultSet.close();
            statement.close();

            return 1;
        } catch (SQLException sQLException) {
            JOptionPane.showMessageDialog(frame, "Erro ao executar comando no banco de dados!\n"
                    + sQLException.getMessage());
            throw new RuntimeException(sQLException);
        } // fim do catch
    } // fim do metodo consultaProximoID
} // fim da classe ProdutoDAOImp
