public class PegawaiKontrak  extends Pegawai{
    private double salary;

    public void setSalary(double newValue) {
        salary = newValue;
    }

    public void cetakStatus() {
        super.cetakStatus();
        System.out.println("Jenis pegawai : Pegawai kontrak");
        System.out.println("Gaji : " + salary);
    }
}
