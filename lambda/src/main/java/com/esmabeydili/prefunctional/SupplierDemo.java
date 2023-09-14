package com.esmabeydili.prefunctional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo /*implements Supplier<String> */{
    /*@Override
    public String get() {
        return "Hi Esma";
    }*/

    public static void main(String[] args) {
        //Supplier<String> supplier  = new SupplierDemo();
        //Supplier<String> supplier = () ->"Hi Esmaa";
       // System.out.println(supplier.get());

        List<String> list1 = Arrays.asList();
        System.out.println(list1.stream().findAny().orElseGet(()->"Hi Esmaa"));

    }
}
