/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Database.DatabaseConnection; 
import java.sql.*; 
import java.util.ArrayList; 
import java.util.List; 

/**
 *
 * @author rasyi
 */

//Perintah Sql Untuk Nantinya Dapat Melakukan CRUD

public class agendaDAO {
        // 🟢 Ambil semua data agenda
    public List<agenda> getAllAgenda() throws SQLException {
        List<agenda> list = new ArrayList<>();
        String sql = "SELECT * FROM agenda ORDER BY tanggal, waktu";

        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                list.add(new agenda(
                        rs.getInt("id"),
                        rs.getString("tanggal"),
                        rs.getString("waktu"),
                        rs.getString("kegiatan"),
                        rs.getString("keterangan")
                ));
            }
        }
        return list;
    }

    // 🟡 Tambah data agenda baru
    public void addAgenda(agenda data) throws SQLException {
        String sql = "INSERT INTO agenda (tanggal, waktu, kegiatan, keterangan) VALUES (?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, data.getTanggal());
            pstmt.setString(2, data.getWaktu());
            pstmt.setString(3, data.getKegiatan());
            pstmt.setString(4, data.getKeterangan());
            pstmt.executeUpdate();
        }
    }


    // 🟠 Update data agenda berdasarkan ID
    public void updateAgenda(agenda data) throws SQLException {
        String sql = "UPDATE agenda SET tanggal=?, waktu=?, kegiatan=?, keterangan=? WHERE id=?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, data.getTanggal());
            pstmt.setString(2, data.getWaktu());
            pstmt.setString(3, data.getKegiatan());
            pstmt.setString(4, data.getKeterangan());
            pstmt.setInt(5, data.getId());
            pstmt.executeUpdate();
        }
    }

    // 🔴 Hapus data agenda berdasarkan ID
    public void deleteAgenda(int id) throws SQLException {
        String sql = "DELETE FROM agenda WHERE id=?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        }
    }
}
