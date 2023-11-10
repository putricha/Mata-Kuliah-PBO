package Tugas1;

public class Buku {
    private String kode, judul, penulis, tahunTerbit;

    Buku() {

    }
    
    Buku(String kode, String judul, String penulis, String tahunTerbit) {
        this.kode = kode;
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getKode() {
        return kode;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getJudul() {
        return judul;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setTahunTerbit(String tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public String getTahuString() {
        return tahunTerbit;
    }

    public String toString() {
        String info = "";
        info += "Kode          : " + kode + "\n";
        info += "Judul         : " + judul + "\n";
        info += "PenuliS       : " + penulis + "\n";
        info += "Tahun Terbit  : " + tahunTerbit + "\n";

        return info;
    }
}
