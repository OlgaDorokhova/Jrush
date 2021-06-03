package com.javarush.task.task04.task0442;
import java.io.*;
/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number;
        int inumber;
        int sum = 0;

        while (true) {
            number = reader.readLine();
            inumber = Integer.parseInt(number);
            if (inumber == -1) {
                sum = sum + (-1);
                System.out.println(sum);
                break;
            }
            sum = sum + inumber;
        }

    }
}
