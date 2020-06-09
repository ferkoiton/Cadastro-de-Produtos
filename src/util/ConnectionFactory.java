/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.DriverManager; 
import java.sql.Connection; 
import java.sql.SQLException;

/**
 *
 * @author fernandotonooka
 */
public class ConnectionFactory {
        private static String driver;
        private static String url;
        private static String user;
        private static String password;

        public static Connection getConnectionMySQL() throws ClassNotFoundException, SQLException {
                driver = "com.mysql.jdbc.Driver";
                url = "jdbc:mysql://localhost/projeto_eng3";
                user = "root";
                password = "root";
                return getConnection();
        }
        
        private static Connection getConnection() throws ClassNotFoundException, SQLException {

		Class.forName(driver);
		Connection conn = DriverManager.getConnection( url, user, password );
		return conn;
	}
}