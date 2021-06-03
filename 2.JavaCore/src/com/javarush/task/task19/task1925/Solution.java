package com.javarush.task.task19.task1925;

import java.io.*;
import java.util.ArrayList;

/* 
Длинные слова
*/

public class Solution {
    public static void main(String[] args) {
        args = new String[2];
        args[0] = "d:/1.txt";
        args[1] = "d:/2.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(args[0]));
            String data = reader.readLine();
            String[] splitData = data.split(" ");

            for (String st: splitData) {
                System.out.println(st);
            }

           FileWriter fl = new FileWriter(args[1]);
            StringBuffer sb = new StringBuffer();

            for (int i = 0; i < splitData.length; i++) {
                if (splitData[i].length() > 6)
                    sb.append(splitData[i] + " ");

            }
            System.out.println(sb);
            fl.write(sb.toString().trim().replaceAll(" ", ","));
            reader.close();
            fl.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
