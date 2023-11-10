package Latihan;

public class PerkalianKu2 {
    void perkalian(int a, int b) {
        System.out.println(a * b);
    }

    void perkalian(double a, double b) {
        System.out.println(a * b);
    }

    public static void main(String[] args) {
        PerkalianKu objek = new PerkalianKu();
        objek.perkalian(25, 43);
        objek.perkalian(34, 23, 56);
    }
}

// 4.3 Dari source coding diatas terletak dimanakah overloading?
// di method perkalian



// 4.4 Jika terdapat overloading ada berapa tipe parameter yang berbeda?
// 2
