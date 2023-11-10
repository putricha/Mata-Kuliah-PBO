

public class PtAkademik extends PerguruanTinggi implements IUjianMasuk {

    public PtAkademik(String nama) {
        super(nama, "Akademik");
    }

    public void info() {
        System.out.println("Nama Perguruan Tinggi : " + super.getNama());
        System.out.println("Jenis Perguruan Tinggi : " + super.getJenis());
        System.out.println("Jenis Ujian : Ujian Tulis");
    }

    public void lakukanUjian(Mahasiswa mhs) {
        System.out.println(mhs.getNama() + " mengikuti ujian tulis  Universitas Indonesia");
    }

    public boolean statusDiterima(int nilai, int rangking) {
        boolean hasil;
        if (nilai >= 80 && rangking <=30) {
            hasil = true;
        } else {
            hasil = false;
        }
        return hasil;
    }

    public void hasil(int nilai, int rangking) {
        if (statusDiterima(nilai,rangking)) {
            System.out.println("Selamat anda diterima di Perguruan Tinggi Akademik Universitas Indonesia");
        } else {
            System.out.println("Mohon maaf anda tidak diterima");
        }
    }
}
