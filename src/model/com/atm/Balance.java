package model.com.atm;

public class Balance {
    protected double balance;
    protected double toAdjust;

    protected double withdraw(double toAdjust) {
        balance = balance - toAdjust;
        return balance;
    }

    protected double deposit(double toAdjust) {
        balance = balance + toAdjust;
        return balance;
    }
}
