import java.util.*;
//Implementing an Anonymous Class for Sorting
import java.util.*;
class SortingExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 3, 8, 1);
        Collections.sort(numbers, new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                return a - b;
            }
        });
        System.out.println("Sorted List: " + numbers);
    }
}