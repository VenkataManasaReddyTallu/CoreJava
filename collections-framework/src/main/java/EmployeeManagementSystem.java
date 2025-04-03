import java.util.*;

public class EmployeeManagementSystem {

    static class Employee {
        String name;
        int id;

        Employee(String name, int id) {
            this.name = name;
            this.id = id;
        }

        @Override
        public String toString() {
            return "Employee{id=" + id + ", name='" + name + "'}";
        }
    }

    public static void main(String[] args) {
        // Using List
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("John", 101));
        employeeList.add(new Employee("Jane", 102));

        // Using Set
        Set<Employee> employeeSet = new HashSet<>(employeeList);

        // Using Map
        Map<Integer, Employee> employeeMap = new HashMap<>();
        for (Employee emp : employeeList) {
            employeeMap.put(emp.id, emp);
        }

        // Using Comparator to sort employees
        employeeList.sort(Comparator.comparing(emp -> emp.name));
        System.out.println("Sorted Employees: " + employeeList);
    }
}
