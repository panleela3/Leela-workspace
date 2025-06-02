package com.java.lambda;

public class Person {
    String name;
    Adress adress;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public Person(String name, Adress adress) {
        this.name = name;
        this.adress = adress;
    }
}
