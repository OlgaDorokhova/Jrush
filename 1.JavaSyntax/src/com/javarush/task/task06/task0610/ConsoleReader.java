package com.javarush.task.task06.task0610;

/* 
Класс ConsoleReader
*/

import java.util.Scanner;

public class ConsoleReader {
    public static String readString() throws Exception {
        Scanner scan = new Scanner(System.in);
        String st = scan.nextLine();
        return st;
    }

    public static int readInt() throws Exception {
        Scanner scan = new Scanner(System.in);
        int nm = scan.nextInt();
        return nm;
    }

    public static double readDouble() throws Exception {
        Scanner scan = new Scanner(System.in);
        double db = scan.nextDouble();
        return db;
    }

    public static boolean readBoolean() throws Exception {
        Scanner scan = new Scanner(System.in);
        boolean bl = scan.nextBoolean();
        return bl;
    }

    public static void main(String[] args) throws Exception {

    }
}
