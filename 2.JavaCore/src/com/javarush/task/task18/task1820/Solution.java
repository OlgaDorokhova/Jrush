package com.javarush.task.task18.task1820;

import java.io.*;

/* 
Округление чисел
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try {BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String name1 = reader.readLine();
            String name2 = reader.readLine();
            reader.close();

            BufferedReader fileReader = new BufferedReader(new FileReader(name1));
            BufferedWriter fileWriter = new BufferedWriter(new FileWriter(name2));
            String[] fileString = fileReader.readLine().split(" ");
            StringBuilder stringBuilder = new StringBuilder();

            for (int i = 0; i < fileString.length;i++) {
                stringBuilder.append(Math.round(Double.parseDouble(fileString[i])) + " ");
            }

            fileWriter.write(String.valueOf(stringBuilder));

            fileReader.close();
            fileWriter.close();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
