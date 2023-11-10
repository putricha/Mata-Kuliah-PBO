package Soal;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("SEGITIGA");
        SegitigaSamaKaki segitiga = new SegitigaSamaKaki();
        System.out.println("Luas :" + segitiga.hitungLuasSegitiga(8, 10));
        System.out.println("Keliling :" + segitiga.hitungKelilingSegitiga(8, 10));
        
        System.out.println("PERSEGI PANJANG");
        PersegiPanjang persegi = new PersegiPanjang();
        System.out.println("Luas :" +persegi.hitungLuasPersegiPanjang(10, 5));
        System.out.println("Keliling : " + persegi.hitungKelilingPersegiPsnjsng(10, 7));
        

        System.out.println("LINGKARAN");
        Lingkaran lingkaran = new Lingkaran();
        System.out.println("Luas : " + lingkaran.hitungLuasLingkaran(14));
        System.out.println("Keliling : " + lingkaran.hitungKelilingLingkaran(14));

    }
}
