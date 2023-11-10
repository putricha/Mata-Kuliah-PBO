public class AC {
    String merek, warna;
    int tegangan,suhu;

    public void setMerek(String newValue) {
        merek = newValue;
    }

    public void setWarna(String newValue) {
        warna = newValue;
    }

    public void setTegangan(int newValue) {
        tegangan = newValue;
    }

    public void setSuhu(int newValue) {
        suhu = newValue;
    }

    public void tambahSuhu(int newValue) {
        suhu += newValue;
    }
    public void kurangiSuhu(int newValue) {
        suhu -= newValue;
    }

    public void cetakStatus() {
        System.out.println("Jenis elektronik : AC");
        System.out.println("Merek : " + merek);
        System.out.println("Warna : " + warna);
        System.out.println("Tegangan : " + tegangan);
        System.out.println("Suhu : " + suhu);
    }
}
