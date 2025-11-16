package Model;

public class agenda {
    private int id;
    private String tanggal;   // format: YYYY-MM-DD
    private String waktu;     // format: HH:mm
    private String kegiatan;
    private String keterangan;    

    public agenda(int id, String tanggal, String waktu, String kegiatan, String keterangan) {
        this.id = id;
        this.tanggal = tanggal;
        this.waktu = waktu;
        this.kegiatan = kegiatan;
        this.keterangan = keterangan;
    }
//    Membuat Konstruktor Dan Getter Setter 
    
    // Getters dan Setters
    public int getId() { 
        return id; 
    }
    public void setId(int id) { 
        this.id = id; 
    }

    public String getTanggal() { 
        return tanggal; 
    }
    public void setTanggal(String tanggal) { 
        this.tanggal = tanggal; 
    }

    public String getWaktu() { 
        return waktu; 
    }
    public void setWaktu(String waktu) { 
        this.waktu = waktu; 
    }

    public String getKegiatan() { 
        return kegiatan; 
    }
    public void setKegiatan(String kegiatan) { 
        this.kegiatan = kegiatan; 
    }
    
    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }
}
