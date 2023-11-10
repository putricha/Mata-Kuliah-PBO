package Tugas;

public class Transactions {
    private double saldo;



    public double deposit(double jumlah) {
        saldo += jumlah;
        return saldo;
    }

    public double tarik(double jumlah) {
        saldo -= jumlah;
        return saldo;
    }
}
