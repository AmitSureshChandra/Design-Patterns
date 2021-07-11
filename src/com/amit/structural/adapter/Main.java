package com.amit.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        Employee employee = new EmployeeDB("AMit","312adsa","8237145707");
        employees.add(employee);

        EmployeeAdap employeeAdap = new EmployeeAdap("Amit","qwewqe32123","7218026210");
        employees.add(new EmployeeAdapter(employeeAdap));

        for (Employee e:
             employees) {
            System.out.println(e.getName());
        }

    }
}
