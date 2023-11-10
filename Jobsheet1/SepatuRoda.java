public class SepatuRoda extends Sepatu {
    int roda;

    public void setRoda(int newValue) {
        roda = newValue;
    }

    public void cetakStatus() {
        super.cetakStatus();
        System.out.println("Roda : " + roda);
    }
}
