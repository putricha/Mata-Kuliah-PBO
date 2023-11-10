package Tugas;

public class MainOverriding {
    public static void main(String[] args) {
        Manusia manusia = new Manusia();
        manusia.bernafas();
        manusia.makan();

        Dosen dosen = new Dosen();
        dosen.makan();
        dosen.lembur();

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.makan();
        mahasiswa.tidur();

        
    }
}
