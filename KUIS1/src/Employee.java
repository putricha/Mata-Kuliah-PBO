public class Employee {
    private String idEmployee, employeeName, address;
    private int age;


    public void setData(String idEmployee, String employeeName, int age, String address) {
        this.idEmployee = idEmployee;
        this.employeeName = employeeName;
        this.age = age;
        this.address = address;
    }

    public String getData() {
        String info = "";
        info += "ID Employee : " + idEmployee;
        info += "Employee name : " + employeeName;
        info += "Age : " + age;
        info += "Address : " + address;
        return info;
    }
    

}
