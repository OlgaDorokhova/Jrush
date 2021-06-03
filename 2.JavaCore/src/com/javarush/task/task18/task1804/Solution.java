package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Byte> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        FileInputStream fis = new FileInputStream(name);

        while (fis.available() > 0) {
            list.add((byte)fis.read());
        }

        Map <Byte, Integer> map = new HashMap<>();
        int count;

        for (int i = 0; i < list.size(); i++) {
            count = Collections.frequency(list, list.get(i));
            map.put(list.get(i), count );
        }

        if (!map.isEmpty()) {
            int min = Collections.min(map.values());
            for (Map.Entry<Byte, Integer> pair : map.entrySet()) {
                if (pair.getValue() == min) System.out.print(pair.getKey() + " ");
            }
        }
        fis.close();
    }
}
