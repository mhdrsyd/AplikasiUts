/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.agenda;
import Model.agendaDAO;
import java.util.List;
import java.sql.SQLException;

/**
 *
 * @author rasyi
 */
/**
 * Controller untuk mengatur interaksi antara View (GUI) dan Model (agenda + agendaDAO)
 */
public class agendaController {
    private agendaDAO agendaDao;

    public agendaController() {
        agendaDao = new agendaDAO();
    }

    // 🔵 Mengambil semua data agenda
    public List<agenda> getAllAgenda() throws SQLException {
        return agendaDao.getAllAgenda();
    }

    // 🟢 Menambah agenda baru
    public void addAgenda(String tanggal, String waktu, String kegiatan, String status) throws SQLException {
        agenda a = new agenda(0, tanggal, waktu, kegiatan, status);
        agendaDao.addAgenda(a);
    }

    // 🟠 Memperbarui agenda berdasarkan ID
    public void updateAgenda(int id, String tanggal, String waktu, String kegiatan, String status) throws SQLException {
        agenda a = new agenda(id, tanggal, waktu, kegiatan, status);
        agendaDao.updateAgenda(a);
    }

    // 🔴 Menghapus agenda berdasarkan ID
    public void deleteAgenda(int id) throws SQLException {
        agendaDao.deleteAgenda(id);
    }

}
