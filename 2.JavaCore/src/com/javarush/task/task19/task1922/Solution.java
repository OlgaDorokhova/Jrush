package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String fileName = reader.readLine();
            BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
            while (fileReader.ready()) {
                String line = fileReader.readLine();
                String[] lineSplit = line.split(" ");
                int count = 0;

                for (int i = 0; i < lineSplit.length; i++) {
                    for (int j = 0; j < words.size(); j++) {
                        if (lineSplit[i].equals(words.get(j))) {
                            count++;
                        }
                    }
                }
                if (count == 2) {
                    System.out.println(line);
                }
            }
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        reader.close();
    }
}
