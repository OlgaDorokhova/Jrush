package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Woman wom1 = new Woman("ddd", 12, "dfghb 134");
        Woman wom2 = new Woman("scs", 32, "asdadf 89");

        Man man1 = new Man("sdcs", 321, "wwww");
        Man man2 = new Man("ewd", 42, "wed");

        System.out.println(wom1.name + " " + wom1.age + " " + wom1.address);
        System.out.println(wom2.name + " " + wom2.age + " " + wom2.address);

        System.out.println(man1.name + " " + man1.age + " " + man1.address);
        System.out.println(man2.name + " " + man2.age + " " + man2.address);
        
    }

    public static class Man{
            String name;
            int age;
            String address;
            
            public Man(String name, int age, String address) {
                this.name = name;
                this.age = age;
                this.address = address;
                
            }
            
        }
        
        public static class Woman {
            String name;
            int age;
            String address;
            
            public Woman(String name, int age, String address) {
                this.name = name;
                this.age = age;
                this.address = address;
            }
        }
}
