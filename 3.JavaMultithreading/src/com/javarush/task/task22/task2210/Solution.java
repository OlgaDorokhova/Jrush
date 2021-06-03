package com.javarush.task.task22.task2210;

import java.util.StringTokenizer;

/* 
StringTokenizer
*/

public class Solution {
    public static void main(String[] args) {

        System.out.println(getTokens("I love java", "v"));

    }

    public static String[] getTokens(String query, String delimiter) {

        StringTokenizer tokenizer = new StringTokenizer(query, delimiter);
        String[] st = new String[tokenizer.countTokens()];
        int i = 0;
        while (tokenizer.hasMoreTokens()) {
            st[i++] = tokenizer.nextToken();
        }
        return st;
    }
}
