package tugas;
public class Barang {
    public String kode;
    public String namaBarang;
    public int hargaDasar;
    public float diskon;

    Barang(String kode, String nama, int harga, float diskon) {
        this.kode = kode;
        this.namaBarang = nama;
        this.hargaDasar = harga;
        this.diskon = diskon;
    }

    public float hitungHargaJual() {
        float hargaJual = hargaDasar - ((diskon/100) * hargaDasar);
        return hargaJual;
    }

    public void tampilData() {
        System.out.println("Kode barang : " + kode);
        System.out.println("Nama barang : " + namaBarang);
        System.out.println("Harga dasar : Rp." + hargaDasar);
        System.out.println("Diskon      : " + diskon+" %");
        System.out.println("Harga Jual  : Rp." + (int)hitungHargaJual());
    }
}
