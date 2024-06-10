package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexao {
    private static String USERNAME = "root";
    private static String PASSWORD = "";
    private static String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static String URL = "jdbc:mysql://localhost:3306/a3202401";
    public Connection conectar(){
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL,USERNAME,PASSWORD);
        }
        catch(SQLException e){
            throw new RuntimeException(e);
        }
        catch(ClassNotFoundException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    public static void main(String[] args) throws SQLException {
        Connection Conexao = new conexao().conectar();
        System.out.println("Conexao estabelecida");
        Conexao.close();
        
    }
}
