package Tugas;

public class Person {
    private String nama;
    private int umur;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public int getUmur() {
        return umur;
    }

    //Depedency variabel lokal
    public void isiAlamat(String jalan, String kota, String kodePos) {
        Address address = new Address(jalan,kota,kodePos);
    }
}
