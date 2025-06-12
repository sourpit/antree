/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectkel3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ASUS TUF
 */
public class Konfig {

   private static Connection MySQLConfiq;
    public static Connection configDB()throws SQLException{
        try{
            String url="jdbc:mysql://localhost:3306/andhika_1trka";
            String user="root";
            String pass="";
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            MySQLConfiq=DriverManager.getConnection(url,user,pass);
        }catch (SQLException e){
    System.err.println("koneksi gagal: "+e.getMessage());
}
    
    return MySQLConfiq;
}
}
