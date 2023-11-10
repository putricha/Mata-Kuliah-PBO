package OKE;
public class UjianMasuk {
    public void lakukanUjian(Mahasiswa mahasiswa) {
        if (mahasiswa.getPTN() instanceof Polinema) {
            // Ujian komputer
            System.out.println(mahasiswa.getNama() + " mengikuti ujian komputer.");


        } else if (mahasiswa.getPTN() instanceof UniversitasIndonesia) {
            // Ujian tulis
            System.out.println(mahasiswa.getNama() + " mengikuti ujian tulis.");
        }
        // Melakukan penilaian dan passing grade
        if (nilaiUjian()) {
            mahasiswa.setDiterima(true);
        }
    }

    private boolean nilaiUjian() {
        // Logika penilaian
        return true;  // Misalnya, selalu diterima
    }
}
