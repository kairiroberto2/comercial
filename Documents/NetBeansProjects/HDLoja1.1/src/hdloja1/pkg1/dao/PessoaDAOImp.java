/**
 * J Planet 1.4.2 - http://ateoriadadesevolucao.blogspot.com/p/software-j-planet.html
 */

/*
 * PessoaDAOImp.java
 *
 * Criado em 05/01/2020, 14:42:20
 */
package hdloja1.pkg1.dao;

import hdloja1.pkg1.banco.ConnectionFactory;
import hdloja1.pkg1.bean.Pessoa;
import java.awt.Frame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class PessoaDAOImp implements GenericDAO<Pessoa> {

    private Frame frame;
    private Connection connection;

    public PessoaDAOImp(Frame frame) {
        this.frame = frame;

        connection = new ConnectionFactory().getConnection();
    } // fim do construtor

    @Override
    public void adiciona(Pessoa pessoa) {
        try {
            PreparedStatement statement = connection.prepareStatement(
                    "INSERT INTO pessoa (idpessoa, nome) "
                    + "VALUES (?, ?)");

            // seta os valores
            statement.setInt(1, pessoa.getIdpessoa());
            statement.setString(2, pessoa.getNome());

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
    public void altera(Pessoa pessoa) {
        try {
            PreparedStatement statement = connection.prepareStatement(
                    "UPDATE pessoa SET nome = ? "
                    + "WHERE idpessoa = ?");

            // seta os valores
            statement.setString(1, pessoa.getNome());
            statement.setInt(2, pessoa.getIdpessoa());

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
                    "DELETE FROM pessoa "
                    + "WHERE idpessoa = ?");

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
    public Pessoa listaPorID(Object iD) {
        try {
            Pessoa pessoa = null;
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT nome "
                    + "FROM pessoa "
                    + "WHERE idpessoa = ?");

            // seta o valor
            statement.setObject(1, iD);

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                // cria o objeto Pessoa
                pessoa = new Pessoa();
                pessoa.setIdpessoa((Integer) iD);
                pessoa.setNome(resultSet.getString(1));
            } // fim do if

            resultSet.close();
            statement.close();

            return pessoa;
        } catch (SQLException sQLException) {
            JOptionPane.showMessageDialog(frame, "Erro ao executar comando no banco de dados!\n"
                    + sQLException.getMessage());
            throw new RuntimeException(sQLException);
        } // fim do catch
    } // fim do metodo listaPorID

    @Override
    public Pessoa consultaSeta(String iD, int seta) {
        try {
            Pessoa pessoa = null;
            String query = "SELECT idpessoa, nome "
                    + "FROM pessoa ";
            PreparedStatement statement = null;

            switch (seta) {
                case 1:
                    statement = connection.prepareStatement(
                            query + "ORDER BY idpessoa;");

                    break;
                case 2:
                    statement = connection.prepareStatement(
                            query + "WHERE idpessoa < ? "
                            + "ORDER BY idpessoa DESC;");

                    // seta o valor
                    statement.setString(1, iD);

                    break;
                case 3:
                    statement = connection.prepareStatement(
                            query + "WHERE idpessoa > ? "
                            + "ORDER BY idpessoa;");

                    // seta o valor
                    statement.setString(1, iD);

                    break;
                case 4:
                    statement = connection.prepareStatement(
                            query + "ORDER BY idpessoa DESC;");

                    break;
            } // fim do switch

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                // cria o objeto Pessoa
                pessoa = new Pessoa();

                pessoa.setIdpessoa(resultSet.getInt(1));
                pessoa.setNome(resultSet.getString(2));
            }// fim do if

            resultSet.close();
            statement.close();

            return pessoa;
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
    public List<Pessoa> listaTudo() {
        try {
            List<Pessoa> pessoas = new ArrayList<Pessoa>();

            PreparedStatement statement = connection.prepareStatement(
                    "SELECT nome "
                    + "FROM pessoa "
                    + "ORDER BY idpessoa");

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                // cria o objeto Pessoa
                Pessoa pessoa = new Pessoa();

                pessoa.setNome(resultSet.getString(1));

                // adiciona o objeto na lista
                pessoas.add(pessoa);
            } // fim do while

            resultSet.close();
            statement.close();

            return pessoas;
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
                    + "FROM pessoa "
                    + "ORDER BY idpessoa DESC");

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
} // fim da classe PessoaDAOImp
