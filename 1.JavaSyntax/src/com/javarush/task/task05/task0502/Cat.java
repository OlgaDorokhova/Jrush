package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        int ageScore = Integer.compare(this.age, anotherCat.age);
        int weightScore = Integer.compare(this.weight, anotherCat.weight);
        int strengthScore = Integer.compare(this.strength, anotherCat.strength);

        int score = ageScore + weightScore + strengthScore;
        return score > 0; // return score > 0 ? true : false;
    }

    public static void main(String[] args) {
      Cat cat1 = new Cat();
      Cat cat2 = new Cat();
      cat1.age = 5;
      cat2.age = 6;
      cat1.weight = 6;
      cat2.weight = 6;
      cat1.strength = 6;
      cat2.strength = 4;


        System.out.println(cat2.fight(cat1));
    }
}
