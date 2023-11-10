public class Sepatu {
    String merek, warna;
    int ukuran;

    public void setMerek(String newValue) {
        merek = newValue;

    }

    public void setWarna(String newValue) {
        warna = newValue;
    }

    public void setUkuran(int newValue) {
        ukuran = newValue;
    }

    public void cetakStatus() {
        System.out.println("Merek sepatu : " + merek);
        System.out.println("Warna : "+ warna);
        System.out.println("Ukuran  : "+ ukuran);
    }
}
