package com.javarush.task.task05.task0507;
import java.io.*;
/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number;
        int inumber;
        int i = 0;
        double sum = 0.0;
        double average = 0.0;
        
        while (true) {
            number = reader.readLine();
            inumber = Integer.parseInt(number);

            if (inumber == -1) {
                System.out.println(average);
                break;
            }
            i++;
            sum = sum + inumber;
            average = sum / i;

        }
    }
}

