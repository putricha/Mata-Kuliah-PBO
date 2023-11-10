package Tugas;

import java.util.*;
public class TestKoperasi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AnggotaKoperasi donny = new AnggotaKoperasi("111333444", "Donny", 5000000);

        System.out.println("Nama Anggota : " + donny.getNama());
        System.out.println("Limit Pinjaman : " + donny.getLimitPinjaman());
        System.out.println("\nMeminjam uang 10.000.000");
        donny.pinjam(10000000);
        System.out.println("Jumlah pinjaman saat ini : " + donny.getJumlahPinjaman());
        
        System.out.println("\nMeminjam uang 4.000.000");
        donny.pinjam(4000000);
        System.out.println("Jumlah pinjaman saat ini : " + donny.getJumlahPinjaman());

        System.out.println("\nMembayar angsuran 1.000.000");
        donny.angsur(1000000);;
        System.out.println("Jumlah pinjaman saat ini : " + donny.getJumlahPinjaman());
        
        
        System.out.println("\nMembayar angsuran 3.000.000");
        donny.angsur(3000000);;
        System.out.println("Jumlah pinjaman saat ini : " + donny.getJumlahPinjaman());

        System.out.println("Masukkan jumlah pinjaman : ");
        float pinjam = sc.nextFloat();
        donny.pinjam(pinjam);
        System.out.println("Masukkan jumlah angsuran : ");
        float angsur = sc.nextFloat();
        donny.angsur(angsur);



    }
}
