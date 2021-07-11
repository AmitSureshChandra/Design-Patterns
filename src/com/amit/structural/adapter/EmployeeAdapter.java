package com.amit.structural.adapter;

public class EmployeeAdapter implements Employee {
    String name;
    String id;
    String mobile;

    EmployeeAdap  employeeAdap;

    public EmployeeAdapter(EmployeeAdap instance) {
        this.employeeAdap = instance;
        this.name = employeeAdap.username;
        this.id = employeeAdap.unique_id;
        this.mobile = employeeAdap.mobile;
    }

    @Override
    public void setName(String name) {
        this.name  = name;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String getName() {
        return name;
    }
}
