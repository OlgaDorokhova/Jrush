package com.javarush.task.task03.task0308;

/* 
Произведение 10 чисел
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(mult(10));

    }

    public static int mult (int n) {
        int m = 1;
        for (int i = 1; i < (n + 1); i ++) {
            m = m * i;
        }

        return m;
    }
}
