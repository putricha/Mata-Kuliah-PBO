

public class PtVokasi extends PerguruanTinggi implements IUjianMasuk {

    public PtVokasi(String nama) {
        super(nama, "Vokasi");
    }
    public void info() {
        System.out.println("Nama Perguruan Tinggi : " + super.getNama());
        System.out.println("Jenis Perguruan Tinggi : " + super.getJenis());
        System.out.println("Jenis Ujian : Ujian Komputer" );
    }
    public void lakukanUjian(Mahasiswa mahasiswa) {
        System.out.println(mahasiswa.getNama()+" mengikuti ujian komputer Politeknik Negeri Malang");
    }
    public boolean statusDiterima(int nilai, int rangking) {
        boolean hasil;
        if (nilai >= 80 && rangking <=72) {
            hasil = true;
        } else {
            hasil = false;
        }
        return hasil;
    }
    
    public void hasil(int nilai, int rangking) {
        if (statusDiterima(nilai, rangking)) {
            System.out.println("Selamat anda diterima di Perguruan Tinggi Vokasi Politeknik Negeri Malang");
        } else {
            System.out.println("Mohon maaf anda tidak diterima");
        }
    }
}
