package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String file1 = reader.readLine();
            String file2 = reader.readLine();
            reader.close();

            BufferedReader fileReader = new BufferedReader(new FileReader(file1));
            BufferedReader file2Reader = new BufferedReader(new FileReader(file2));
            while (fileReader.ready()) {
                String firstStr = fileReader.readLine();
                String secondStr = file2Reader.readLine();
                if(firstStr.equals(secondStr)) {
                    lines.add(new LineItem(Type.SAME, firstStr));
                }
                else if (secondStr.equals("")) {
                    lines.add(new LineItem(Type.REMOVED, firstStr));
                }
                else if (firstStr.equals("")) {
                    lines.add(new LineItem(Type.ADDED, secondStr));
                }
            }

            fileReader.close();
            file2Reader.close();

        for(LineItem ln: lines) {
            System.out.println(ln);
        }
    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
        @Override
        public String toString() {
            return this.type + " " + this.line;
        }
    }
}
