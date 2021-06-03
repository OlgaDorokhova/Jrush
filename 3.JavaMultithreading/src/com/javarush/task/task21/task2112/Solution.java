package com.javarush.task.task21.task2112;

public class Solution {
    public static void main(String[] args) {
        DBConnectionManager dbConnectionManager = new DBConnectionManager();
//        Если хотите использовать ваш ресурс в круглых скобках после TRY,
//        то придётся вспомнить про то, что он должен имплементить AutoCloseable и
//        как следствие давать конкретную реализацию методу close(),
//                в котором вы прописываете вполне конкретную логику по закрытию ресурса.
        try (FakeConnection fakeConnection = dbConnectionManager.getFakeConnection()) {
            System.out.println("Entering body of try block.");
            fakeConnection.usefulOperation();
            fakeConnection.unsupportedOperation();

        } catch (Exception e) {
        }
    }
}
