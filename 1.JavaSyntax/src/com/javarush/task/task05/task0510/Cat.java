package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    String name = null;
    int age;
    int weight;
    String address = null;
    String color;

    public void initialize(String name) {
        this.name = name;
        age = 5;
        weight = 5;
        color = "blue";
    }

    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        color = "blue";
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 5;
        color = "blue";
    }

    public void initialize(int weight, String color) {
        age = 5;
        this.weight = weight;
        this.color = color;
    }

    public void initialize(int weight, String color, String address) {
        age = 5;
        this.weight = weight;
        this.color = color;
        this.address = address;
    }
    public static void main(String[] args) {

    }
}
