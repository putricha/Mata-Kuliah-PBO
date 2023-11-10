package Soal;

public class Lingkaran extends BangunDatar {
    // Override metode hitungKelilingLingkaran
    @Override
    public double hitungKelilingLingkaran(double r) {
        // Implementasi khusus untuk menghitung keliling lingkaran
        double keliling = 2 * Math.PI * r;
        return keliling;
    }

    // Override metode hitungLuasLingkaran
    // @Override
    public double hitungLuasLingkaran(double r) {
        // Implementasi khusus untuk menghitung luas lingkaran
        double luas = Math.PI * r * r;
        return luas;
    }
}