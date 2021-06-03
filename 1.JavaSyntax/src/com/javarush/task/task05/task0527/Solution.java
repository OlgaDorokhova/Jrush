package com.javarush.task.task05.task0527;

/* 
Том и Джерри
*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Dog dog = new Dog("Bob", 10, 4);
        Cat catTom = new Cat("Tom", 23, 'm');

    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Cat {
        String name;
        int age;
        char sex;

        public Cat (String name, int age, char sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }
    }

    public static class Dog {
        String name;
        int strength;
        int age;

        public Dog (String name, int strength, int age) {
            this.name = name;
            this.strength = strength;
            this.age = age;
        }
    }
}
