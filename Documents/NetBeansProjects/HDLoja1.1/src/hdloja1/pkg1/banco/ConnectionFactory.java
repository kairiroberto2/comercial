/**
 * J Planet 1.4.2 - http://ateoriadadesevolucao.blogspot.com/p/software-j-planet.html
 */

/*
 * ConnectionFactory.java
 *
 * Criado em 05/01/2020, 14:42:20
 */
package hdloja1.pkg1.banco;

// A classe a seguir conecta com o banco de dados
import hdloja1.pkg1.util.Constantes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConnectionFactory {

    public Connection getConnection() {
        try {
            return DriverManager.getConnection(Constantes.URL_BANCO, Constantes.NOME_USUARIO, Constantes.SENHA);
        } // fim do try
        catch (SQLException sQLException) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar com o banco de dados!\n"
                    + sQLException.getMessage());
            System.exit(1);

            throw new RuntimeException(sQLException);
        } // fim do catch
    } // fim do metodo getConnection
} // fim da classe ConnectionFactory
