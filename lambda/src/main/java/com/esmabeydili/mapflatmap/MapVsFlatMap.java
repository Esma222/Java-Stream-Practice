package com.esmabeydili.mapflatmap;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {

    public static void main(String[] args) {
        List<Customer> customers = EkartDataBase.getAll();

        //data transformation
        List<String> emailList = customers.stream().map(customer -> customer.getEmail()).collect(Collectors.toList());
        System.out.println(emailList);

        List<List<String>> phoneNumbersList = customers.stream().map(customer -> customer.getPhoneNumbers()).collect(Collectors.toList());
        System.out.println(phoneNumbersList);

        List<Object> allPhoneNumbers = customers.stream().flatMap(customer -> customer.getPhoneNumbers().stream()).collect(Collectors.toList());
        System.out.println("\n****************************\n"+allPhoneNumbers);

    }
}
