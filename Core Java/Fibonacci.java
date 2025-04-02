import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        int n = 10, a = 0, b = 1, count = 0;
        do {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
            count++;
        } while (count < n);
    }
}