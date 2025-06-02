package com.java;

public class DBConnectionMain {
    public static void main(String[] args) {
        DBConnection instance1 = DBConnection.getInstance();
        DBConnection instance2 = DBConnection.getInstance();
        System.out.println("Instance 1: "+instance1.hashCode()+" "+ "\ninstance 2 :"+ instance2.hashCode() );
    }
}
