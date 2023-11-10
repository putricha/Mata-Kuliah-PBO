package Tugas1;
import java.util.*;

public class OlahData {
    
    public static List<Anggota> member = new ArrayList<>();

    public void tambahAnggota(Anggota... anggota) {
        member.addAll(Arrays.asList(anggota));

    }

    public void tampil() {
        System.out.println("=======================================");
        System.out.println("DAFTAR ANGGOTA PERPUSTAKAAN MAWAR");
        System.out.println("=======================================");
        member.stream().forEach(anggota -> {
            System.out.println("" + anggota.toString());
        });
    }
    


    public static void main(String[] args) {
        OlahData odAnggota = new OlahData();
        Anggota a1 = new Anggota("001", "Putri", "2241720036", "D-IV TI");
        Anggota a2 = new Anggota("002", "Rizky", "2241720040", "D-IV TI");
        Anggota a3 = new Anggota("003", "Raffy", "2241720082", "D-IV TI");

        odAnggota.tambahAnggota(a1, a2, a3);
        odAnggota.tampil();

        Rak ral = new Rak();
        ral.tambahBuku("ADB","WD","DDD", "1232");
        ral.tambahBuku("bbp","Wgdhd","DDD", "12ss32");
        ral.tampil();

        Peminjaman peminjam = new Peminjaman();
        peminjam.pinjam("02", "Juli", "2023", a3, ral.getBuku(0));

    }
}
