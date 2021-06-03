package com.javarush.task.task14.task1411;

import java.io.*;
import java.util.ArrayList;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;
        ArrayList<String> list = new ArrayList<>();
        list.add("user");
        list.add("loser");
        list.add("coder");
        list.add("proger");

        while (true) {
            key = reader.readLine();
            if(key.equals(list.get(0))) {person = new Person.User(); doWork(person);}
            else if (key.equals(list.get(1))) {person = new Person.Loser(); doWork(person);}
            else if (key.equals(list.get(2))) {person = new Person.Coder(); doWork(person);}
            else if (key.equals(list.get(3))) {person = new Person.Proger(); doWork(person);}
            else break;
        }

            //создаем объект, пункт 2

             //вызываем doWork


    }

    public static void doWork(Person person) {
        if (person instanceof Person.User) ((Person.User) person).live();
        else if (person instanceof Person.Loser) ((Person.Loser) person).doNothing();
        else if (person instanceof Person.Coder) ((Person.Coder) person).writeCode();
        else if (person instanceof Person.Proger) ((Person.Proger) person).enjoy();
    }
}
