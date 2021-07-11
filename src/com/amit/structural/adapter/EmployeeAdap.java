package com.amit.structural.adapter;

public class EmployeeAdap{

    String username;
    String unique_id;
    String mobile;

    public EmployeeAdap(String username, String unique_id, String mobile) {
        this.username = username;
        this.unique_id = unique_id;
        this.mobile = mobile;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setUnique_id(String unique_id) {
        this.unique_id = unique_id;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getName(){
        return username;
    }
}
