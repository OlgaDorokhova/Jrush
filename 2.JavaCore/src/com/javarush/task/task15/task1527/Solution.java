package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String currentLink = reader.readLine();
        reader.close();

        StringBuilder builder = new StringBuilder();
        String[] line = currentLink.split("\\?", 2);
        String[] parameter = line[1].split("&");
        String obj = null;
        for (String str: parameter) {
            String st[] = str.split("=");
            if (st[0].equals("obj")) {obj = st[1];}
            builder.append(st[0] + " ");
        }
        System.out.println(builder.toString().trim());

        if (obj != null) {
            try {
                alert(Double.parseDouble(obj));
            } catch (NumberFormatException nfe) {
                alert(obj);
            }
        }

    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
