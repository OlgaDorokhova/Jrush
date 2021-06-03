package com.javarush.task.task19.task1926;

import java.io.*;

/* 
Перевертыши
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        BufferedReader fReader = new BufferedReader(new FileReader(fileName));

        while (fReader.ready()) {
            StringBuilder str = new StringBuilder(fReader.readLine());
            System.out.println(str.reverse());
        }
        reader.close();
        fReader.close();

    }
}
