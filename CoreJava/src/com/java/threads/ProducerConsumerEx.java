package com.java.threads;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerEx {
    public static void main(String[] args) {
        //Queue<Integer> queue=new LinkedList<>();
        BlockingQueue<Integer> queue=new ArrayBlockingQueue<>(5);
//        MyBlockingQue<Integer> queue=new MyBlockingQue<>(new LinkedList<>());

        Thread producer=new Thread(()->{
            /*try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }*/
            for (int i=1;i<=5;i++){
                try {
                    Thread.sleep(1000);
                    queue.put(i);

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Produced"+i);
            }
        });

        Thread consumer=new Thread(()->{
            try {
                while (true){
                    int i =queue.take();
                    if (i==0){
                        System.out.println("0");
                    }
                    System.out.println("consumed"+i);
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });

        producer.start();
        consumer.start();

    }
}
