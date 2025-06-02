package com.java.threads;

import java.util.List;

public class MyBlockingQue <E>{
    private static final int SIZE=5;
    private List<E> queue;

    public MyBlockingQue(List<E> queue) {
        this.queue = queue;
    }

    public synchronized void addItem(E item){
        if (queue.size()>=SIZE){
            try {
                Thread.sleep(1000);
                System.out.println("Producer is in waiting for consumer to consume Item");
                this.wait();

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        queue.add(item);
        System.out.println("Producer produced Item : "+item+" and notifying consumer to consume");
        this.notifyAll();
    }

    public synchronized E removeItem(){
        if (queue.isEmpty()){
            try {
                System.out.println("Consumer is in waiting for producer to produce Item");
                this.wait();

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        E item =queue.removeFirst();
        System.out.println("Consumer consumed Item : "+item+" And notifying producer to produce another Item");
        this.notifyAll();
        return item;
    }
}
