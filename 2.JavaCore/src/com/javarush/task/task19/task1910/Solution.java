package com.javarush.task.task19.task1910;

import java.io.*;
import java.util.ArrayList;

/* 
Пунктуация
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        String name1;
        String name2;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
           name1 = reader.readLine();
           name2 = reader.readLine();
        }

      

        try (BufferedReader fileReader = new BufferedReader(new FileReader(name1));
             BufferedWriter fileWriter = new BufferedWriter(new FileWriter(name2))) {
            while (fileReader.ready()) {
                fileWriter.write(fileReader.readLine().replaceAll("\\p{Punct}", ""));
            }
        }
    }
}
