package com.tsvetkov;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("Tsvetkovi",  8, 12);
        List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.getSeatsList());
        printList(seatCopy);

        seatCopy.get(2).reserve();
        if(theatre.reserveSeat("AO2")) {
            System.out.println("Please pay for AO2");
        } else {
            System.out.println("Seat already reserved :(");
        }

        Collections.shuffle(seatCopy);
        printList(seatCopy);
        printList(theatre.getSeatsList());

        Theatre.Seat minSeat = Collections.min(seatCopy);
        Theatre.Seat maxSeat = Collections.max(seatCopy);

        System.out.println("Min: " + minSeat.getSeatNumber());
        System.out.println("Max: " + maxSeat.getSeatNumber());

        sortList(seatCopy);
        System.out.println("Printing sorted seat copy");
        printList(seatCopy);

        List<Theatre.Seat> newList = new ArrayList<>();
        Collections.copy(seatCopy, newList); // you must have newList initialized with at least
        // as many elements as seatCopy
    }


    public static void printList(List<Theatre.Seat> list) {
        for(Theatre.Seat seat : list) {
            System.out.print(" " + seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("==========================================");
    }

    public static void sortList(List<? extends Theatre.Seat> list) {
        for(int i = 0; i < list.size() - 1; i++) {
            for(int j = i + 1; j < list.size(); j++) {
                if(list.get(i).compareTo(list.get(j)) > 0) {
                    Collections.swap(list, i, j);
                }
            }
        }

    }
}
