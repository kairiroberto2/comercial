/**
 * J Planet 1.4.2 - http://ateoriadadesevolucao.blogspot.com/p/software-j-planet.html
 */

/*
 * ClienteDAOImp.java
 *
 * Criado em 05/01/2020, 14:42:20
 */
package hdloja1.pkg1.dao;

import hdloja1.pkg1.banco.ConnectionFactory;
import hdloja1.pkg1.bean.Cliente;
import java.awt.Frame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ClienteDAOImp implements GenericDAO<Cliente> {

    private Frame frame;
    private Connection connection;

    public ClienteDAOImp(Frame frame) {
        this.frame = frame;

        connection = new ConnectionFactory().getConnection();
    } // fim do construtor

    @Override
    public void adiciona(Cliente cliente) {
        try {
            PreparedStatement statement = connection.prepareStatement(
                    "INSERT INTO cliente (idcliente, pessoa) "
                    + "VALUES (?, ?)");

            // seta os valores
            statement.setInt(1, cliente.getIdcliente());
            statement.setInt(2, cliente.getPessoa());

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
    public void altera(Cliente cliente) {
        try {
            PreparedStatement statement = connection.prepareStatement(
                    "UPDATE cliente SET pessoa = ? "
                    + "WHERE idcliente = ?");

            // seta os valores
            statement.setInt(1, cliente.getPessoa());
            statement.setInt(2, cliente.getIdcliente());

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
                    "DELETE FROM cliente "
                    + "WHERE idcliente = ?");

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
    public Cliente listaPorID(Object iD) {
        try {
            Cliente cliente = null;
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT pessoa "
                    + "FROM cliente "
                    + "WHERE idcliente = ?");

            // seta o valor
            statement.setObject(1, iD);

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                // cria o objeto Cliente
                cliente = new Cliente();
                cliente.setIdcliente((Integer) iD);
                cliente.setPessoa(resultSet.getInt(1));
            } // fim do if

            resultSet.close();
            statement.close();

            return cliente;
        } catch (SQLException sQLException) {
            JOptionPane.showMessageDialog(frame, "Erro ao executar comando no banco de dados!\n"
                    + sQLException.getMessage());
            throw new RuntimeException(sQLException);
        } // fim do catch
    } // fim do metodo listaPorID

    @Override
    public Cliente consultaSeta(String iD, int seta) {
        try {
            Cliente cliente = null;
            String query = "SELECT idcliente, pessoa "
                    + "FROM cliente ";
            PreparedStatement statement = null;

            switch (seta) {
                case 1:
                    statement = connection.prepareStatement(
                            query + "ORDER BY idcliente;");

                    break;
                case 2:
                    statement = connection.prepareStatement(
                            query + "WHERE idcliente < ? "
                            + "ORDER BY idcliente DESC;");

                    // seta o valor
                    statement.setString(1, iD);

                    break;
                case 3:
                    statement = connection.prepareStatement(
                            query + "WHERE idcliente > ? "
                            + "ORDER BY idcliente;");

                    // seta o valor
                    statement.setString(1, iD);

                    break;
                case 4:
                    statement = connection.prepareStatement(
                            query + "ORDER BY idcliente DESC;");

                    break;
            } // fim do switch

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                // cria o objeto Cliente
                cliente = new Cliente();

                cliente.setIdcliente(resultSet.getInt(1));
                cliente.setPessoa(resultSet.getInt(2));
            }// fim do if

            resultSet.close();
            statement.close();

            return cliente;
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
    public List<Cliente> listaTudo() {
        try {
            List<Cliente> clientes = new ArrayList<Cliente>();

            PreparedStatement statement = connection.prepareStatement(
                    "SELECT pessoa "
                    + "FROM cliente "
                    + "ORDER BY idcliente");

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                // cria o objeto Cliente
                Cliente cliente = new Cliente();

                cliente.setPessoa(resultSet.getInt(1));

                // adiciona o objeto na lista
                clientes.add(cliente);
            } // fim do while

            resultSet.close();
            statement.close();

            return clientes;
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
                    + "FROM cliente "
                    + "ORDER BY idcliente DESC");

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
} // fim da classe ClienteDAOImp
