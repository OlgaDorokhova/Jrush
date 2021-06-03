package com.javarush.task.task18.task1819;

import java.io.*;

/* 
Объединение файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       String name1 = reader.readLine();
       String name2 = reader.readLine();

       FileInputStream fis1 = new FileInputStream(name1);
       FileInputStream fis2 = new FileInputStream(name2);
       FileOutputStream fos1 = new FileOutputStream(name1);

       byte[] buff = new byte[fis1.available()];

       fis1.read(buff);
       while (fis2.available() > 0) {
           fos1.write(fis2.read());
       }
       fos1.write(buff);

       fis1.close();
       fis2.close();
       fos1.close();
    }
}
