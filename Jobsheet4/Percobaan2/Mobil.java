package Percobaan2;

public class Mobil {
    private String merk;
    private int biaya;

    Mobil() {

    }
    
    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getMerk() {
        return merk;
    }

    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }

    public int getBiaya() {
        return biaya;
    }

    public int hitungBiayMobil(int hari) {
        return biaya * hari;
    }
}
