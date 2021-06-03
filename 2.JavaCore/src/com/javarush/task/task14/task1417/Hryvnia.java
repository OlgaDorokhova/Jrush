package com.javarush.task.task14.task1417;

public class Hryvnia extends Money{

    private double amount;

    public Hryvnia(double amount) {
        super(amount);
        this.amount = amount;
    }

    @Override
    public String getCurrencyName() {
        return "UAH";
    }
}
