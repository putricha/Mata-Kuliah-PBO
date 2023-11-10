public class Manusia {
    private String nama, alamat;
    private int umur;

    public void setNama(String newValue) {
        nama = newValue;
    }

    public void setAlamat(String newValue) {
        alamat = newValue;
    }

    public void setUmur(int newValue) {
        umur = newValue;
    }

    public void cetakStatus() {
        System.out.println("Nama : " + nama);
        System.out.println("Umur : " + umur);
        System.out.println("Alamat : " + alamat);
    }
}
