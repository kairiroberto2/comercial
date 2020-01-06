/**
 * J Planet 1.4.2 - http://ateoriadadesevolucao.blogspot.com/p/software-j-planet.html
 */

/*
 * ItensCompraDAOImp.java
 *
 * Criado em 05/01/2020, 14:42:20
 */
package hdloja1.pkg1.dao;

import hdloja1.pkg1.banco.ConnectionFactory;
import hdloja1.pkg1.bean.ItensCompra;
import java.awt.Frame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ItensCompraDAOImp implements GenericDAO<ItensCompra> {

    private Frame frame;
    private Connection connection;

    public ItensCompraDAOImp(Frame frame) {
        this.frame = frame;

        connection = new ConnectionFactory().getConnection();
    } // fim do construtor

    @Override
    public void adiciona(ItensCompra itensCompra) {
        try {
            PreparedStatement statement = connection.prepareStatement(
                    "INSERT INTO itens_compra (iditens_compra, produto, compra, preco, quantidade, total) "
                    + "VALUES (?, ?, ?, ?, ?, ?)");

            // seta os valores
            statement.setInt(1, itensCompra.getIditensCompra());
            statement.setInt(2, itensCompra.getProduto());
            statement.setInt(3, itensCompra.getCompra());
            statement.setDouble(4, itensCompra.getPreco());
            statement.setDouble(5, itensCompra.getQuantidade());
            statement.setDouble(6, itensCompra.getTotal());

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
    public void altera(ItensCompra itensCompra) {
        try {
            PreparedStatement statement = connection.prepareStatement(
                    "UPDATE itens_compra SET produto = ?, "
                    + "compra = ?, preco = ?, "
                    + "quantidade = ?, total = ? "
                    + "WHERE iditens_compra = ?");

            // seta os valores
            statement.setInt(1, itensCompra.getProduto());
            statement.setInt(2, itensCompra.getCompra());
            statement.setDouble(3, itensCompra.getPreco());
            statement.setDouble(4, itensCompra.getQuantidade());
            statement.setDouble(5, itensCompra.getTotal());
            statement.setInt(6, itensCompra.getIditensCompra());

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
                    "DELETE FROM itens_compra "
                    + "WHERE iditens_compra = ?");

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
    public ItensCompra listaPorID(Object iD) {
        try {
            ItensCompra itensCompra = null;
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT produto, compra, preco, quantidade, total "
                    + "FROM itens_compra "
                    + "WHERE iditens_compra = ?");

            // seta o valor
            statement.setObject(1, iD);

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                // cria o objeto ItensCompra
                itensCompra = new ItensCompra();
                itensCompra.setIditensCompra((Integer) iD);
                itensCompra.setProduto(resultSet.getInt(1));
                itensCompra.setCompra(resultSet.getInt(2));
                itensCompra.setPreco(resultSet.getDouble(3));
                itensCompra.setQuantidade(resultSet.getDouble(4));
                itensCompra.setTotal(resultSet.getDouble(5));
            } // fim do if

            resultSet.close();
            statement.close();

            return itensCompra;
        } catch (SQLException sQLException) {
            JOptionPane.showMessageDialog(frame, "Erro ao executar comando no banco de dados!\n"
                    + sQLException.getMessage());
            throw new RuntimeException(sQLException);
        } // fim do catch
    } // fim do metodo listaPorID

    @Override
    public ItensCompra consultaSeta(String iD, int seta) {
        try {
            ItensCompra itensCompra = null;
            String query = "SELECT iditens_compra, produto, compra, preco, quantidade, total "
                    + "FROM itens_compra ";
            PreparedStatement statement = null;

            switch (seta) {
                case 1:
                    statement = connection.prepareStatement(
                            query + "ORDER BY iditens_compra;");

                    break;
                case 2:
                    statement = connection.prepareStatement(
                            query + "WHERE iditens_compra < ? "
                            + "ORDER BY iditens_compra DESC;");

                    // seta o valor
                    statement.setString(1, iD);

                    break;
                case 3:
                    statement = connection.prepareStatement(
                            query + "WHERE iditens_compra > ? "
                            + "ORDER BY iditens_compra;");

                    // seta o valor
                    statement.setString(1, iD);

                    break;
                case 4:
                    statement = connection.prepareStatement(
                            query + "ORDER BY iditens_compra DESC;");

                    break;
            } // fim do switch

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                // cria o objeto ItensCompra
                itensCompra = new ItensCompra();

                itensCompra.setIditensCompra(resultSet.getInt(1));
                itensCompra.setProduto(resultSet.getInt(2));
                itensCompra.setCompra(resultSet.getInt(3));
                itensCompra.setPreco(resultSet.getDouble(4));
                itensCompra.setQuantidade(resultSet.getDouble(5));
                itensCompra.setTotal(resultSet.getDouble(6));
            }// fim do if

            resultSet.close();
            statement.close();

            return itensCompra;
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
    public List<ItensCompra> listaTudo() {
        try {
            List<ItensCompra> itensCompras = new ArrayList<ItensCompra>();

            PreparedStatement statement = connection.prepareStatement(
                    "SELECT produto, compra, preco, quantidade, total "
                    + "FROM itens_compra "
                    + "ORDER BY iditens_compra");

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                // cria o objeto ItensCompra
                ItensCompra itensCompra = new ItensCompra();

                itensCompra.setProduto(resultSet.getInt(1));
                itensCompra.setCompra(resultSet.getInt(2));
                itensCompra.setPreco(resultSet.getDouble(3));
                itensCompra.setQuantidade(resultSet.getDouble(4));
                itensCompra.setTotal(resultSet.getDouble(5));

                // adiciona o objeto na lista
                itensCompras.add(itensCompra);
            } // fim do while

            resultSet.close();
            statement.close();

            return itensCompras;
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
                    + "FROM itens_compra "
                    + "ORDER BY iditens_compra DESC");

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
} // fim da classe ItensCompraDAOImp
