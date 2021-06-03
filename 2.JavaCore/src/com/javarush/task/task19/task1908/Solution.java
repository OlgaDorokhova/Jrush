package com.javarush.task.task19.task1908;

import java.io.*;
import java.util.ArrayList;

/* 
Выделяем числа
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String firstName = reader.readLine();
        String secondName = reader.readLine();
        reader.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(firstName));
        ArrayList<String> list = new ArrayList<>();
        String[] currentStr = fileReader.readLine().split(" ");
        for (String str: currentStr) {
            if (str.matches("\\d+")) {
                list.add(str);
            }
        }

        fileReader.close();

        BufferedWriter writer = new BufferedWriter(new FileWriter(secondName));
        for (int i = 0; i < list.size(); i++) {
            writer.write(list.get(i) + " ");
        }
        writer.close();
    }
}
