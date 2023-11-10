
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nilai, rangking;
        IUjianMasuk polinema = new PtVokasi("Politeknik Negeri Malang");
        IUjianMasuk ui = new PtAkademik("Universitas Indonesia");

        // Membuat objek Mahasiswa
        Mahasiswa budi = new Mahasiswa("Budi", "123456");
        Mahasiswa toni = new Mahasiswa("Toni", "789012");


        System.out.println("Perguruan Tinggi Vokasi");
        polinema.lakukanUjian(budi);
        System.out.print("Masukkan nilai ujian  : ");
        nilai = sc.nextInt();
        System.out.print("Rangking : ");
        rangking = sc.nextInt();
        polinema.hasil(nilai,rangking);

        System.out.println();

        System.out.println("Perguruan Tinggi Akademik");
        ui.lakukanUjian(toni);
        System.out.print("Masukkan nilai ujian  : ");
        nilai = sc.nextInt();
        System.out.print("Rangking : ");
        rangking = sc.nextInt();
        ui.hasil(nilai,rangking);            
    }
}
