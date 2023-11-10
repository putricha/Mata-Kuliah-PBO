public class PegawaiDemo {
    public static void main (String[] args) {

        //Menambahkan objek pegawai
        Pegawai pgw1 = new Pegawai();
        Pegawai pgw2 = new Pegawai();
        PegawaiKontrak pgw3 = new PegawaiKontrak();

        pgw1.setNama("Sella");
        pgw1.setUmur(20);
        pgw1.setAlamat("Jakarta");
        pgw1.cetakStatus();
        System.out.println();

        pgw2.setNama("Dilla");
        pgw2.setUmur(22);
        pgw2.setAlamat("Surabaya");
        pgw2.cetakStatus();
        System.out.println();

        pgw3.setNama("Vera");
        pgw3.setUmur(20);
        pgw3.setAlamat("Jakarta");
        pgw3.setSalary(5000000);
        pgw3.cetakStatus();
        

    }
}
