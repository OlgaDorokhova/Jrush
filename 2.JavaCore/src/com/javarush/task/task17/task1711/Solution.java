package com.javarush.task.task17.task1711;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    private static SimpleDateFormat sdfIn = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    private static SimpleDateFormat sdfOut = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);


    public static void main(String[] args) {
        //start here - начни тут
        try {
            switch (args[0]) {
                case "-c":
                    synchronized (allPeople) {
                        addP(args);
                    }
                    break;
                case "-u":
                    synchronized (allPeople) {
                        updateP(args);
                    }
                    break;
                case "-d":
                    synchronized (allPeople) {
                        deleteP(args);
                    }
                    break;
                case "-i":
                    synchronized (allPeople) {
                        informP((ArrayList<Person>) allPeople, args);
                    }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void addP(String[] args) throws Exception {
        for (int i = 1; i < args.length; i = i + 3) {
            String name = args[i];
            Date date = sdfIn.parse(args[i + 2]);
            String sex = args[i + 1];
            Person person = sex.equals("м") ? Person.createMale(name, date) : Person.createFemale(name, date);
            allPeople.add(person);
            System.out.println(allPeople.indexOf(person));
        }
    }

    public static void updateP(String[] args) throws Exception{
        for (int i = 1; i < args.length; i = i + 4) {
            Integer id = Integer.parseInt(args[i]);
            Date date = sdfIn.parse(args[i + 3]);
            Person person = allPeople.get(id);
            Sex sex = (args[i + 2].equals("м")) ? Sex.MALE : Sex.FEMALE;
            person.setName(args[i + 1]);
            person.setSex(sex);
            person.setBirthDate(date);
        }
    }

    public static void deleteP(String[] args) {
        for (int i = 1; i < args.length; i++) {
            Integer id = Integer.parseInt(args[i]);
            Person person = allPeople.get(id);
            person.setName(null);
            person.setSex(null);
            person.setBirthDate(null);
        }
    }

    public static void informP(ArrayList<Person> list, String[] args) {
        for (int i = 1; i < args.length; i++) {
            Integer id = Integer.parseInt(args[i]);
            Person person = list.get(id);
            String sex = (person.getSex() == Sex.MALE) ? "м" : "ж";
            System.out.println(person.getName() + " " + sex + " " + sdfOut.format(person.getBirthDate()));
        }
    }
}
