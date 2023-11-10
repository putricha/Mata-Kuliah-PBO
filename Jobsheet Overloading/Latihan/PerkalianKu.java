package Latihan;

public class PerkalianKu {
    void perkalian(int a, int b) {
        System.out.println(a * b);
    }

    void perkalian(int a, int b, int c) {
        System.out.println(a * b * c);
    }

    public static void main(String[] args) {
        PerkalianKu objek = new PerkalianKu();
        objek.perkalian(25, 43);
        objek.perkalian(34, 23, 56);
    }
}

// Soal
// 4.1 Dari source coding diatas terletak dimanakah overloading?
    // pada method perkalian 
// 4.2 Jika terdapat overloading ada berapa jumlah parameter yang berbeda?
    //2 method



