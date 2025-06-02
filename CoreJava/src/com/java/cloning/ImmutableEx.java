package com.java.cloning;

import java.util.HashMap;
import java.util.Map;

//  final class to mean immutable
public final class ImmutableEx {
    private final String dept;
    private final String address;
    private final Map<String,Integer> props;
   /* private final Employee employee;

    public Employee getEmployee() {
        return new Employee(employee.getEmpId(),employee.getEmpName());
    }*/

    public ImmutableEx(String dept, String address, Map<String, Integer> props) {
        this.dept = dept;
        this.address = address;
        //this.employee = employee;
//        this.employee = new Employee(employee.getEmpId(),employee.getEmpName());
        this.props=props;

       //this.props = new HashMap<>(props); //1st defence
    }

    public String getDept() {
        return dept;
    }

    public Map<String, Integer> getProps() {
        return new HashMap<>(props);
    }

    public String getAddress() {
        return address;
    }
}
