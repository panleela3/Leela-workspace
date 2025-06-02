package com.java.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// How can you synchronize an ArrayList in Java?

public class SynchArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Leela");
        list.add("Bala");
        list.add("Jai");
        list.add("Sai");

        list=Collections.synchronizedList(list);
        System.out.println(list);

        synchronized (list){
            Iterator<String> it = list.iterator();
            while (it.hasNext()){
                System.out.println(it.next());
            }
        }
    }
}
