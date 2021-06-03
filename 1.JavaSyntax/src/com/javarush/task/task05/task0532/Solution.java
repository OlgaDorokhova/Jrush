package com.javarush.task.task05.task0532;

/* 
Задача по алгоритмам Ӏ Java Syntax: 5 уровень, 12 лекция
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = 1;
        int N = Integer.parseInt(reader.readLine());

        if (N > 0) {
            for (int i = 1; i < N; i++) {
                int number = Integer.parseInt(reader.readLine());
                if (number >= maximum) {
                    maximum = number;
                }
            }


            System.out.println(maximum);
        }
    }
}
