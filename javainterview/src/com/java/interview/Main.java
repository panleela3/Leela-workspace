package com.java.interview;

import java.util.*;
import java.util.stream.IntStream;

//1,2,3,4,5,6,7,8,9
// i/p: 1-9 . o/p : [1,9],[2,8],[3,7],[4,6]
public class Main {
    public static void main(String[] args) {
        int k = 7;
        List<Integer> integerList = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            integerList.add(i);
        }

        for (int i = 0; i < integerList.size(); i++) {
            for (int j = i + 1; j < integerList.size(); j++) {
                int pairSum = integerList.get(i) + integerList.get(j);
                if (pairSum == k) {
                    System.out.println("(" + integerList.get(i) + " ," + integerList.get(j) + " )");
                }

            }


        }
        //======================================
        //using streams
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int target = 10;

        Set<String> seenPairs = new HashSet<>();

        IntStream.range(0, list.size())
                .boxed()
                .flatMap(i ->
                        IntStream.range(i + 1, list.size())
                                .mapToObj(j -> new int[]{list.get(i), list.get(j)})
                )
                .filter(pair -> pair[0] + pair[1] == target)
                .forEach(pair -> {
                    int a = Math.min(pair[0], pair[1]);
                    int b = Math.max(pair[0], pair[1]);
                    String key = a + "," + b;
                    if (!seenPairs.contains(key)) {
                        System.out.println("(" + a + ", " + b + ")");
                        seenPairs.add(key);
                    }
                });
    }
}
