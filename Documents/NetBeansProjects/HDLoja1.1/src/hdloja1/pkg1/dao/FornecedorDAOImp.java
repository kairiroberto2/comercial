/**
 * J Planet 1.4.2 - http://ateoriadadesevolucao.blogspot.com/p/software-j-planet.html
 */

/*
 * FornecedorDAOImp.java
 *
 * Criado em 05/01/2020, 14:42:20
 */
package hdloja1.pkg1.dao;

import hdloja1.pkg1.banco.ConnectionFactory;
import hdloja1.pkg1.bean.Fornecedor;
import java.awt.Frame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class FornecedorDAOImp implements GenericDAO<Fornecedor> {

    private Frame frame;
    private Connection connection;

    public FornecedorDAOImp(Frame frame) {
        this.frame = frame;

        connection = new ConnectionFactory().getConnection();
    } // fim do construtor

    @Override
    public void adiciona(Fornecedor fornecedor) {
        try {
            PreparedStatement statement = connection.prepareStatement(
                    "INSERT INTO fornecedor (idfornecedor, pessoa) "
                    + "VALUES (?, ?)");

            // seta os valores
            statement.setInt(1, fornecedor.getIdfornecedor());
            statement.setInt(2, fornecedor.getPessoa());

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
    public void altera(Fornecedor fornecedor) {
        try {
            PreparedStatement statement = connection.prepareStatement(
                    "UPDATE fornecedor SET pessoa = ? "
                    + "WHERE idfornecedor = ?");

            // seta os valores
            statement.setInt(1, fornecedor.getPessoa());
            statement.setInt(2, fornecedor.getIdfornecedor());

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
                    "DELETE FROM fornecedor "
                    + "WHERE idfornecedor = ?");

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
    public Fornecedor listaPorID(Object iD) {
        try {
            Fornecedor fornecedor = null;
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT pessoa "
                    + "FROM fornecedor "
                    + "WHERE idfornecedor = ?");

            // seta o valor
            statement.setObject(1, iD);

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                // cria o objeto Fornecedor
                fornecedor = new Fornecedor();
                fornecedor.setIdfornecedor((Integer) iD);
                fornecedor.setPessoa(resultSet.getInt(1));
            } // fim do if

            resultSet.close();
            statement.close();

            return fornecedor;
        } catch (SQLException sQLException) {
            JOptionPane.showMessageDialog(frame, "Erro ao executar comando no banco de dados!\n"
                    + sQLException.getMessage());
            throw new RuntimeException(sQLException);
        } // fim do catch
    } // fim do metodo listaPorID

    @Override
    public Fornecedor consultaSeta(String iD, int seta) {
        try {
            Fornecedor fornecedor = null;
            String query = "SELECT idfornecedor, pessoa "
                    + "FROM fornecedor ";
            PreparedStatement statement = null;

            switch (seta) {
                case 1:
                    statement = connection.prepareStatement(
                            query + "ORDER BY idfornecedor;");

                    break;
                case 2:
                    statement = connection.prepareStatement(
                            query + "WHERE idfornecedor < ? "
                            + "ORDER BY idfornecedor DESC;");

                    // seta o valor
                    statement.setString(1, iD);

                    break;
                case 3:
                    statement = connection.prepareStatement(
                            query + "WHERE idfornecedor > ? "
                            + "ORDER BY idfornecedor;");

                    // seta o valor
                    statement.setString(1, iD);

                    break;
                case 4:
                    statement = connection.prepareStatement(
                            query + "ORDER BY idfornecedor DESC;");

                    break;
            } // fim do switch

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                // cria o objeto Fornecedor
                fornecedor = new Fornecedor();

                fornecedor.setIdfornecedor(resultSet.getInt(1));
                fornecedor.setPessoa(resultSet.getInt(2));
            }// fim do if

            resultSet.close();
            statement.close();

            return fornecedor;
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
    public List<Fornecedor> listaTudo() {
        try {
            List<Fornecedor> fornecedors = new ArrayList<Fornecedor>();

            PreparedStatement statement = connection.prepareStatement(
                    "SELECT pessoa "
                    + "FROM fornecedor "
                    + "ORDER BY idfornecedor");

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                // cria o objeto Fornecedor
                Fornecedor fornecedor = new Fornecedor();

                fornecedor.setPessoa(resultSet.getInt(1));

                // adiciona o objeto na lista
                fornecedors.add(fornecedor);
            } // fim do while

            resultSet.close();
            statement.close();

            return fornecedors;
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
                    + "FROM fornecedor "
                    + "ORDER BY idfornecedor DESC");

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
} // fim da classe FornecedorDAOImp
