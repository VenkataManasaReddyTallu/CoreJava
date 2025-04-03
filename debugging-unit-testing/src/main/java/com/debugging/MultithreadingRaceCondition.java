package com.debugging;

class SharedCounter {
    private int count = 0;

    public void increment() {
        count++;  // Race condition occurs here
    }

    public int getCount() {
        return count;
    }
}

public class MultithreadingRaceCondition {
    public static void main(String[] args) {
        SharedCounter counter = new SharedCounter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Count: " + counter.getCount()); // Expected 2000, but incorrect due to race condition
    }
}
