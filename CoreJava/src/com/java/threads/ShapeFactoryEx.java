package com.java.threads;

public class ShapeFactoryEx {
    //private  Shape instance;



    public Shape getInstance(String shape) {
        if(shape==null){
            return null;
        }
        if(shape.equals("Circle")){
            return new Circle();
        }
        if (shape.equals("Rectangle")){
            return new Rectangle();
        }
        return null;
    }
}
