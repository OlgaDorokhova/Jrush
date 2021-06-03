package com.javarush.task.task18.task1817;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/* 
Пробелы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader(args[0]);
        int spaceCount = 0;
        int dimension = 0;
        while (reader.ready()) {
            int readChar = reader.read(); dimension++;
            if (readChar == (int) ' ') spaceCount++;
        }
        reader.close();
        if (dimension != 0 ) {
            double spaces = (double) spaceCount / dimension * 100;
            System.out.printf("%.2f", spaces);

        }
    }
}
