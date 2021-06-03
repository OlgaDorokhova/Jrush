package com.javarush.task.task04.task0443;
import java.io.*;
/* 
Как назвали, так назвали
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String day = reader.readLine();
        String month = reader.readLine();
        String year = reader.readLine();

        int d = Integer.parseInt(day);
        int m = Integer.parseInt(month);
        int y = Integer.parseInt(year);

        System.out.println(("Меня зовут " + name + "."));
        System.out.println("Я родился " + y + "." + m + "." + d );

    }
}
