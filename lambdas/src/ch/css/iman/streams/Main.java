package ch.css.iman.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> someBingoNumbers = Arrays.asList(
                "N40", "N36",
                "B12", "B6",
                "G53", "G49", "G60", "G50", "g64",
                "I26", "I17", "I29",
                "O71");

        someBingoNumbers.stream()
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("G"))
                .sorted()
                .forEach(System.out::println);

        Stream<String> ioStream = Stream.of("I9", "I7", "I3", "O2");
        Stream<String> igStream = Stream.of("I9", "I7", "G3", "G99");

        Stream<String> concatStream = Stream.concat(ioStream, igStream);

        System.out.println("-----------------------------------");
        System.out.println(concatStream
                .distinct()
                .peek(System.out::println)
                .count());
    }
}
