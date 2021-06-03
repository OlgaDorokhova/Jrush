package com.javarush.task.task18.task1816;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* 
Английские буквы
*/

public class Solution {
    static int count;
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(args[0]);


        while (fis.available() > 0) {
            int data = fis.read();
            if((data >= 97 && data <= 122) || (data >=65 && data <=90)) {
                Solution.count++;
            }
        }
        System.out.println(count);
        fis.close();
    }
}
