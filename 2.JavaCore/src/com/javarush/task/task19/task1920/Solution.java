package com.javarush.task.task19.task1920;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.TreeMap;
import java.util.TreeSet;

/* 
Самый богатый
*/

public class Solution {
    public static void main(String[] args) throws IOException{

        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        TreeMap<String, Double> map = new TreeMap<>();

        while (reader.ready()) {
            String str[] = reader.readLine().split(" ");
            map.merge(str[0], Double.parseDouble(str[1]), (oldV, newV) -> oldV + newV);
//              if(!map.containsKey(str[0])) {
//                  map.put(str[0], Double.parseDouble(str[1]));
//              } else if (map.containsKey(str[0])){
//                  map.put(str[0], map.get(str[0]) + Double.parseDouble(str[1]));
//              }
        }
        reader.close();

        double maxSalary = map.firstEntry().getValue();
        for (double value : map.values()) {
            if (value > maxSalary) {
                maxSalary = value;
            }
        }

        TreeSet<String> names = new TreeSet<>();
        for (String name : map.keySet()) {
            if (maxSalary == map.get(name)) {
                names.add(name);
            }
        }

        for (String name : names) {
            System.out.println(name);
        }

        //Double maxVal = map.values().stream().max((o1, o2) -> o1.compareTo(o2)).get();
        //String maxName = map.lastKey();
        //map.forEach((s, d) -> System.out.println( "name " + s + " salary " + d ));

        //System.out.println(maxVal);
        //System.out.println(maxName);

       }
}
