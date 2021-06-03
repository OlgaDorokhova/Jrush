package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {

    private static List <Horse> horses = new ArrayList<>();

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public static Hippodrome game;

    void run() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            Thread.sleep(200);
        }


    }
    public void move() {
        for (int i = 0; i < horses.size(); i++) {
            horses.get(i).move();
        }

    }
    public void print() {

        for (int i = 0; i < horses.size(); i++) {
            horses.get(i).print();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
                
    }

    public  Horse getWinner() {
        Horse winner = null;
        int max = 0;
        for (Horse HMaxDist : horses) {
            if (HMaxDist.getDistance() >= max) {
                max = (int) HMaxDist.getDistance();
                winner = HMaxDist;
            }
        }
    return winner;
    }

    public void printWinner() {
        System.out.println("Winner is " + getWinner().name + "!");
    }


    public static void main(String[] args) throws InterruptedException {

        game = new Hippodrome(horses);

        horses.add(new Horse("Horse1", 3, 0));
        horses.add(new Horse("Horse2", 3, 0));
        horses.add(new Horse("Horse3", 3, 0));

        game.run();
        game.printWinner();
}
}
