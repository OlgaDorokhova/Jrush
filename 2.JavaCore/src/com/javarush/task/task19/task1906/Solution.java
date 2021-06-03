package com.javarush.task.task19.task1906;

import java.io.*;
import java.util.ArrayList;

/* 
Четные символы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        reader.close();

        FileReader fileReader = new FileReader(name1);
        ArrayList<Integer> list = new ArrayList<>();
        while (fileReader.ready()) {
            list.add(fileReader.read());
           }
        fileReader.close();

        FileWriter writer = new FileWriter(name2);
        for(int i = 1; i < list.size();i+=2) {
            writer.write(list.get(i));
        }

        writer.close();
    }
}
