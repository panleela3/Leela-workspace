package com.java.lambda;

import java.util.function.BiFunction;

public class Triangle {
    public final int height;
    public final int base;

    private double area;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Triangle(int height, int base) {
        this.height = height;
        this.base = base;
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle(3,3);

        BiFunction<Integer, Integer, Double> area= (h , b) -> {
            if (h>0 && b>0){
                return (h * b) /2.0;
            }
            return 0.0;
        };
        double result = area.apply(triangle.height, triangle.base);
        System.out.println(result);
    }
}
