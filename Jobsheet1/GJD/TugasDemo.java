public class TugasDemo {
    public static void main(String[] args) {
        Setrika setrika1 = new Setrika();
        AC AC = new AC();
        Sepatu sepatu = new Sepatu();
        SepatuRoda sepatuRoda = new SepatuRoda();
        Manusia manusia = new Manusia();
        Mahasiswa mahasiswa = new Mahasiswa();

        setrika1.setMerek("Polytron");
        setrika1.setWarna("Hitam");
        setrika1.setTegangan(200);
        setrika1.setSuhu(-1);
        setrika1.cetakStatus();
        System.out.println();
        System.out.println();

        AC.setMerek("Daikin");
        AC.setWarna("Putih");
        AC.setTegangan(250);
        AC.setSuhu(20);
        AC.kurangiSuhu(4);
        AC.cetakStatus();
        System.out.println();

        sepatu.setMerek("Adidas");
        sepatu.setWarna("Hitam");
        sepatu.setUkuran(40);
        sepatu.cetakStatus();
        System.out.println();

        sepatuRoda.setMerek("YOYIC");
        sepatuRoda.setWarna("Biru");
        sepatuRoda.setUkuran(38);
        sepatuRoda.setRoda(4);
        sepatuRoda.cetakStatus();
        System.out.println();

        manusia.setNama("Ludvita");
        manusia.setUmur(19);
        manusia.setAlamat("Malang");
        manusia.cetakStatus();
        System.out.println();

        mahasiswa.setNama("Putri");
        mahasiswa.setUmur(19);
        mahasiswa.setAlamat("Malang");
        mahasiswa.setNIM("2241720036");
        mahasiswa.cetakStatus();
        System.out.println();

    }
}
