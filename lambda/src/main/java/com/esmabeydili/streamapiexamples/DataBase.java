package com.esmabeydili.streamapiexamples;

import java.util.ArrayList;
import java.util.List;

public class DataBase {

    public  static List<Employee> getEmployees(){
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1,"ESMA","CENG",50000));
        list.add(new Employee(5,"ESRA","EEE",45200));
        list.add(new Employee(4,"ELA","CE",90000));
        return  list;
    }

}
