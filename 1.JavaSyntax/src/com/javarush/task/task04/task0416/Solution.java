package com.javarush.task.task04.task0416;
import java.io.*;
/* 
Переходим дорогу вслепую
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader brr = new BufferedReader(new InputStreamReader(System.in));
        String st = brr.readLine();
        double num = Double.parseDouble(st);

        if (num >= 5.0) num = num%5;
        
        if (num >= 0.0 && num < 3.0) {
        
            System.out.println("зелёный");
        }
        else if (num >= 3.0 && num < 4.0) {
            System.out.println("жёлтый");
        }
        else if(num >= 4.0 && num < 5.0) System.out.println("красный");
        

    }
}