package com.javarush.task.task04.task0441;

/* 
Как-то средненько
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader brr = new BufferedReader(new InputStreamReader(System.in));
        String st1 = brr.readLine();
        int num1 = Integer.parseInt(st1);
        String st2 = brr.readLine();
        int num2 = Integer.parseInt(st2);
        String st3 = brr.readLine();
        int num3 = Integer.parseInt(st3);

        if (num3 >= num1 && num3 >= num2) { if (num1 >= num2) {
            System.out.println(num1);}
        else if (num2 >= num1)  {
            System.out.println(num2);}
        }
        else if (num1 >= num2 && num1 >= num3) { if (num2 >= num3) {
            System.out.println(num2);}
        else if (num3 >= num2)  {
            System.out.println(num3);}
        }

        else if (num2 >= num1 && num2 >= num3) { if (num1 >= num3) {
            System.out.println(num1);}
        else if (num3 >= num1)  {
            System.out.println(num3);}
        }

    }
}
