package com.amit.structural.adapter;

public class EmployeeDB implements Employee {
    String name;
    String id;
    String mobile;

    public EmployeeDB(String name, String id, String mobile) {
        this.name = name;
        this.id = id;
        this.mobile = mobile;
    }

    @Override
    public void setName(String name) {
        this.name =name;
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
