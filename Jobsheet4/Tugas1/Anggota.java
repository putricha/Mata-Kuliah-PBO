package Tugas1;

public class Anggota {
    private String idAnggota, nama, nim, prodi;

    Anggota() {
    }
    
    Anggota(String id, String nama, String nim, String prodi) {
        idAnggota = id;
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
    }
    
    public void setId(String id) {
        idAnggota = id;
    }

    public String getId() {
        return idAnggota;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNIM() {
        return nim;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public String getProdi() {
        return prodi;
    }

    public String toString() {
        String data = "";
        data += "Id Anggota  : " + idAnggota + "\n";
        data += "Nama        : " + nama +"\n";
        data += "NIM         : " + nim +"\n";
        data += "Prodi       : " + prodi+"\n";
        return data;
    }


    
}
