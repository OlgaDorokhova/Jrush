package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

import java.io.BufferedReader;

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {

        int a = number/100, b, c;
        b = (number - a*100)/10;
        c = (number - a*100)%10;
        number = a + b + c;
        return number;
    }
}

