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

        Collections.sort(employees, (o1, o2) -> o1.getName().compareTo(o2.getName()));

        for (Employee e : employees) {
            System.out.println(e.getName());
        }

        UpperConcat uc = ((s1, s2) -> s1.toUpperCase() + s2.toUpperCase());

        String  sillyString = doStringStuff(uc, employees.get(0).getName(), employees.get(1).getName());
        System.out.println(sillyString);

    }

    public final static String doStringStuff(UpperConcat uc,  String s1, String s2) {
        return uc.upperConcat(s1,s2);
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

interface UpperConcat {
    String upperConcat(String s1, String s2);
}

