package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Клубок
*/

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new Thread(new tr1()));
        threads.add(new Thread(new tr2()));
        threads.add(new Thread(new tr3()));
        threads.add(new Thread(new tr4()));
        threads.add(new Thread(new tr5()));
    }

    public static void main(String[] args) {
        threads.get(3).start();

    }

    public static class tr1 implements Runnable {
        @Override
        public void run() {
            while (true) {
                System.out.println("I am thread " + getClass().getName());
            }
        }
    }

    public static class tr2 implements Runnable {
        @Override
        public void run() {
           try {
               throw new InterruptedException();
           }
           catch (InterruptedException ex) {
               System.out.println("InterruptedException");
           }
            }
        }
    public static class tr3 implements Runnable {
        @Override
        public void run() {
            try {
                while(true) {
                    System.out.println("Ура");
                    Thread.sleep(500);
                }
            }
            catch (InterruptedException ex) {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class tr4 implements Runnable, Message {
        @Override
        public void run() {
         while (!Thread.currentThread().isInterrupted()) {}
        }
        public void showWarning() {
            Thread.currentThread().interrupt();
        }
    }

    public static class tr5 implements Runnable {
        @Override
        public void run() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int sum = 0;
        try {
            String str = reader.readLine();
            while (!str.equals("N")) {
                int num = Integer.parseInt(reader.readLine());
                sum+=num;
            }
        }
        catch (Exception ex) {
            System.out.println(ex);
        }
            System.out.println(sum);
        }

    }

}