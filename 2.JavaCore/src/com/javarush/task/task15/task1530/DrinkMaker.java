package com.javarush.task.task15.task1530;

public abstract class DrinkMaker {
    public void makeDrink() {
        getRightCup();
        putIngredient();
        pour();
    }
    abstract void getRightCup();
    abstract void putIngredient();
    abstract void pour();
}
