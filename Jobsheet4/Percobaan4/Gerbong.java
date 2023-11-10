package Percobaan4;

public class Gerbong {
    private String kode;
    private Kursi arrayKursi[];

    Gerbong(String kode, int jumlah) {
        this.kode = kode;
        this.arrayKursi = new Kursi[jumlah];
        this.initKursi();
    }

    private void initKursi() {
        for (int i = 0; i < arrayKursi.length; i++) {
            this.arrayKursi[i] = new Kursi(String.valueOf(i + 1));
        }
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getKode() {
        return kode;
    }

    public void setPenumpang(Penumpang penumpang, int nomor) {
        
        // this.arrayKursi[nomor-1].setPenumpang(penumpang);         


        //Setelah di modifikasi untuk soal no 5
        if (this.arrayKursi[nomor - 1].getPenumpang() == null) {
            this.arrayKursi[nomor-1].setPenumpang(penumpang);         
        } else {
            System.out.println("Kursi sudah terisi");
            System.out.println("Kode : " + kode);
            System.out.println(arrayKursi[nomor-1].info());
        }
    }

    public String info() {
        
        String info = "";
        info += "Kode : " + kode + "\n";
        for (Kursi kursi : arrayKursi) {
            info += kursi.info();
        }
        
        return info;
    }
}
