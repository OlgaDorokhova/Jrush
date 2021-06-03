package com.javarush.task.task19.task1909;

import java.io.*;
import java.util.ArrayList;

/* 
Замена знаков
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();

        reader.close();

        BufferedReader bufferedReader = new BufferedReader(new FileReader(name1));


        ArrayList<String> fileContent = new ArrayList<>();
        while (bufferedReader.ready()) {
            String str = bufferedReader.readLine();
            fileContent.add(str);
        }
        bufferedReader.close();
        try (BufferedWriter outputFileWriter = new BufferedWriter(new FileWriter(name2))) {
            for (String s : fileContent) {
                outputFileWriter.write(s.replaceAll("\\.", "!"));
            }
        }
    }
}
