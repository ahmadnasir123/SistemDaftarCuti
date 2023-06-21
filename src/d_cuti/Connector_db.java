/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package d_cuti;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Ahmad Nasir

 */
public class Connector_db {
    private static java.sql.Connection connector;
    
    public static java.sql.Connection getKoneksi(){
        if (connector == null){
            try {
                String url = "jdbc:mysql://localhost:3306/database_dcuti";
                String user = "root";
                String password = "";
                connector = DriverManager.getConnection(url, user, password);
                System.out.println("Berhasil Terhubung ke database local");
            } catch (SQLException e) {
                System.out.println("Error : Gagal koneksi ke database");
                System.exit(1);
            }
        }
        return connector;
    }
    public static void main(String args[]){
        getKoneksi();
    }   
}
