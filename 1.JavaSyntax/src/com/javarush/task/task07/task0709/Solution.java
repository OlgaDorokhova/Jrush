package com.javarush.task.task07.task0709;
import java.util.*;
import java.io.*;
/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();

        
        for(int i = 0; i < 5; i++) {
           list.add(reader.readLine());
       }

        int min = list.get(0).length();
       
       for(int i = 1; i < 5; i++) {
           if(list.get(i).length() <= min) min = list.get(i).length();
       }
       System.out.println(list.get(min));
    }
}
