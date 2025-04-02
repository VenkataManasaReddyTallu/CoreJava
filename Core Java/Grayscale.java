import java.util.*;
public class Grayscale {
    public static int toGrayscale(int r, int g, int b) {
        return (r * 30 + g * 59 + b * 11) / 100;
    }
    public static void main(String[] args) {
        System.out.println("Grayscale value: " + toGrayscale(100, 150, 200));
    }
}
