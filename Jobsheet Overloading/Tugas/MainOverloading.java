package Tugas;

public class MainOverloading {
    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga();
        System.out.println("Sudut A = 45\nTotal sudut =" + segitiga.totalSudut(45));
        System.out.println("Sudut A = 60\nSudut B = 45\nTotal sudut = " + segitiga.totalSudut(60, 45));
        System.out.println("Keliling segitiga dengan sisi 10 dan 5 = "+        segitiga.keliling(10, 5));
        System.out.println("Keliling segitiga dengan sisi 15 , 10 dan 5 = "+        segitiga.keliling(15, 10,5));
    }
}
