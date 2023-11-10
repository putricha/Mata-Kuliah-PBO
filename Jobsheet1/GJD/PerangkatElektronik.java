public class PerangkatElektronik {
    private String merek,warna;
    private int tegangan;


    public void setMerek(String newValue) {
        merek = newValue;
    }

    public void setWarna(String newValue) {
        warna = newValue;
    }

    public void setTegangan(int newValue) {
        tegangan = newValue;
    }

    public void cetakStatus() {
        System.out.println("Merek : " + merek);
        System.out.println("Warna : " + warna);
        System.out.println("Tegangan : "+ tegangan);
    }
}
