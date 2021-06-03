package com.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
НОД
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Integer num1;
        Integer num2;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            num1 = Integer.parseInt(reader.readLine());
            num2 = Integer.parseInt(reader.readLine());
            if(num1 <= 0) throw new Exception();
            if(num2 <= 0) throw new Exception();
            if (num1 < num2) {
                int auxiliary = num1;
                num1 = num2;
                num2 = auxiliary;
            }
            System.out.println(NOD(num1, num2));
        }
        catch (NumberFormatException e) {
            e.printStackTrace();
        }

        reader.close();
    }

    public static int NOD(int n1, int n2) {
        int nod = 0;
        while (true) {
            int ost = n1 % n2;
            if (ost == 0) {
                if ((n1 > n2)) {
                    nod = n2;
                } else {nod = n1;}
                break;}
            else {
                 if ((n1 > n2)) {
                        n1 = ost;
                    } else {n2 = ost;}
                 continue;
            }
        }
        return nod;
    }
}
