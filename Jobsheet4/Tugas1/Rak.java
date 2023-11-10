package Tugas1;

import java.util.*;
public class Rak {
    private String kodeRak, kategori;

    public void setKode(String kodeRak) {
        this.kodeRak = kodeRak;
    }

    public String getKode() {
        return kodeRak;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getKategori() {
        return kategori;
    }

    public static List<Buku> buku = new ArrayList<>();

    public void tambahBuku(String kode, String judul, String Penulis, String tahunTerbit) {
        //Depedency class A sebagai variabel lokal di class b
        Buku buku1 = new Buku(kode, judul, Penulis, tahunTerbit);
        buku.add(buku1);
    }

    public Buku getBuku(int idx) {
        //Depedency class lain sebagai return value di kelas ini
        Buku b = buku.get(idx);
        return b;
    }

    public void tampil() {
        System.out.println("=======================================");
        System.out.println("DAFTAR BUKU PERPUSTAKAAN MAWAR");
        System.out.println("=======================================");
        buku.stream().forEach(buku -> {
            System.out.println("" + buku.toString());
        });
    
    }
}
