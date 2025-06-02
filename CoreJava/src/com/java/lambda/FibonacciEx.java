package com.java.lambda;

import java.util.Arrays;

public class FibonacciEx {
    public static int[] generateFibonacci(int n)
    {
        int[] fib = new int[n];
        if (n >= 1) fib[0] = 0;
        if (n >= 2) fib[1] = 1;
        for (int i=2;i<n;i++){
            fib[i] = fib[i-1]+fib[i-2];
        }
        return fib;
    }

    public static void main(String[] args) {
       /* Stream.iterate(new int[] {0, 1}, f -> new int[] {f[1], f[0]+f[1]})
                .limit(10)
                .map(f -> f[0])
                .forEach(i -> System.out.print(i+" "));*/
        int n = 7;
        int [] result=generateFibonacci(n);
        System.out.println("The fibonacci of given number" +n+ "is: "+Arrays.toString(result));
    }

}

