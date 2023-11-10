public class Cashier extends Employee {
    private double salaryPerHurs;
    private int workHours;
    
    public void cetakStatus() {
        super.getData();
        System.out.println("Salary per hours : " + salaryPerHurs);
        System.out.println("Work hours       : " + workHours);
        System.out.println("Salary           : " + calculateSalary());
    }

    public double calculateSalary() {
        return salaryPerHurs * workHours;
    }

}
