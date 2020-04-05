package com.example.departmentrecyclerview;

import java.io.Serializable;

public class Department implements Serializable {
    String name;
    String details;
    public Department(String name,String details)
    {
        this.name=name;
        this.details=details;

    }
    public Department(Department d)
    {
        this.name=d.name;
        this.details=d.details;
    }
}
