import java.util.*;

public class StudentExamResultsAnalyzer {
    public static void main(String[] args) {
        Map<String, Integer> studentResults = new HashMap<>();
        studentResults.put("John", 85);
        studentResults.put("Jane", 92);

        TreeMap<String, Integer> sortedResults = new TreeMap<>(studentResults);
        sortedResults.forEach((name, score) -> System.out.println(name + ": " + score));
    }
}
