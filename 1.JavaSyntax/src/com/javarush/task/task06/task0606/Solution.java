package com.javarush.task.task06.task0606;
import java.io.*;
/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String st = reader.readLine();
        int number = Integer.parseInt(st);
        
        int stLength = st.length();

        for (int i = 0; i < stLength; i++) {
            if (Character.digit(st.charAt(i), 10)%2 == 0) {even++;}
            else odd++;
        }
        System.out.println("Even: " + even + " Odd: " + odd);
        
    }
}
