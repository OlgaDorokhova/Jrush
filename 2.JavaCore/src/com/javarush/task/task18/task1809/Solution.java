package com.javarush.task.task18.task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();

        FileInputStream fis = new FileInputStream(name1);
        FileOutputStream fos = new FileOutputStream(name2);
        List<Integer> list = new ArrayList<>();

        while (fis.available() > 0) {
            list.add(fis.read());
        }
        Collections.reverse(list);

        for (Integer intNum: list) {
            fos.write(intNum);
        }
        fis.close();
        fos.close();
    }
}
