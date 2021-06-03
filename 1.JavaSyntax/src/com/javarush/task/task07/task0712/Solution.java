package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        int max;
        int min;
        
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }
        
        max = list.get(0).length();
        min = list.get(0).length();
        int maxIndex = 0;
        int minIndex = 0;
        
        for (int i = 0; i < list.size(); i++ ) {
            if (list.get(i).length() >= max ) {max = list.get(i).length(); maxIndex = i;}
            else continue;
        }
        
        for (int i = 0; i < list.size(); i++ ) {
            if (list.get(i).length() <= min ) {min = list.get(i).length(); minIndex = i;}
        }
        
        System.out.println(max);
        System.out.println(min);
        if(maxIndex >= minIndex) System.out.println(list.get(minIndex));
        else System.out.println(list.get(maxIndex));
    }
}
