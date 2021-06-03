package com.javarush.task.task19.task1907;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Считаем слово
*/

public class Solution {
    public static void main(String[] args) throws IOException{

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String fileName = reader.readLine();
            BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
                String str = fileReader.readLine();

                int count = 0;

                String readyString = str.replaceAll("\\p{P}", " ").replaceAll("\\s", " ");
                for (String st: readyString.split(" ")) {
                    if(st.equals("world")) {
                        count++;
                    }
                }

            fileReader.close();
            System.out.println(count);
            }

        }

    }

