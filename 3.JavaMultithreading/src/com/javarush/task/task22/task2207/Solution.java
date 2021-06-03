package com.javarush.task.task22.task2207;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Обращенные слова
*/

public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        List<String> listOfLines = new ArrayList<>();
        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
            String line;
            String[] splitLine;
            while ((line = fileReader.readLine()) != null) {
                splitLine = line.split(" ");
                for (String st : splitLine) {
                    listOfLines.add(st);
                }
            }
        }

        for (int i = 0; i <listOfLines.size(); i++) {
            for (int j = 0; j <listOfLines.size(); ) {
                if (i >= listOfLines.size()) {
                    break;
                }
                if (listOfLines.get(j).equals(new StringBuilder(listOfLines.get(i)).reverse().toString()) && j != i) {
                    Pair pair = new Pair();
                    pair.first = listOfLines.get(j);
                    pair.second = listOfLines.get(i);
                    result.add(pair);
                    listOfLines.remove(j);
                    listOfLines.remove(i);
                    j = 0;
                } else
                    j++;
            }
        }

        System.out.println(result);


    }

    public static class Pair {
        String first;
        String second;



        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return first == null && second == null ? "" :
                    first == null ? second :
                            second == null ? first :
                                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
