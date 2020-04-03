package ch.css.iman;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("Olympian", 8, 12);

        if (theatre.reserveSeat("D12")) {
            System.out.println("Pay");
        } else {
            System.out.println("seat D12 already reserved");
        }

        if (theatre.reserveSeat("B13")) {
            System.out.println("Pay");
        } else {
            System.out.println("seat B13 already reserved");
        }

        List<Seat> reverseSeats = new ArrayList<>(theatre.getSeats());
        Collections.reverse(reverseSeats);
        printList(reverseSeats);

        List<Seat> priceSeats = new ArrayList<>(theatre.getSeats());
        priceSeats.add(new Seat("B00", 13.00));
        priceSeats.add(new Seat("A00", 13.00));
        Collections.sort(priceSeats, Theatre.PRICE_ORDER);
        printList(priceSeats);

    }

    public static void printList(List<Seat> list) {
        for (Seat seat : list) {
            System.out.print(" " + seat.getSeatNumber() + " " + seat.getPrice());
        }
        System.out.println();
        System.out.println("=========================================================");
    }

}
