package ch.css.iman;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("Olympian", 8, 12);
        List<Seat> seatCopy = new ArrayList<>(theatre.seats);
        printList(seatCopy);

        // this example proves that these two lists have the same data, but different references
        seatCopy.get(1).reserve();
        if (theatre.reserveSeat("A02")) {
            System.out.println("Pay");
        } else {
            System.out.println("seat A02 already reserved");
        }

        // Collections.reverse
        Collections.reverse(seatCopy);
        System.out.println("Printing seatCopy");
        printList(seatCopy);
        System.out.println("Printing theatre.seats");
        printList(theatre.seats);

        // Collections.min & Collections.max
        Seat minSeat = Collections.min(seatCopy);
        Seat maxSeat = Collections.max(seatCopy);
        System.out.println("Min seat number is " + minSeat.getSeatNumber());
        System.out.println("Max seat number is " + maxSeat.getSeatNumber());

        Collections.shuffle(seatCopy);
        System.out.println("Printing shuffled seatCopy");
        printList(seatCopy);
        sortList(seatCopy);
        System.out.println("Printing sorted SeatCopy");
        printList(seatCopy);

    }

    public static void printList(List<Seat> list) {
        for (Seat seat : list) {
            System.out.print(" " + seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("=========================================================");
    }

    public static void sortList(List<? extends Seat> list) {
        for(int i = 0; i < list.size() -1; i++) {
            for (int j= i+1; j < list.size(); j++) {
                if (list.get(i).compareTo(list.get(j)) > 0) {
                    Collections.swap(list, i, j);
                }
            }
        }
    }
}
