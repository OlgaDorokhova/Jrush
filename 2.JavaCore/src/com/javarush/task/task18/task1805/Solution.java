package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        FileInputStream fis = new FileInputStream(name);
        Set<Integer> set = new TreeSet<>();

        while (fis.available() > 0) {
            int data = fis.read();
            set.add(data);
        }
        fis.close();
        for (Integer num : set) {
            System.out.print(num + " ");
        }
    }
}
