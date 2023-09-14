package com.esmabeydili.mapandreduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MapAndReduceExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);

        int sum =0;
        for (int number : numbers) {
            sum+=number;
        }
        System.out.println(sum);

        int sum1= numbers.stream().mapToInt(i->i).sum();
        System.out.println(sum1);

        System.out.println(numbers.stream().reduce(0,(a,b)->a+b));

        Optional<Integer> reduceAndOptioanalSum= numbers.stream().reduce(Integer::sum);
        System.out.println(reduceAndOptioanalSum.get());

        System.out.println(numbers.stream().reduce(1,(a,b)->a*b));
        System.out.println(numbers.stream().reduce(1,(a,b)->a>b?a:b));
        System.out.println(numbers.stream().reduce(Integer::max).get());

        double averageSalary = EmployeeDataBase.getAll().stream().filter(employee -> employee.getGrade().equalsIgnoreCase("A"))
                .map(employee -> employee.getSalary()).mapToDouble(i -> i)
                .average().getAsDouble();
        System.out.println(averageSalary);
        EmployeeDataBase.getAll().stream().filter(employee -> employee.getGrade().equalsIgnoreCase("A")).filter(employee -> employee.getSalary()>25000).forEach(employee -> System.out.println(employee.getName()));

    }
}
