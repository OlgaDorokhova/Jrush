package com.javarush.task.task18.task1815;

import java.util.List;

/* 
Таблица
*/

public class Solution {
    public class TableInterfaceWrapper implements TableInterface{
        private TableInterface tb;
        String text;
        public TableInterfaceWrapper(TableInterface tb) {
            this.tb = tb;
        }

        @Override
        public void setModel(List rows) {
            System.out.println(rows.size());
            tb.setModel(rows);
        }

        @Override
        public String getHeaderText() {

            return tb.getHeaderText().toUpperCase();
        }

        @Override
        public void setHeaderText(String newHeaderText) {
            tb.setHeaderText(newHeaderText);

        }
    }

    public interface TableInterface {
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) {
    }
}