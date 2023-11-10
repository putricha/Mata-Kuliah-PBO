package Tugas;

public class Address {
    private String jalan, kota, kodePos;

    Address() {
        
    }
    Address(String jalan, String kota, String kodePos) {
        this.jalan = jalan;
        this.kota = kota;
        this.kodePos = kodePos;
    }

    public String getJalan() {
        return jalan;
    }
    public String getKota() {
        return kota;
    }
    public String getKodePos() {
        return kodePos;
    }
    
    
}
