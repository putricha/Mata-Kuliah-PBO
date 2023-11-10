package tugas;
import java.util.*;

public class TestPeminjam {
    public static void main(String[] args) {
        Peminjam peminjam1 = new Peminjam();

        peminjam1.setData("A123", "Vera", "Monopoli", 5000, 3);
        peminjam1.hasilPeminjaman();
        System.out.println();
        Scanner sc = new Scanner(System.in);
        Peminjam peminjam2 = new Peminjam();
        System.out.println("|-------------------------------|");
        System.out.println("|        PEMINJAMAN GAME        |");
        System.out.println("|-------------------------------|");
        System.out.print("Masukkan ID         :");
        peminjam2.id = sc.next();
        System.out.print("Masukkan nama       :");
        peminjam2.nama = sc.next();
        System.out.print("Masukkan nama game  :");
        peminjam2.namaGame = sc.next();
        System.out.print("Masukkan harga      :");
        peminjam2.harga = sc.nextInt();
        System.out.print("Masukkan durasi     :");
        peminjam2.durasi = sc.nextInt();

        peminjam2.hasilPeminjaman();

    }
}
