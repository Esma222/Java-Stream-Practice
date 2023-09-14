package com.esmabeydili.streamapiexamples;

import java.util.List;
import java.util.stream.Collectors;

public class TaxService {

    public static List<Employee> evaluateTaxUsers(String input){
        if(input.equalsIgnoreCase("tax"))
         return DataBase.getEmployees().stream().filter(employee -> employee.getSalary() > 50000).collect(Collectors.toList());
        else
            return DataBase.getEmployees().stream().filter(employee -> employee.getSalary() <= 50000).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(evaluateTaxUsers("non tax"));
    }

}
