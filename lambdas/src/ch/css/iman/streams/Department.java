package ch.css.iman.streams;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;

    private List<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addEmployee(Employee e) {
        this.employees.add(e);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

}
