package com.javarush.task.task19.task1914;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Решаем пример
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);

        System.setOut(stream);
        testString.printSomething();
        System.setOut(consoleStream);

        String result = outputStream.toString();
        String[] resArr = result.split(" ");
        int firstNumber = Integer.parseInt(resArr[0]);
        int secondNumber = Integer.parseInt(resArr[2]);
        int resultOfOperation;

        if (resArr[1].trim().equals("+")) {
            resultOfOperation = firstNumber + secondNumber;
        }
        else if(resArr[1].trim().equals("-")) {
            resultOfOperation = firstNumber - secondNumber;
        }
        else resultOfOperation = firstNumber * secondNumber;

        System.out.println(firstNumber + " " + resArr[1] + " " + secondNumber + " = " + resultOfOperation);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

