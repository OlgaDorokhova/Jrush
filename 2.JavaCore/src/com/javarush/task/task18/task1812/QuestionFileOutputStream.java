package com.javarush.task.task18.task1812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Расширяем AmigoOutputStream
*/

public class QuestionFileOutputStream implements AmigoOutputStream {
    private AmigoOutputStream aOs;

    public QuestionFileOutputStream(AmigoOutputStream aOs) {
        this.aOs = aOs;
    }

    @Override
    public void flush() throws IOException {

        aOs.flush();
    }

    @Override
    public void write(int b) throws IOException {
        aOs.write(b);

    }

    @Override
    public void write(byte[] b) throws IOException {
        aOs.write(b);

    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        aOs.write(b, off, len);

    }

    @Override
    public void close() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Вы действительно хотите закрыть поток? Д/Н");
        String confirm = reader.readLine();
        if (confirm.equals("Д")) {
            aOs.close();
        }

    }
}

