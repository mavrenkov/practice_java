package day_09.Maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapPractice {

    public static void main(String[] args) {

        Map<String, Double> employees = new LinkedHashMap<>();
        employees.put("Tom", 150000.0 );
        employees.put("Bob", 120000.50 );
        employees.put("Rob", 130000.0 );
        employees.put("John", 140000.0);
        employees.put("Kyle", 120000.0);

        System.out.println(employees);
        System.out.println(employees.size() ); // returns how many pairs of data


        Set<String> employeesSet = employees.keySet();
        employeesSet.forEach(System.out::println);

        System.out.println("Salary of Kyle: $"+ employees.get("Kyle") );

        employees.remove("Kyle");

        System.out.println(employees);
        System.out.println(employees.size());

        boolean r1 = employees.containsKey("John");
        System.out.println(r1);

        System.out.println(employees);

        boolean r2 = employees.containsValue(120000.5);

        System.out.println(r2);

        boolean r3 = employees.containsValue(150000.0);

        System.out.println(r3);

        employees.clear();

        System.out.println(employees);

        System.out.println( employees.isEmpty() );





    }

}
