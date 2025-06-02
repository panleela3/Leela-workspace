package com.java.lambda;

public class ServiceImpl implements Service {
    @Override
    public void perform(String name) {
        System.out.println(name);
    }
}
