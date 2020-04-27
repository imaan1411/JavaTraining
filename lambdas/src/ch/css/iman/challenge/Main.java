package ch.css.iman.challenge;

import java.util.Arrays;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        Runnable runnable = () -> {
            String myString = "Let's split this up into an array";
            String[] parts = myString.split(" ");

            Arrays.stream(parts).forEach(System.out::println);
        };


        Function<String, String> lambdaFunction = s -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(s.charAt(i));
                }
            }
            return returnVal.toString();
        };


    }

}
