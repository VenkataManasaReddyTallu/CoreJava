import java.util.*;
import java.io.*;
//Multi-Threaded Exception Handling
class Task implements Runnable {
    @Override
    public void run() {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println(Thread.currentThread().getName() + " caught: " + e.getMessage());
        }
    }
}

public class MultiThreadException {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Task());
        Thread t2 = new Thread(new Task());
        t1.start();
        t2.start();
    }
}