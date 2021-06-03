package com.javarush.task.task22.task2202;

/* 
Найти подстроку
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush - лучший сервис "));
    }

    public static String getPartOfString(String string) {

        StringBuilder result = new StringBuilder();
        try {
            String[] stringSplit = string.split(" ");
            for (int i = 1; i <= 4; i++ ) {
                result.append(stringSplit[i] + " ");
            }
        } catch (Exception e) {
            throw new TooShortStringException("The string is too short");
        }
        return result.toString().trim();
    }

    public static class TooShortStringException extends RuntimeException{
        public TooShortStringException(String m) {

        }
    }
}
