package com.esmabeydili.mapflatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EkartDataBase {

    public static List<Customer> getAll(){
        return Stream.of(
         new Customer(1,"esma","esma@gmail.com", Arrays.asList("1111","22g2"))
        ,new Customer(2,"esra","esra@gmail.com", Arrays.asList("ee","2eeer2"))
        ,new Customer(3,"sema","sema@gmail.com", Arrays.asList("fvv1","2fv2"))
        ).collect(Collectors.toList());
    }

}
