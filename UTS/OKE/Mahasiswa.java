package OKE;
public class Mahasiswa {
    private String nama;
    private int noUjian;
    private PerguruanTinggi ptn;

    private boolean diterima;

    public Mahasiswa(String nama, int noUjian, PerguruanTinggi PTN) {
        this.nama = nama;
        this.noUjian = noUjian;
        this.diterima = false;
        this.ptn = PTN;
        
    }

    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public int getNoUjian() {
        return noUjian;
    }

    public boolean isDiterima() {
        return diterima;
    }

    public void setDiterima(boolean diterima) {
        this.diterima = diterima;
    }

    public PerguruanTinggi getPTN() {
        return ptn;
    }
}
