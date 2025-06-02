package com.java.lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaExp {
    public static void main(String[] args) {
//     Service service= new ServiceImpl();
//     service.perform("Leela");
        /*Consumer<String> name = n -> System.out.println("M name is "+n);
       name.accept("leela");*/
    Service service = s -> System.out.println(s);
    service.perform("Leela");
        Supplier<String> supplier = ()-> "My name is Leela";
        System.out.println(supplier.get());

        Function<Integer, Integer> function = n -> n*n;
        System.out.println(function.apply(10));

        Predicate<Integer> predicate = n -> {
            if(n % 2 == 0){
                return true;
            }
            return false;
        };
        System.out.println(predicate.test(5));
    }

}
