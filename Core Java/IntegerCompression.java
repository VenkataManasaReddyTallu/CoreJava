import java.util.*;
public class IntegerCompression {
    public static int encodeInteger(int num) {
        return num ^ (num >>> 16);
    }
    public static void main(String[] args) {
        System.out.println(encodeInteger(123456));
    }
}