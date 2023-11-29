package id;

import id.models.Employee;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Employee> employees = new LinkedList<>(Arrays.asList(

                new Employee(1, "John", "Doe"),
                new Employee(1, "Jane", "Smith"),
                new Employee(3, "Michael", "Johnson"),
                new Employee(4, "Emily", "Davis"),
                new Employee(4, "Robert", "Wilson"),
                new Employee(4, "Jennifer", "Brown"),
                new Employee(7, "David", "Taylor"),
                new Employee(8, "Sarah", "Miller"),
                new Employee(9, "Christopher", "Anderson"),
                new Employee(10, "Amanda", "Jones"),
                null
        ));

        List<Employee> listRepeatedId = new LinkedList<>();
        Map<Long, Employee> hashtable = new HashMap<>();

        Iterator<Employee> iteratorEmployees = employees.iterator();
        while(iteratorEmployees.hasNext()) {

            Employee employee = iteratorEmployees.next();

            if(null == employee) {
                iteratorEmployees.remove();
                continue;
            }

            final long id = employee.getId();

            if (hashtable.containsKey(id)) {
                listRepeatedId.add(employee);
                iteratorEmployees.remove();
            } else {
                hashtable.put(id, employee);
            }
        }


        System.out.println("employees");
        System.out.println(employees);
        System.out.println("hashtable");
        System.out.println(hashtable);
        System.out.println("listRepeatedId");
        System.out.println(listRepeatedId);





    }
}
