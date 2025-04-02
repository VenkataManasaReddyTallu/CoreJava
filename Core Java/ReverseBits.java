import java.util.*;
public class ReverseBits {
    public static int reverseBits(int num) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result <<= 1;
            result |= (num & 1);
            num >>= 1;
        }
        return result;
    }
    public static void main(String[] args) {
        int num = 5;
        System.out.println("Reversed bits: " + reverseBits(num));
    }
}