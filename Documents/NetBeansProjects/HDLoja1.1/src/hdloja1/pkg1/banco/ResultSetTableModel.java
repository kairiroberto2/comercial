/**
 * J Planet 1.4.2 - http://ateoriadadesevolucao.blogspot.com/p/software-j-planet.html
 */

/*
 * ResultSetTableModel.java
 *
 * Criado em 05/01/2020, 14:42:20
 */
package hdloja1.pkg1.banco;

// Um TableModel que fornece dados ResultSet a uma JTable.
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.table.AbstractTableModel;

public class ResultSetTableModel extends AbstractTableModel {

    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;
    private ResultSetMetaData metaData;
    private int numeroDeLinhas;
    // monitora o status da conexao de banco de dados
    private boolean conectado = false;

    // construtor inicializa resultSet e obtem seu objeto de metadados;
    // determina numero de linhas
    public ResultSetTableModel(String query) throws SQLException {
        // conecta-se ao banco de dados
        connection = new ConnectionFactory().getConnection();

        // cria Statement para consultar banco de dados
        statement = connection.createStatement(
                ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY);

        // atualiza status de conexao de banco de dados
        conectado = true;

        // configura consulta e a executa
        setQuery(query);
    } // fim do construtor ResultSetTableModel

    // obtem a classe que representa o tipo de coluna
    public Class getColumnClass(int column) throws IllegalStateException {
        // assegura que o banco de dados conexao estah disponivel
        if (!conectado) {
            throw new IllegalStateException("Ocorreu um erro ao acessar o banco de dados.");
        }

        // determina a classe Java de coluna
        try {
            String className = metaData.getColumnClassName(column + 1);

            // retorna objeto Class que representa className
            return Class.forName(className);
        } // fim do try
        catch (Exception exception) {
            exception.printStackTrace();
        } // fim do catch

        return Object.class; // se ocorrerem os problemas acima, assume tipo Object
    } // fim do metodo getColumnClass

    // obtem numero de colunas em ResultSet
    public int getColumnCount() throws IllegalStateException {
        // assegura que o banco de dados conexao estah disponivel
        if (!conectado) {
            throw new IllegalStateException("Ocorreu um erro ao acessar o banco de dados.");
        }

        // determina numero de colunas
        try {
            return metaData.getColumnCount();
        } // fim do try
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        } // fim do catch

        return 0; // se ocorrerem os problemas acima, retorna 0 para o numero de colunas
    } // fim do metodo getColumnCount 

    // obtem nome de uma coluna particular em ResultSet
    public String getColumnName(int column) throws IllegalStateException {
        // assegura que o banco de dados conexao estah disponivel
        if (!conectado) {
            throw new IllegalStateException("Ocorreu um erro ao acessar o banco de dados.");
        }

        // determina o nome de coluna
        try {
            String nome = metaData.getColumnName(column + 1).replace("categoria_ID", "ID").replace("cliente_ID", "ID").replace("compra_ID", "ID").replace("fornecedor_ID", "ID").replace("itens_compra_ID", "ID").replace("itens_venda_ID", "ID").replace("pessoa_ID", "ID").replace("produto_ID", "ID").replace("venda_ID", "ID").replace("_", " ").toUpperCase();
            return nome;
        } // fim do try
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        } // fim do catch

        return ""; // se ocorrerem problemas, retorna string vazia para nome de coluna
    } // fim do metodo getColumnName

    // retorna numero de linhas em ResultSet
    public int getRowCount() throws IllegalStateException {
        // assegura que o banco de dados conexao estah disponivel
        if (!conectado) {
            throw new IllegalStateException("Ocorreu um erro ao acessar o banco de dados.");
        }

        return numeroDeLinhas;
    } // fim do metodo getRowCount

    // obtem valor na linha e coluna particular
    public Object getValueAt(int row, int column)
            throws IllegalStateException {
        // assegura que o banco de dados conexao estah disponivel
        if (!conectado) {
            throw new IllegalStateException("Ocorreu um erro ao acessar o banco de dados.");
        }

        // obtem um valor na linha e coluna de ResultSet especificada
        try {
            resultSet.absolute(row + 1);
            return resultSet.getObject(column + 1);
        } // fim do try
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        } // fim do catch

        return ""; // se ocorrerem problemas, retorna objeto string vazio
    } // fim do metodo getValueAt

    // configura nova string de consulta de banco de dados
    public void setQuery(String query)
            throws SQLException, IllegalStateException {
        // assegura que o banco de dados conexao estah disponivel
        if (!conectado) {
            throw new IllegalStateException("Ocorreu um erro ao acessar o banco de dados.");
        }

        // especifica consulta e a executa
        resultSet = statement.executeQuery(query);

        // obtem metadados para ResultSet
        metaData = resultSet.getMetaData();

        // determina o numero de linhas em ResultSet
        resultSet.last();                    // move para a ultima linha
        numeroDeLinhas = resultSet.getRow(); // obtem numero de linha

        // notifica a JTable de que modelo foi alterado
        fireTableStructureChanged();
    } // fim do metodo setQuery 

    // fecha Statement e Connection
    public void disconnectFromDatabase() {
        if (!conectado) {
            return;
        }

        // fecha Statement e Connection
        try {
            statement.close();
            connection.close();
        } // fim do try
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        } // fim do catch
        finally { // atualiza status de conexao de banco de dados
            conectado = false;
        } // fim do finally
    } // fim do metodo disconnectFromDatabase
} // fim da classe ResultSetTableModel
