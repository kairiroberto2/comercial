/**
 * J Planet 1.4.2 - http://ateoriadadesevolucao.blogspot.com/p/software-j-planet.html
 */

/*
 * CategoriaDAOImp.java
 *
 * Criado em 05/01/2020, 14:42:20
 */
package hdloja1.pkg1.dao;

import hdloja1.pkg1.banco.ConnectionFactory;
import hdloja1.pkg1.bean.Categoria;
import java.awt.Frame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CategoriaDAOImp implements GenericDAO<Categoria> {

    private Frame frame;
    private Connection connection;

    public CategoriaDAOImp(Frame frame) {
        this.frame = frame;

        connection = new ConnectionFactory().getConnection();
    } // fim do construtor

    @Override
    public void adiciona(Categoria categoria) {
        try {
            PreparedStatement statement = connection.prepareStatement(
                    "INSERT INTO categoria (idcategoria, nome) "
                    + "VALUES (?, ?)");

            // seta os valores
            statement.setInt(1, categoria.getIdcategoria());
            statement.setString(2, categoria.getNome());

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
    public void altera(Categoria categoria) {
        try {
            PreparedStatement statement = connection.prepareStatement(
                    "UPDATE categoria SET nome = ? "
                    + "WHERE idcategoria = ?");

            // seta os valores
            statement.setString(1, categoria.getNome());
            statement.setInt(2, categoria.getIdcategoria());

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
                    "DELETE FROM categoria "
                    + "WHERE idcategoria = ?");

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
    public Categoria listaPorID(Object iD) {
        try {
            Categoria categoria = null;
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT nome "
                    + "FROM categoria "
                    + "WHERE idcategoria = ?");

            // seta o valor
            statement.setObject(1, iD);

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                // cria o objeto Categoria
                categoria = new Categoria();
                categoria.setIdcategoria((Integer) iD);
                categoria.setNome(resultSet.getString(1));
            } // fim do if

            resultSet.close();
            statement.close();

            return categoria;
        } catch (SQLException sQLException) {
            JOptionPane.showMessageDialog(frame, "Erro ao executar comando no banco de dados!\n"
                    + sQLException.getMessage());
            throw new RuntimeException(sQLException);
        } // fim do catch
    } // fim do metodo listaPorID

    @Override
    public Categoria consultaSeta(String iD, int seta) {
        try {
            Categoria categoria = null;
            String query = "SELECT idcategoria, nome "
                    + "FROM categoria ";
            PreparedStatement statement = null;

            switch (seta) {
                case 1:
                    statement = connection.prepareStatement(
                            query + "ORDER BY idcategoria;");

                    break;
                case 2:
                    statement = connection.prepareStatement(
                            query + "WHERE idcategoria < ? "
                            + "ORDER BY idcategoria DESC;");

                    // seta o valor
                    statement.setString(1, iD);

                    break;
                case 3:
                    statement = connection.prepareStatement(
                            query + "WHERE idcategoria > ? "
                            + "ORDER BY idcategoria;");

                    // seta o valor
                    statement.setString(1, iD);

                    break;
                case 4:
                    statement = connection.prepareStatement(
                            query + "ORDER BY idcategoria DESC;");

                    break;
            } // fim do switch

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                // cria o objeto Categoria
                categoria = new Categoria();

                categoria.setIdcategoria(resultSet.getInt(1));
                categoria.setNome(resultSet.getString(2));
            }// fim do if

            resultSet.close();
            statement.close();

            return categoria;
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
    public List<Categoria> listaTudo() {
        try {
            List<Categoria> categorias = new ArrayList<Categoria>();

            PreparedStatement statement = connection.prepareStatement(
                    "SELECT nome "
                    + "FROM categoria "
                    + "ORDER BY idcategoria");

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                // cria o objeto Categoria
                Categoria categoria = new Categoria();

                categoria.setNome(resultSet.getString(1));

                // adiciona o objeto na lista
                categorias.add(categoria);
            } // fim do while

            resultSet.close();
            statement.close();

            return categorias;
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
                    + "FROM categoria "
                    + "ORDER BY idcategoria DESC");

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
} // fim da classe CategoriaDAOImp
