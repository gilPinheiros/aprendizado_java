package br.com.sisvendas.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private static Connection conn = null;
    
    public static Connection getConnection() {
    	
    	if(conn == null) {
    		String usuarioBanco = "root";
    		String senhaBAnco = "";
    		String url = "jdbc:mysql://localhost/vendas";
    		try {
				conn = DriverManager.getConnection(url,usuarioBanco,senhaBAnco);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
		return conn;
    }
    
    public static void closeConnection(){
        if(conn != null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
