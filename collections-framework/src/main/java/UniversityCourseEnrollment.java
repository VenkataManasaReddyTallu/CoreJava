import java.util.*;

public class UniversityCourseEnrollment {
    public static void main(String[] args) {
        LinkedList<String> courses = new LinkedList<>();
        courses.add("Math 101");
        courses.add("Physics 101");
        courses.add("Computer Science 101");

        // Using Iterator
        Iterator<String> iterator = courses.iterator();
        while (iterator.hasNext()) {
            System.out.println("Course: " + iterator.next());
        }

        // Using ListIterator (forward and backward)
        ListIterator<String> listIterator = courses.listIterator();
        while (listIterator.hasNext()) {
            System.out.println("Course: " + listIterator.next());
        }
    }
}
