package com.java.cloning;

import java.util.HashMap;
import java.util.Map;

public class CloningExample {
    public static void main(String[] args) throws CloneNotSupportedException {

        Map<String,String> map=new HashMap<>();
        map.put("Premium","Super");
        map.put("Golden","Good");
        map.put("Silver","ok");
        Customer originalObj=new Customer("Leela",503,map);
        Customer clonedObj=(Customer) originalObj.clone();
        clonedObj.setName("Leelavathi");
        clonedObj.setId(101);
        clonedObj.getProp().put("Leelakey","Verygood");
        System.out.println("originalObj :: "+originalObj);
        System.out.println("clonedObj :: "+clonedObj);
        System.out.println(originalObj==clonedObj);

    }
}
