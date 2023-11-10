public class Laptop {
    private String merek;
    private int RAM, ROM;

    public void setMerk(String newValue) {
        merek = newValue;
    }

    public void setRAM(int newValue) {
        RAM = newValue;
    }
    
    public void setROM(int newValue) {
        ROM = newValue;
    }

    public void upgradeRAM(int newValue) {
        RAM += newValue;
    }
    public void upgradeROM(int newValue) {
        ROM += newValue;
    }

    public void cetakStatus() {
        System.out.println("Merek :" + merek);
        System.out.println("RAM : " + RAM+ " GB");
        System.out.println("ROM : " + ROM + " GB");
    }
}
