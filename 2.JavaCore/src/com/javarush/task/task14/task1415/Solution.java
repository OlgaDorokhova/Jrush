package com.javarush.task.task14.task1415;

import java.util.ArrayList;
import java.util.List;

/* 
Клининговый центр
*/

public class Solution {
    public static void main(String[] args) {
        List<Apartment> apartments = new ArrayList<Apartment>();
        apartments.add(new OneRoomApt());
        apartments.add(new TwoRoomApt());
        apartments.add(new ThreeRoomApt());

        cleanAllApartments(apartments);
    }

    public static void cleanAllApartments(List<Apartment> apartments) {
        for (Apartment apt : apartments) {
            if (apt instanceof OneRoomApt) {((OneRoomApt) apt).clean1Room();}
            else if (apt instanceof TwoRoomApt) {((TwoRoomApt) apt).clean2Rooms();}
            else if (apt instanceof ThreeRoomApt) {((ThreeRoomApt) apt).clean3Rooms();

            }
        }
    }

    static interface Apartment {
    }

   public static class OneRoomApt implements Apartment {
       void clean1Room() {
            System.out.println("1 room is cleaned");
        }
    }

    public static class TwoRoomApt implements Apartment {
        void clean2Rooms() {
            System.out.println("2 rooms are cleaned");
        }
    }

    static class ThreeRoomApt implements Apartment {
        void clean3Rooms() {
            System.out.println("3 rooms are cleaned");
        }
    }
}
