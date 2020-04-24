package ch.css.iman;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        new Thread(()-> {
            System.out.println("hello");
            System.out.println("hell2o");
        }).start();

        Employee iman = new Employee("Iman", 20);
        Employee sonja = new Employee("Sonja", 21);
        Employee laurin = new Employee("Laurin", 19);
        Employee mena = new Employee("Mena", 19);

        List<Employee> employees = new ArrayList<>();
        employees.add(iman);
        employees.add(sonja);
        employees.add(laurin);
        employees.add(mena);

        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        for (Employee e : employees) {
            System.out.println(e.getName());
        }
    }
}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

