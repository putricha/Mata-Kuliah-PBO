package tugas;
public class Lingkarang {
    public double r;

    public double hitungKeliling() {
        double keliling = Math.PI * (2 * r);
        return keliling;
    }

    public double hitungLuas() {
        double luas = Math.PI * Math.pow(r, 2);
        return luas;
    }

    public void cetakHasil() {
        System.out.println("================================");
        System.out.println("    HITUNG KELILING DAN LUAS    ");
        System.out.println("================================");
        System.out.println("Keliling : " + hitungKeliling());
        System.out.println("Luas   : " + hitungLuas());
        System.out.println();
    }
}
