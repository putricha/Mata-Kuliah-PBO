package Percobaan4;

public class MainPercobaan4 {
    public static void main(String[] args) {
        Penumpang p = new Penumpang("1234", "Mr. Krab");
        Gerbong gerbong = new Gerbong("A", 10);
        gerbong.setPenumpang(p, 1);
        System.out.println(gerbong.info());
        Penumpang budi = new Penumpang("4321", "Budi");
        gerbong.setPenumpang(budi, 1);


    }
}
