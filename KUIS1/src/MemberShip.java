public class MemberShip extends Customer{
    private String phoneNumber;
    private int point;


    MemberShip(String idCust, String custName, String phoneNumber, int point) {
        super(idCust, custName);
        this.phoneNumber = phoneNumber;
        this.point = point;
    }

    public String getData() {
        Customer cust = new Customer();
        String info = "";
        info += "ID Customer : " + cust.getIdCust();
        info += "Customer name : " + cust.getCustName(); 
        info += "Phone number : " + phoneNumber;
        info += "Point : " + point;    
        return info;
    }

}
