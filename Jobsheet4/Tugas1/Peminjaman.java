package Tugas1;

public class Peminjaman {
    private String tglPinjam, bulan, tahun;

    //Dependency class lain sebagai parameter
    public void pinjam(String tglPinjam, String bulan, String tahun, Anggota anggota, Buku buku) {
        this.tglPinjam = tglPinjam;
        this.bulan = bulan;
        this.tahun = tahun;
        System.out.println("=================================");
        System.out.println(" PEMINJAMAN PERPUSTAKAAN MELATI  ");
        System.out.println("=================================");
        System.out.println("");
        System.out.println(anggota.toString());
        System.out.println("Detail buku yang dipinjam");
        System.out.println(buku.toString());
    }
}
