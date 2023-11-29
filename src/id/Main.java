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

                new Employee(11, "Matthew", "Clark"),
                new Employee(11, "Megan", "Turner"),
                new Employee(13, "Kevin", "Hill"),
                new Employee(14, "Olivia", "Perez"),
                new Employee(15, "Daniel", "Evans"),
                new Employee(15, "Sophia", "Garcia"),
                new Employee(17, "Justin", "Moore"),
                new Employee(18, "Lauren", "Bailey"),
                new Employee(19, "Brandon", "Robinson"),
                new Employee(20, "Alexis", "White")
        ));

        List<Employee> listUniqueId = new LinkedList<>();
        List<Employee> listRepeatedId = new LinkedList<>();
        Map<Long, List<Employee>> hashtable = new HashMap<>();

        for(Employee employee : employees) {

            final long id = employee.getId();
            if(hashtable.containsKey(id)) {

                hashtable.get(id).add(employee);
            } else {
                hashtable.put(id, new ArrayList<Employee>(List.of(employee)));
            }
        }

        for(Map.Entry entry: hashtable.entrySet()) {

            List<Employee> list = (List<Employee>)entry.getValue();

            if(list.size() > 1) {

                listRepeatedId.addAll(list);
            } else {
                listUniqueId.addAll(list);
            }
        }

        System.out.println("list with unique IDs ");
        System.out.println(listUniqueId);
        System.out.println("list with repeated IDs ");
        System.out.println(listRepeatedId);

    }
}
