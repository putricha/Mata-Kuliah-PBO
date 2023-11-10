package Tugas;

public class BankAccount {
    //Depen
    private Person pemilik;
    private double saldo;

    //Dependency parameter
    public void setPemilik(Person pemilik) {
        this.pemilik = pemilik;
    }

    public void setSaldo(double Saldo) {
        this.saldo = saldo;
    }
    
    public Person getPemilik() {
        //Dependency return value
        return pemilik;
    }

    public double getSaldo() {
        Transactions transaksi = new Transactions();
        
        return saldo;
    }

    public double deposit(double jumlah) {
        saldo += jumlah;
        return saldo;
    }

    public double tarik(double jumlah) {
        saldo -= jumlah;
        return saldo;
    }


}
