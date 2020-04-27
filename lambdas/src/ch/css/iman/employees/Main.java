package ch.css.iman.employees;

import ch.css.iman.employees.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Employee iman = new Employee("Iman", 20);
        Employee sonja = new Employee("Sonja", 21);
        Employee laurin = new Employee("Laurin", 19);
        Employee mena = new Employee("Mena", 19);
        Employee red = new Employee("Red", 22);
        Employee charming = new Employee("Charming", 20);


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
