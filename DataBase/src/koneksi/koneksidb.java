/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;

import com.mysql.cj.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Faw
 */
public class koneksidb {
    public static Connection koneksi;
    
    public static Connection getConnection()throws SQLException {
        if (koneksi == null) {
            new Driver();
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/database_baru","root","12345");
        }
        return koneksi;
    }
}