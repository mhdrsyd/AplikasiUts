/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
/**
 *
 * @author rasyi
 */
public class DatabaseSetup {
    
public static void main(String[] args) {
String sql = "CREATE TABLE IF NOT EXISTS agenda ("
        + "id INTEGER PRIMARY KEY AUTOINCREMENT,"
        + "tanggal TEXT NOT NULL,"
        + "waktu TEXT NOT NULL,"
        + "kegiatan TEXT NOT NULL,"
        + "keterangan TEXT"
        + ");";

//Membuat Tabel Dalam Database (Menggunakan SqlLite)


try (Connection conn = DatabaseConnection.getConnection();
    Statement stmt = conn.createStatement()) {
    stmt.execute(sql);
    System.out.println("Tabel 'agenda' berhasil dibuat atau sudah ada.");
    } catch (SQLException e) {
        System.out.println("Error: " + e.getMessage());
        }
    }
}
