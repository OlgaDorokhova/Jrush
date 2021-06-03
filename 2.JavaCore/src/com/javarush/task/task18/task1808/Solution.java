package com.javarush.task.task18.task1808;

import java.io.*;

/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        String name3 = reader.readLine();

        FileInputStream fis1 = new FileInputStream(name1);
        FileOutputStream fos2 = new FileOutputStream(name2);
        FileOutputStream fos3 = new FileOutputStream(name3);

        int half = (fis1.available() + 1)/2;
        int countBytes = 0;
        while (fis1.available() > 0) {

            if (half > countBytes) {
                fos2.write(fis1.read()); countBytes++;}
            else fos3.write(fis1.read());
        }
        fis1.close();
        fos2.close();
        fos3.close();
    }
}
