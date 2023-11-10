package Soal;

public class SegitigaSamaKaki extends BangunDatar {
    public double hitungLuasSegitigaSamaKaki(double alas, double tinggi) {
        return hitungLuasSegitiga(alas, tinggi); // Menggunakan metode dari kelas BangunDatar
    }

    public double hitungKelilingSegitigaSamaKaki(double alas) {
        double sisiMiring = Math.sqrt((alas * alas) + (alas * alas)); // Sisi miring segitiga sama kaki
        return hitungKelilingSegitiga(alas, sisiMiring); // Menggunakan metode dari kelas BangunDatar
    }
    
}
