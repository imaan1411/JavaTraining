package ch.css.iman.employees;

import ch.css.iman.employees.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Employee iman = new Employee("Iman Lünsmann", 20);
        Employee sonja = new Employee("Sonja Helfer", 21);
        Employee laurin = new Employee("Laurin Burach", 19);
        Employee mena = new Employee("Mena WeissNed", 19);
        Employee red = new Employee("Red Color", 22);
        Employee charming = new Employee("Charming Blue", 20);


        List<Employee> employees = new ArrayList<>();
        employees.add(iman);
        employees.add(sonja);
        employees.add(laurin);
        employees.add(mena);
        employees.add(red);
        employees.add(charming);

        printEmployeesByAge(employees, "Employees over 20", employee -> employee.getAge() > 20);
        printEmployeesByAge(employees, "\nEmployees 20 and younger", employee -> employee.getAge() <= 20);

        IntPredicate intPredicate = value -> value < 10;
        System.out.println(intPredicate.test(9));

        Random random = new Random();
        Supplier<Integer> randomSupplier = () -> random.nextInt(1000);
        for (int i = 0; i < 10; i++) {
            System.out.println(randomSupplier.get());
        }

        Function<Employee, String> getLastName = employee ->
                employee.getName().substring(employee.getName().indexOf(" ") + 1);

        Random rand = new Random();
        for (Employee e : employees) {
            if (rand.nextBoolean()) {
                System.out.println(getLastName.apply(e));
            } else {
                System.out.println(e.getName());
            }
        }

        Function<String, String> toUpperCase = String::toUpperCase;

        System.out.println(getLastName.andThen(toUpperCase).apply(employees.get(0)));




    }

    private static void printEmployeesByAge (List<Employee> employees, String text, Predicate<Employee> condition) {
        System.out.println(text);
        System.out.println("===========================");
        for (Employee e : employees) {
            if (condition.test(e)) {
                System.out.println(e.getName());
            }
        }
    }

}
