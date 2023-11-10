public class Mahasiswa  extends Manusia{
    String NIM;

    public void setNIM(String newValue) {
        NIM = newValue;
    }

    public void cetakStatus() {
        super.cetakStatus();
        System.out.println("NIM  : "+NIM);
    }
}
