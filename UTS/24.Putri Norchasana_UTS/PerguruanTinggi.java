

public abstract class PerguruanTinggi {
    private String nama;
    private String jenis;

    public PerguruanTinggi(String nama, String jenis) {
        this.nama = nama;
        this.jenis = jenis;
    }

    public String getNama() {
        return nama;
    }

    public String getJenis() {
        return jenis;
    }

    public abstract void info();
}
