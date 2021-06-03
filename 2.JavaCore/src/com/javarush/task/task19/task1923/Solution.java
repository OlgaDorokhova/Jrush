package com.javarush.task.task19.task1923;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/* 
Слова с цифрами
*/

public class Solution {
    public static void main(String[] args) throws IOException{

        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]));
             FileWriter writer = new FileWriter(args[1])) {
            String str;
            String[] strSplit;
            while ((str = reader.readLine()) != null) {
                strSplit = str.split(" ");
                for (int i = 0; i < strSplit.length; i++) {
                    if (strSplit[i].matches(".+\\d.+")) {
                        writer.write(strSplit[i] + " ");
                    }
                }
            }
        }
    }
}
