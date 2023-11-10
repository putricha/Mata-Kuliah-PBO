package tugas;
public class Peminjam {
    public String id, nama, namaGame;
    public int harga,durasi, total;

    public void setData(String id, String nama, String namaGame, int harga, int durasi) {
        this.id = id;
        this.nama = nama;
        this.namaGame = namaGame;
        this.harga = harga;
        this.durasi = durasi;
    }

    public int hitungTotal() {
        return durasi * harga;
    }
    
    public void hasilPeminjaman(){
        System.out.println("|-------------------------------|");
        System.out.println("|        PEMINJAMAN GAME        |");
        System.out.println("|-------------------------------|");
        System.out.println("ID          : " + id);
        System.out.println("Nama        : " + nama);
        System.out.println("Nama game   : " + namaGame);
        System.out.println("Harga       : " + harga);
        System.out.println("Durasi      : " + durasi);
        System.out.println("Total       : " + hitungTotal());
    }
}
