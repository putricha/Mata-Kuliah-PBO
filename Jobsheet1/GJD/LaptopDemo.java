public class LaptopDemo {
    public static void main(String[] args) {
        //Membuat objek
        Laptop ltp1 = new Laptop();
        LaptopSO ltp2 = new LaptopSO();

        ltp1.setMerk("Lenovo");
        ltp1.setRAM(8);
        ltp1.setROM(512);
        ltp1.upgradeRAM(8);
        ltp1.cetakStatus();
        System.out.println();

        ltp2.setMerk("ASUS");
        ltp2.setRAM(16);
        ltp2.setROM(1000);
        ltp2.setSO("Microsoft Windows");
        ltp2.cetakStatus();
    }
}
