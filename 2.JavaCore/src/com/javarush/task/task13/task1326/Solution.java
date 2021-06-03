package com.javarush.task.task13.task1326;

import javax.imageio.IIOException;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();

        FileInputStream fileInputStream = new FileInputStream(name);

        ArrayList<Integer> even = new ArrayList<>();

        Scanner scanner = new Scanner(fileInputStream);
        while (scanner.hasNext()) {
            int number = scanner.nextInt();
            if (number % 2 == 0) {
              even.add(number);
            }
        }

        Collections.sort(even);
        for (Integer num: even) {
            System.out.println(num);
        }
        scanner.close();
        fileInputStream.close();
    }
}
