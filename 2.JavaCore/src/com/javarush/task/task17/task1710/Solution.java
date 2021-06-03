package com.javarush.task.task17.task1710;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws Exception{
        //start here - начни тут
        if(args[0].equals("-c")) {
            addP(args);
        }
        else if(args[0].equals("-u")) {
            updateP(args);
        }
        else if(args[0].equals("-d")) {
            deleteP(args);
        }
        else if(args[0].equals("-i")) {
            informP((ArrayList<Person>) allPeople, args);
        }

    }

    public static void addP(String[] args) throws Exception {
        String name = args[1];
        SimpleDateFormat sdfIn = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        Date date = sdfIn.parse(args[3]);

        if(args[2].equals("м")) {
            allPeople.add(Person.createMale(name, date));
        }
        else if( args[2].equals("ж")) {
            allPeople.add(Person.createFemale(name, date));
        }
        System.out.println(allPeople.size() - 1);

    }

    public static void updateP(String[] args) throws Exception{
        Integer id = Integer.parseInt(args[1]);
        SimpleDateFormat sdfIn = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        Date date = sdfIn.parse(args[4]);
        Person person = allPeople.get(id);
        Sex sex = (args[3].equals("м")) ? Sex.MALE : Sex.FEMALE;
        person.setName(args[2]);
        person.setSex(sex);
        person.setBirthDate(date);

    }

    public static void deleteP(String[] args) {
        Integer id = Integer.parseInt(args[1]);
        Person person = allPeople.get(id);
        person.setName(null);
        person.setSex(null);
        person.setBirthDate(null);

    }

    public static void informP(ArrayList<Person> list, String[] args) {
        Integer id = Integer.parseInt(args[1]);
        Person person = list.get(id);
        String sex = (person.getSex() == Sex.MALE) ? "м" : "ж" ;
        SimpleDateFormat sdfOut = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        System.out.println(person.getName() + " " + sex + " " + sdfOut.format(person.getBirthDate()));
    }
}
