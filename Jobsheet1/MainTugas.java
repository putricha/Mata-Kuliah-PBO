public class MainTugas {
    public static void main(String[] args) {
        AC ac2 = new AC();
        Setrika setrika1 = new Setrika();
        Sepatu spt = new Sepatu();
        SepatuRoda sptroda = new SepatuRoda();
        Manusia mns = new Manusia();
        Mahasiswa mhs = new Mahasiswa();

        ac2.setMerek("Polytron");
        ac2.setWarna("Putih");
        ac2.setTegangan(200);
        ac2.setSuhu(18);
        ac2.kurangiSuhu(2);
        ac2.cetakStatus();

        System.out.println();
        setrika1.setMerek("Phillips");
        setrika1.setWarna("Ungu");
        setrika1.setTegangan(200);
        setrika1.setSuhu(80);
        setrika1.kurangiSuhu(2);
        setrika1.cetakStatus();

        System.out.println();
        spt.setMerek("Adidas");
        spt.setUkuran(40);
        spt.setWarna("Hitam");
        spt.cetakStatus();

        System.out.println();
        sptroda.setMerek("Yolo");
        sptroda.setUkuran(39);
        sptroda.setWarna("Pink");
        sptroda.setRoda(4);
        sptroda.cetakStatus();

        System.out.println();
        mns.setNama("Adi");
        mns.setUmur(19);
        mns.setAlamat("Malang");
        mns.cetakStatus();

        System.out.println();
        mhs.setNama("Ida");
        mhs.setUmur(20);
        mhs.setAlamat("Malang");
        mhs.setNIM("2141720081");
        mhs.cetakStatus();

    }
}
