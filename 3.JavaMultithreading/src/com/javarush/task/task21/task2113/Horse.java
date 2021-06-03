package com.javarush.task.task21.task2113;

import java.util.Arrays;

public class Horse {
    String name;
    double speed;
    double distance;

    public Horse(String name, double speed, double distance) {
        this.name = name;
        this.speed = speed;
        this.distance = distance;
    }

    public void move() {

        distance += Math.random() * speed;
    }

    public void print() {
        int count = (int) distance;       //заполнение отображения дистанции точками
        char[] chars = new char[count];
        Arrays.fill(chars, '.');
        System.out.println( new String(chars) + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}
