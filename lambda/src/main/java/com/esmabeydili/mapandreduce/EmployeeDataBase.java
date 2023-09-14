package com.esmabeydili.mapandreduce;

import com.esmabeydili.mapflatmap.Customer;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeDataBase {

    public static List<Employee> getAll(){
        return Stream.of(
                new Employee(1,"esma","A", 50000)
                ,new Employee(2,"esra","C", 40000)
                ,new Employee(3,"sema","A", 25000)
        ).collect(Collectors.toList());
    }
}
