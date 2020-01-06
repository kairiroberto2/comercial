/**
 * J Planet 1.4.2 - http://ateoriadadesevolucao.blogspot.com/p/software-j-planet.html
 */

/*
 * VendaDAOImp.java
 *
 * Criado em 05/01/2020, 14:42:20
 */
package hdloja1.pkg1.dao;

import hdloja1.pkg1.banco.ConnectionFactory;
import hdloja1.pkg1.bean.Venda;
import java.awt.Frame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class VendaDAOImp implements GenericDAO<Venda> {

    private Frame frame;
    private Connection connection;

    public VendaDAOImp(Frame frame) {
        this.frame = frame;

        connection = new ConnectionFactory().getConnection();
    } // fim do construtor

    @Override
    public void adiciona(Venda venda) {

        String dataData = venda.getData() == null ? null
                : new SimpleDateFormat("").format(
                venda.getData());

        try {
            PreparedStatement statement = connection.prepareStatement(
                    "INSERT INTO venda (idvenda, data, cliente) "
                    + "VALUES (?, ?, ?)");

            // seta os valores
            statement.setInt(1, venda.getIdvenda());
            statement.setString(2, dataData);
            statement.setInt(3, venda.getCliente());

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
    public void altera(Venda venda) {

        String dataData = venda.getData() == null ? null
                : new SimpleDateFormat("").format(
                venda.getData());

        try {
            PreparedStatement statement = connection.prepareStatement(
                    "UPDATE venda SET data = ?, "
                    + "cliente = ? "
                    + "WHERE idvenda = ?");

            // seta os valores
            statement.setString(1, dataData);
            statement.setInt(2, venda.getCliente());
            statement.setInt(3, venda.getIdvenda());

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
                    "DELETE FROM venda "
                    + "WHERE idvenda = ?");

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
    public Venda listaPorID(Object iD) {
        try {
            Venda venda = null;
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT data, cliente "
                    + "FROM venda "
                    + "WHERE idvenda = ?");

            // seta o valor
            statement.setObject(1, iD);

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                // cria o objeto Venda
                venda = new Venda();
                venda.setIdvenda((Integer) iD);
                venda.setData(resultSet.getDate(1));
                venda.setCliente(resultSet.getInt(2));
            } // fim do if

            resultSet.close();
            statement.close();

            return venda;
        } catch (SQLException sQLException) {
            JOptionPane.showMessageDialog(frame, "Erro ao executar comando no banco de dados!\n"
                    + sQLException.getMessage());
            throw new RuntimeException(sQLException);
        } // fim do catch
    } // fim do metodo listaPorID

    @Override
    public Venda consultaSeta(String iD, int seta) {
        try {
            Venda venda = null;
            String query = "SELECT idvenda, data, cliente "
                    + "FROM venda ";
            PreparedStatement statement = null;

            switch (seta) {
                case 1:
                    statement = connection.prepareStatement(
                            query + "ORDER BY idvenda;");

                    break;
                case 2:
                    statement = connection.prepareStatement(
                            query + "WHERE idvenda < ? "
                            + "ORDER BY idvenda DESC;");

                    // seta o valor
                    statement.setString(1, iD);

                    break;
                case 3:
                    statement = connection.prepareStatement(
                            query + "WHERE idvenda > ? "
                            + "ORDER BY idvenda;");

                    // seta o valor
                    statement.setString(1, iD);

                    break;
                case 4:
                    statement = connection.prepareStatement(
                            query + "ORDER BY idvenda DESC;");

                    break;
            } // fim do switch

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                // cria o objeto Venda
                venda = new Venda();

                venda.setIdvenda(resultSet.getInt(1));
                venda.setData(resultSet.getDate(2));
                venda.setCliente(resultSet.getInt(3));
            }// fim do if

            resultSet.close();
            statement.close();

            return venda;
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
    public List<Venda> listaTudo() {
        try {
            List<Venda> vendas = new ArrayList<Venda>();

            PreparedStatement statement = connection.prepareStatement(
                    "SELECT data, cliente "
                    + "FROM venda "
                    + "ORDER BY idvenda");

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                // cria o objeto Venda
                Venda venda = new Venda();

                venda.setData(resultSet.getDate(1));
                venda.setCliente(resultSet.getInt(2));

                // adiciona o objeto na lista
                vendas.add(venda);
            } // fim do while

            resultSet.close();
            statement.close();

            return vendas;
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
                    + "FROM venda "
                    + "ORDER BY idvenda DESC");

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
} // fim da classe VendaDAOImp
