package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao{

    private final String database = "sysend";
    private final String user = "root";
    private final String password = "";

    public Connection getConexao() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/" +database+ "?userSSL=false", user, password);

        } catch(SQLException ex) {
            System.out.println("Erro ao tentar se conectar");
            throw new RuntimeException(ex);
        }
    }
}