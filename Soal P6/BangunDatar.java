package Soal;

public class BangunDatar {

    public float hitungLuasPersegi(float panjang, float lebar) {
        float luas = panjang * lebar;
        return luas;
    }

    public float hitungKelilingPersegiPsnjsng(float panjang, float lebar) {
        float keliling = 2 * (panjang + lebar);
        return keliling;
    }

    public double hitungKelilingLingkaran(double r) {
        double keliling = 2 * Math.PI * r;
        return keliling;
    }

    public double hitungLuasLingkaran(double r) {
        double luas = Math.PI * r * r;
        return luas;
    }

    public static double hitungLuasSegitiga(double alas, double tinggi) {
        double a = alas/2;
        double sisiMiring = Math.sqrt((a * a) + (tinggi * tinggi));
        return  0.5 * alas * tinggi;
    }

    public static double hitungKelilingSegitiga(double alas,double tinggi) {
        double a = alas/2;
        double sisiMiring = Math.sqrt((a * a) + (tinggi * tinggi));
        return (2 * sisiMiring) + alas; 
    }
}
