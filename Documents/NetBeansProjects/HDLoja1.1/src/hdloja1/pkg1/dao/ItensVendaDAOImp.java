/**
 * J Planet 1.4.2 - http://ateoriadadesevolucao.blogspot.com/p/software-j-planet.html
 */

/*
 * ItensVendaDAOImp.java
 *
 * Criado em 05/01/2020, 14:42:20
 */
package hdloja1.pkg1.dao;

import hdloja1.pkg1.banco.ConnectionFactory;
import hdloja1.pkg1.ItensVenda;
import java.awt.Frame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ItensVendaDAOImp implements GenericDAO<ItensVenda> {

    private Frame frame;
    private Connection connection;

    public ItensVendaDAOImp(Frame frame) {
        this.frame = frame;

        connection = new ConnectionFactory().getConnection();
    } // fim do construtor

    @Override
    public void adiciona(ItensVenda itensVenda) {
        try {
            PreparedStatement statement = connection.prepareStatement(
                    "INSERT INTO itens_venda (iditens_venda, produto, venda, preco, quantidade, total) "
                    + "VALUES (?, ?, ?, ?, ?, ?)");

            // seta os valores
            statement.setInt(1, itensVenda.getIditensVenda());
            statement.setInt(2, itensVenda.getProduto());
            statement.setInt(3, itensVenda.getVenda());
            statement.setDouble(4, itensVenda.getPreco());
            statement.setDouble(5, itensVenda.getQuantidade());
            statement.setDouble(6, itensVenda.getTotal());

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
    public void altera(ItensVenda itensVenda) {
        try {
            PreparedStatement statement = connection.prepareStatement(
                    "UPDATE itens_venda SET produto = ?, "
                    + "venda = ?, preco = ?, "
                    + "quantidade = ?, total = ? "
                    + "WHERE iditens_venda = ?");

            // seta os valores
            statement.setInt(1, itensVenda.getProduto());
            statement.setInt(2, itensVenda.getVenda());
            statement.setDouble(3, itensVenda.getPreco());
            statement.setDouble(4, itensVenda.getQuantidade());
            statement.setDouble(5, itensVenda.getTotal());
            statement.setInt(6, itensVenda.getIditensVenda());

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
                    "DELETE FROM itens_venda "
                    + "WHERE iditens_venda = ?");

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
    public ItensVenda listaPorID(Object iD) {
        try {
            ItensVenda itensVenda = null;
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT produto, venda, preco, quantidade, total "
                    + "FROM itens_venda "
                    + "WHERE iditens_venda = ?");

            // seta o valor
            statement.setObject(1, iD);

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                // cria o objeto ItensVenda
                itensVenda = new ItensVenda();
                itensVenda.setIditensVenda((Integer) iD);
                itensVenda.setProduto(resultSet.getInt(1));
                itensVenda.setVenda(resultSet.getInt(2));
                itensVenda.setPreco(resultSet.getDouble(3));
                itensVenda.setQuantidade(resultSet.getDouble(4));
                itensVenda.setTotal(resultSet.getDouble(5));
            } // fim do if

            resultSet.close();
            statement.close();

            return itensVenda;
        } catch (SQLException sQLException) {
            JOptionPane.showMessageDialog(frame, "Erro ao executar comando no banco de dados!\n"
                    + sQLException.getMessage());
            throw new RuntimeException(sQLException);
        } // fim do catch
    } // fim do metodo listaPorID

    @Override
    public ItensVenda consultaSeta(String iD, int seta) {
        try {
            ItensVenda itensVenda = null;
            String query = "SELECT iditens_venda, produto, venda, preco, quantidade, total "
                    + "FROM itens_venda ";
            PreparedStatement statement = null;

            switch (seta) {
                case 1:
                    statement = connection.prepareStatement(
                            query + "ORDER BY iditens_venda;");

                    break;
                case 2:
                    statement = connection.prepareStatement(
                            query + "WHERE iditens_venda < ? "
                            + "ORDER BY iditens_venda DESC;");

                    // seta o valor
                    statement.setString(1, iD);

                    break;
                case 3:
                    statement = connection.prepareStatement(
                            query + "WHERE iditens_venda > ? "
                            + "ORDER BY iditens_venda;");

                    // seta o valor
                    statement.setString(1, iD);

                    break;
                case 4:
                    statement = connection.prepareStatement(
                            query + "ORDER BY iditens_venda DESC;");

                    break;
            } // fim do switch

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                // cria o objeto ItensVenda
                itensVenda = new ItensVenda();

                itensVenda.setIditensVenda(resultSet.getInt(1));
                itensVenda.setProduto(resultSet.getInt(2));
                itensVenda.setVenda(resultSet.getInt(3));
                itensVenda.setPreco(resultSet.getDouble(4));
                itensVenda.setQuantidade(resultSet.getDouble(5));
                itensVenda.setTotal(resultSet.getDouble(6));
            }// fim do if

            resultSet.close();
            statement.close();

            return itensVenda;
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
    public List<ItensVenda> listaTudo() {
        try {
            List<ItensVenda> itensVendas = new ArrayList<ItensVenda>();

            PreparedStatement statement = connection.prepareStatement(
                    "SELECT produto, venda, preco, quantidade, total "
                    + "FROM itens_venda "
                    + "ORDER BY iditens_venda");

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                // cria o objeto ItensVenda
                ItensVenda itensVenda = new ItensVenda();

                itensVenda.setProduto(resultSet.getInt(1));
                itensVenda.setVenda(resultSet.getInt(2));
                itensVenda.setPreco(resultSet.getDouble(3));
                itensVenda.setQuantidade(resultSet.getDouble(4));
                itensVenda.setTotal(resultSet.getDouble(5));

                // adiciona o objeto na lista
                itensVendas.add(itensVenda);
            } // fim do while

            resultSet.close();
            statement.close();

            return itensVendas;
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
                    + "FROM itens_venda "
                    + "ORDER BY iditens_venda DESC");

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
} // fim da classe ItensVendaDAOImp
