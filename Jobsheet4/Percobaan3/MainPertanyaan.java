package Percobaan3;

public class MainPertanyaan {
    public static void main(String[] args) {
        Pegawai masisnis = new Pegawai("1234", "Spongebob Squarepants");
        KeretaApi keretaApi = new KeretaApi("Gaya Baru", "Bisnis", masisnis);
        System.out.println(keretaApi.info());
    }
}
