package OKE;
public class Main {
    public static void main(String[] args) {
        // Membuat objek PerguruanTinggi
        PerguruanTinggi polinema = new Polinema();
        PerguruanTinggi universitasIndonesia = new UniversitasIndonesia();

        // Membuat objek Mahasiswa
        Mahasiswa budi = new Mahasiswa("Budi", 123456, polinema);
        Mahasiswa toni = new Mahasiswa("Toni", 789012, universitasIndonesia);

        // Melakukan ujian masuk
        UjianMasuk ujianMasuk = new UjianMasuk();
        ujianMasuk.lakukanUjian(budi);
        ujianMasuk.lakukanUjian(toni);

        // Pengumuman penerimaan
        if (budi.isDiterima()) {
            System.out.println(budi.getNama() + " diterima di " + polinema.getNama() + " (" + polinema.getJenis() + ")");
        } else {
            System.out.println(budi.getNama() + " tidak diterima di " + polinema.getNama());
        }

        if (toni.isDiterima()) {
            System.out.println(toni.getNama() + " diterima di " + universitasIndonesia.getNama() + " (" + universitasIndonesia.getJenis() + ")");
        } else {
            System.out.println(toni.getNama() + " tidak diterima di " + universitasIndonesia.getNama());
        }
    }
}
