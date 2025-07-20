package com.cognizant.loan;

public class Loan {
    private String number;
    private double amount;
    private double emi;

    public Loan(String number, double amount, double emi) {
        this.number = number;
        this.amount = amount;
        this.emi = emi;
    }

    public String getNumber() {
        return number;
    }

    public double getAmount() {
        return amount;
    }

    public double getEmi() {
        return emi;
    }
}
