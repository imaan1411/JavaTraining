package ch.css.iman.challenge;

import com.sun.source.tree.BreakTree;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Supplier;

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

        System.out.println(everySecondCharacter(lambdaFunction, "1234567890"));


        Supplier<String> supplier = () -> "I love Java!";
        String iLoveJava = supplier.get();
        System.out.println(iLoveJava);


    }

    public static String everySecondCharacter(Function<String, String> function, String input) {
        return function.apply(input);
    }


}
