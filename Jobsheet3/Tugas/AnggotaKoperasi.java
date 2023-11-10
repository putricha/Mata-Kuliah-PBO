package Tugas;

public class AnggotaKoperasi {
    String noKTP, nama;
    float limitPinjaman, jumlahPinjaman;

    AnggotaKoperasi(String ktp, String nama, float limitPinjam) {
        this.noKTP = ktp;
        this.nama = nama;
        this.limitPinjaman = limitPinjam;
    }

    public String getNama() {
        return nama;
    }

    public float getLimitPinjaman() {
        return limitPinjaman;
    }

    public float getJumlahPinjaman() {

        return jumlahPinjaman;
    }

    public void pinjam(float uang) {
        if (uang > limitPinjaman) {
            System.out.println("Maaf, jumlah peminjaman melebihi limit.");
        } else {

            jumlahPinjaman += uang;
        }
    }

    public void angsur(float uang) {
        if (jumlahPinjaman == 0) {
                        System.out.println("Anda tidak memiliki hutang");
        }else if (uang > jumlahPinjaman) {
            System.out.println("Kembalian : " + (uang - jumlahPinjaman));
            jumlahPinjaman = 0;
        } else if (jumlahPinjaman != 0 && uang>(0.1*jumlahPinjaman)) {
            jumlahPinjaman -= uang;
        } else {
            System.out.println("Maaf angsuran harus 10% dari jumlah pinjaman");
        }
    }
}
