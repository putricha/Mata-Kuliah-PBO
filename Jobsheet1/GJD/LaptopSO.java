public class LaptopSO extends Laptop {
    String jenisSO;

    public void setSO(String newValue) {
        jenisSO = newValue;
    }

    public void cetakStatus() {
        super.cetakStatus();
        System.out.println("Jenis SO : " + jenisSO);
    }
}
