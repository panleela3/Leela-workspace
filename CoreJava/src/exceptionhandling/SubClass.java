package exceptionhandling;

import java.io.IOException;
//If SuperClass doesn’t declare any exception and subclass declare checked exception.
public class SubClass extends SuperClass {
// problem 1: if super class doesn't declare exception,
    /*void method() throws IOException {
// compile time error that subclass overriden method doesn't throw checked exception
        System.out.println("sub class");
    }*/
    //If SuperClass doesn’t declare any exception and SubClass declare Unchecked exception.
   /* void method() throws ArithmeticException {
// ArithmeticException is of type Unchecked Exception
        // so the compiler won't give any error
        System.out.println("sub class");
    }*/
// problem 2 : if super class declares excpetion
    /*void method() throws Exception {
// Exception is not a child of RuntimeException
        System.out.println("sub class");
    }*/
    /*void method() throws ArithmeticException {
// ArithmeticException is a child exception
//        // of the RuntimeException
//        // So the compiler won't give an error
        System.out.println("sub class");
    }*/
    // SubClass declaring without exception
    void method() {

        System.out.println("sub class");
    }

    public static void main(String args[]){
        SuperClass sup = new SubClass();
        sup.method();
    }
}
