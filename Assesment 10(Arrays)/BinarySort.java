import java.util.*;
// Sort an Array of 0s and 1s (Binary Sort) in O(n)
class BinarySort {
    static void sortBinary(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            while (arr[left] == 0 && left < right) left++;
            while (arr[right] == 1 && left < right) right--;
            if (left < right) {
                arr[left] = 0;
                arr[right] = 1;
                left++;
                right--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 1, 0};
        sortBinary(arr);
        System.out.println("Sorted Binary Array: " + Arrays.toString(arr));
    }
}