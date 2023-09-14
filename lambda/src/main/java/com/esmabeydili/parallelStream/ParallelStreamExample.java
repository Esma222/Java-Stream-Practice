package com.esmabeydili.parallelStream;

import com.esmabeydili.mapandreduce.Employee;
import com.esmabeydili.mapandreduce.EmployeeDataBase;

import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class ParallelStreamExample {
    public static void main(String[] args) {
        long start =0;
        long end=0;
        start = System.currentTimeMillis();
        IntStream.range(1,100).forEach(System.out::println);
        end=System.currentTimeMillis();
        long result1=end-start;
        System.out.println(result1+"***\n");

        System.out.println("*************************************************************");

        start = System.currentTimeMillis();
        IntStream.range(1,100).parallel().forEach(System.out::println);
        end=System.currentTimeMillis();
        long result2 = end- start;
        System.out.println(result2+"***"+result1+"\n");

        IntStream.range(1,10).forEach(x->
                System.out.println("*Thread : "+Thread.currentThread().getName()+" : "+x));

        IntStream.range(1,10).parallel().forEach(x->
                System.out.println("parallel : "+Thread.currentThread().getName()+" : "+x));

        long result3=0;
        List<Employee> employees = EmployeeDataBase.getAll();
        start=System.currentTimeMillis();
        double salaryWithStream = employees.stream().map(Employee::getSalary).mapToDouble(i -> i).average().getAsDouble();
        end=System.currentTimeMillis();
        result3= end-start;
        System.out.println(result3+"******************");

        start=System.currentTimeMillis();
        double salaryWithParallelStream = employees.parallelStream().map(Employee::getSalary).mapToDouble(i -> i).average().getAsDouble();
        end=System.currentTimeMillis();
         result3= end-start;
        System.out.println(result3+"******************");

    }
}
