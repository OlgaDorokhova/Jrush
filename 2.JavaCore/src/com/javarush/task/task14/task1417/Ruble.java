package com.javarush.task.task14.task1417;

public class Ruble extends Money {

    private double amount;

    public Ruble(double amount) {
        super(amount);
        this.amount = amount;
    }

    @Override
    public String getCurrencyName() {
        return "RUB";
    }
}
