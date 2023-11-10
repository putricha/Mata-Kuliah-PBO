package Percobaan1;
public class Processor {
    private String merk;
    private double cache;

    Processor() {

    }

    Processor(String merk, double cache) {
        this.merk = merk;
        this.cache = cache;
    }

    public void info() {
        System.out.printf("Merk Processor = %s\n", merk);
        System.out.printf("Cache Memory = %.2f\n", cache);
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getMerk() {
        return merk;
    }

    public void setCache(double cache) {
        this.cache = cache;
    }

    public double getCache() {
        return cache;
    }
}