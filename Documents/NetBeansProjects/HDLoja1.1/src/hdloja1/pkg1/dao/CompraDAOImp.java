/**
 * J Planet 1.4.2 - http://ateoriadadesevolucao.blogspot.com/p/software-j-planet.html
 */

/*
 * CompraDAOImp.java
 *
 * Criado em 05/01/2020, 14:42:20
 */
package hdloja1.pkg1.dao;

import hdloja1.pkg1.banco.ConnectionFactory;
import hdloja1.pkg1.bean.Compra;
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

public class CompraDAOImp implements GenericDAO<Compra> {

    private Frame frame;
    private Connection connection;

    public CompraDAOImp(Frame frame) {
        this.frame = frame;

        connection = new ConnectionFactory().getConnection();
    } // fim do construtor

    @Override
    public void adiciona(Compra compra) {

        String dataData = compra.getData() == null ? null
                : new SimpleDateFormat("").format(
                compra.getData());

        try {
            PreparedStatement statement = connection.prepareStatement(
                    "INSERT INTO compra (idcompra, data, fornecedor) "
                    + "VALUES (?, ?, ?)");

            // seta os valores
            statement.setInt(1, compra.getIdcompra());
            statement.setString(2, dataData);
            statement.setInt(3, compra.getFornecedor());

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
    public void altera(Compra compra) {

        String dataData = compra.getData() == null ? null
                : new SimpleDateFormat("").format(
                compra.getData());

        try {
            PreparedStatement statement = connection.prepareStatement(
                    "UPDATE compra SET data = ?, "
                    + "fornecedor = ? "
                    + "WHERE idcompra = ?");

            // seta os valores
            statement.setString(1, dataData);
            statement.setInt(2, compra.getFornecedor());
            statement.setInt(3, compra.getIdcompra());

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
                    "DELETE FROM compra "
                    + "WHERE idcompra = ?");

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
    public Compra listaPorID(Object iD) {
        try {
            Compra compra = null;
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT data, fornecedor "
                    + "FROM compra "
                    + "WHERE idcompra = ?");

            // seta o valor
            statement.setObject(1, iD);

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                // cria o objeto Compra
                compra = new Compra();
                compra.setIdcompra((Integer) iD);
                compra.setData(resultSet.getDate(1));
                compra.setFornecedor(resultSet.getInt(2));
            } // fim do if

            resultSet.close();
            statement.close();

            return compra;
        } catch (SQLException sQLException) {
            JOptionPane.showMessageDialog(frame, "Erro ao executar comando no banco de dados!\n"
                    + sQLException.getMessage());
            throw new RuntimeException(sQLException);
        } // fim do catch
    } // fim do metodo listaPorID

    @Override
    public Compra consultaSeta(String iD, int seta) {
        try {
            Compra compra = null;
            String query = "SELECT idcompra, data, fornecedor "
                    + "FROM compra ";
            PreparedStatement statement = null;

            switch (seta) {
                case 1:
                    statement = connection.prepareStatement(
                            query + "ORDER BY idcompra;");

                    break;
                case 2:
                    statement = connection.prepareStatement(
                            query + "WHERE idcompra < ? "
                            + "ORDER BY idcompra DESC;");

                    // seta o valor
                    statement.setString(1, iD);

                    break;
                case 3:
                    statement = connection.prepareStatement(
                            query + "WHERE idcompra > ? "
                            + "ORDER BY idcompra;");

                    // seta o valor
                    statement.setString(1, iD);

                    break;
                case 4:
                    statement = connection.prepareStatement(
                            query + "ORDER BY idcompra DESC;");

                    break;
            } // fim do switch

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                // cria o objeto Compra
                compra = new Compra();

                compra.setIdcompra(resultSet.getInt(1));
                compra.setData(resultSet.getDate(2));
                compra.setFornecedor(resultSet.getInt(3));
            }// fim do if

            resultSet.close();
            statement.close();

            return compra;
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
    public List<Compra> listaTudo() {
        try {
            List<Compra> compras = new ArrayList<Compra>();

            PreparedStatement statement = connection.prepareStatement(
                    "SELECT data, fornecedor "
                    + "FROM compra "
                    + "ORDER BY idcompra");

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                // cria o objeto Compra
                Compra compra = new Compra();

                compra.setData(resultSet.getDate(1));
                compra.setFornecedor(resultSet.getInt(2));

                // adiciona o objeto na lista
                compras.add(compra);
            } // fim do while

            resultSet.close();
            statement.close();

            return compras;
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
                    + "FROM compra "
                    + "ORDER BY idcompra DESC");

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
} // fim da classe CompraDAOImp
