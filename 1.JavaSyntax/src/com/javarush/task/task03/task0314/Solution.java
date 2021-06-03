package com.javarush.task.task03.task0314;

/* 
Таблица умножения Ӏ Java Syntax: 3 уровень, 6 лекция
*/

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Solution {
    public static void main(String[] args) {
        for (Integer i = 1; i < 11; i ++) {

            String s = i.toString();
            System.out.println(s + i*2 + i*3 + i*4 + i*6 + i*6 +i*7 + i*8 + i*9 + i*10);
        }


    }
}
