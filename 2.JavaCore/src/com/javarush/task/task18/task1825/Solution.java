package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        TreeSet<String> files = new TreeSet<>();
        boolean end = false;

        try {
            String firstName = bufferedReader.readLine();
            int middle = firstName.lastIndexOf(".");
            String outputFileName = firstName.substring(0, middle);


            files.add(firstName);

            while (!end) {
                String fileName = bufferedReader.readLine();
                if (fileName.equals("end")) {
                    end = true;
                }
                files.add(fileName);
            }
            bufferedReader.close();
            System.out.println(outputFileName);

            FileOutputStream output = new FileOutputStream(outputFileName, true);
            for (String fl: files) {
            FileInputStream input = new FileInputStream(fl);

            while (input.available() > 0) {
                byte[] buffer = new byte[input.available()];
                input.read(buffer, 0, buffer.length);
                output.write(buffer, 0, buffer.length);
            }
            input.close();
            }
            output.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
