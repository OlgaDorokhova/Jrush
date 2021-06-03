package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String>[] arrayOfStringList = new ArrayList[3];
        arrayOfStringList[0] = new ArrayList<>();
        arrayOfStringList[0].add("1");
        arrayOfStringList[1] = new ArrayList<>();
        arrayOfStringList[1].add("2");
        arrayOfStringList[1].add("2.5");
        arrayOfStringList[2] = new ArrayList<>();
        arrayOfStringList[2].add("3");

        return arrayOfStringList;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String string : list) {
                System.out.println(string);
            }
        }
    }
}