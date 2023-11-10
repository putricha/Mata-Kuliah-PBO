public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nim = 101;
        mhs1.nama = "Lestari";
        mhs1.alamat = "Jl Vinolia No 1A";
        mhs1.kelas = "1A";
        mhs1.tampilBiodata();
        System.out.println();

        Mahasiswa mhs2 = new Mahasiswa();
        mhs1.nim = 101;
        mhs1.nama = "Amira";
        mhs1.alamat = "Jl Mawar No 1A";
        mhs1.kelas = "1B";
        mhs1.tampilBiodata();
        System.out.println();

        Mahasiswa mhs3 = new Mahasiswa();
        mhs1.nim = 101;
        mhs1.nama = "Aisya";
        mhs1.alamat = "Jl Melati no 13B";
        mhs1.kelas = "1d";
        mhs1.tampilBiodata();
        
    }
}
