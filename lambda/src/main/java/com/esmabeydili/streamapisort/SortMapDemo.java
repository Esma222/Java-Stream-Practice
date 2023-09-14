package com.esmabeydili.streamapisort;

import com.esmabeydili.streamapiexamples.Employee;

import java.util.*;

public class SortMapDemo {

    public static void main(String[] args) {
        Map<String,Integer> hMap = new HashMap<>();
        hMap.put("eight",8);
        hMap.put("two",2);
        hMap.put("seven",7);
        hMap.put("four",4);
        hMap.put("ten",10);

        List<Map.Entry<String,Integer>> entries = new ArrayList<>(hMap.entrySet());
        Collections.sort(entries,(o1,o2)->  o1.getKey().compareTo(o2.getKey()));

        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

        hMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        hMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

        Map<Employee,Integer> empMap=new TreeMap<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o1.getSalary()-o2.getSalary());
            }
        });
        empMap.put(new Employee(1,"ESMA","CENG",50000),12);
        empMap.put(new Employee(5,"ESRA","EEE",45200),23);
        empMap.put(new Employee(4,"ELA","CE",90000),10);
        System.out.println("\n********************\n"+empMap);

        empMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary))).forEach(System.out::println);

    }

}
