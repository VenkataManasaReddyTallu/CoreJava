import java.util.*;
public class TypePromotion {
    public static void main(String[] args) {
        int i = 10;
        float f = 5.5f;
        double d = 20.5;
        char c = 'A';
        double result = i + f + d + c;
        System.out.println("Result of mixed type expression: " + result);
    }
}
