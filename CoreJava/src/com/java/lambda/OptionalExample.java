package com.java.lambda;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<Person> person=getPerson();
      /*  if (person!=null && person.getAdress()!=null){
            String street=person.getAdress().getStreetName();
        } else {
            System.out.println("Street Not found");
        }*/
        Optional<String> street = person.map(Person::getAdress).map(Adress::getStreetName);
      /*  if (street.isPresent()){
            System.out.println("Value ::"+ street.get());
        }else {
            System.out.println("Value not found");
        }*/
      // String name= street.orElse("value not found");
        String name=street.orElseThrow(()->new ValueNotFound("500 Internal error","Value not found"));
        System.out.println(name);
        
        // we can write a code to eliminate verobse of repeated null checks
        // code can be written in functional way
        // clean and neat code can be wrtten it will give code readability









    }

    static Optional<Person> getPerson(){
        Adress adress=new Adress("Kothrud");
        Person person=new Person("Leela",adress);

        return Optional.ofNullable(person);
    }


}
