package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(12,0.45));
        System.out.println(convertEurToUsd(67,7.5));

    }

    public static double convertEurToUsd(int eur, double exchangeRate) {
        return (double)eur * exchangeRate;

    }
}
