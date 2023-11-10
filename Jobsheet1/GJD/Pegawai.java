public class Pegawai {
    private String name, address;
    private int old;

    public void setNama(String newValue) {
        name = newValue;
    }

    public void setUmur(int newValue) {
        old = newValue;
    }

    public void setAlamat(String newValue) {
        address = newValue;
    }

    public void cetakStatus() {
        System.out.println("Nama : " + name);
        System.out.println("Umur : "+ old);
        System.out.println("Alamat : " + address);
    }
}
