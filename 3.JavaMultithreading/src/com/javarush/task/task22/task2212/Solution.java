package com.javarush.task.task22.task2212;

/* 
Проверка номера телефона
*/

public class Solution {
    public static boolean checkTelNumber(String telNumber) {

        String telnumberClear;

        if (telNumber.isEmpty()) return false;
        if (telNumber.matches("\\w")) return false;


        if (telNumber.startsWith("+")) {
            telnumberClear = telNumber.replaceAll("\\D", "");
            if (telnumberClear.length() != 12) return false;
        }

        if (telNumber.startsWith("(") || telNumber.startsWith("\\d")) {
            telnumberClear = telNumber.replaceAll("\\D", "");
            if (telnumberClear.length() != 10) return false;
        }

        return telNumber.matches("\\(\\d{3}\\)[-]{1,2}?\\d");
    }

    public static void main(String[] args) {

    }
}
