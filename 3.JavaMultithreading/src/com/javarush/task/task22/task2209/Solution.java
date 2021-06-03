package com.javarush.task.task22.task2209;

import java.io.*;
import java.util.*;

/* 
Составить цепочку слов
*/

public class Solution {
    public static List<String> list = new ArrayList<>();
    public static String line;
    public static void main(String[] args) throws IOException{
        //...
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        reader.close();


        String[] words;

        try (BufferedReader fileReader = new BufferedReader(new FileReader(name))) {
            line = fileReader.readLine();
            words = line.split(" ");
        }

        StringBuilder result = getLine(words);
        System.out.println(result.toString());
    }

    public static StringBuilder getLine(String... words) {
        StringBuilder result = null;
        list = Arrays.asList(words);
        while (true) {

            boolean n = true;
            for (int i = 0; i < list.size() - 1; i++) {

                   if (list.get(i).toUpperCase().charAt(list.get(i).length() - 1) == list.get(i + 1).toUpperCase().charAt(0)) {
                    result.append(list.get(i));
                }
                   if (list.get(i).toUpperCase().charAt(list.get(i).length() - 1) != list.get(i + 1).toUpperCase().charAt(0)) {
                       n = false;
                   }
            }
           if(n) break;

            Collections.shuffle(list);
        }
        return result;
    }
}
