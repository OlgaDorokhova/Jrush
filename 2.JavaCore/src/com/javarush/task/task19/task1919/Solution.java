package com.javarush.task.task19.task1919;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* 
Считаем зарплаты
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]));
        TreeMap<String, Double> mapOfSalaries = new TreeMap<>();

        while (bufferedReader.ready()) {
            String[] splitLine = bufferedReader.readLine().split(" ");

            if(mapOfSalaries.containsKey(splitLine[0])) {
                mapOfSalaries.put(splitLine[0], mapOfSalaries.get(splitLine[0]) + Double.parseDouble(splitLine[1]));
            } else {
                mapOfSalaries.put(splitLine[0], Double.parseDouble(splitLine[1]));
            }

            bufferedReader.close();

            for(String key : mapOfSalaries.keySet()) {
                System.out.println(key + " " + mapOfSalaries.get(key));
            }

        }

    }
}
