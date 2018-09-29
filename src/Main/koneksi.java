/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author rakas
 */
public class koneksi {

    private Connection koneksi;
    private Statement stm;

    public koneksi() {

    }

    public Connection getKoneksi() {
        if (koneksi == null) {
            String database = "billing";
            String username = "postgres";
            String password = "itsdevi27";
            try {
                koneksi = (Connection) DriverManager.getConnection("jdbc:postgresql://localhost:5432/"
                        + database, username, password);
                stm = koneksi.createStatement();
                System.out.println("koneksi berhasil");
            } catch (SQLException e) {
                e.printStackTrace();
                e.getMessage();
            }
        }
        return koneksi;
    }
    
    public void execute(String sql) throws SQLException {
        this.stm.executeUpdate(sql);
    }

    public ResultSet getResult(String sql) throws SQLException {
        return stm.executeQuery(sql);
    }
}
