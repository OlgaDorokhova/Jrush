package com.javarush.task.task18.task1818;

import java.io.*;

/* 
Два в одном
*/

public class Solution {
    public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String name1 = reader.readLine();
    String name2 = reader.readLine();
    String name3 = reader.readLine();

    FileInputStream fis2 = new FileInputStream(name2);
    FileInputStream fis3 = new FileInputStream(name3);
    FileOutputStream fos1 = new FileOutputStream(name1);

    while (fis2.available() > 0) {
        fos1.write(fis2.read());
    }

    while (fis3.available() > 0) {
        fos1.write(fis3.read());
    }
    fos1.close();
    fis2.close();
    fis3.close();

    }
}
