package com.esmabeydili.mapflatmap;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {

    public static Customer getCustomerByEmailId(String email){
        List<Customer> customers= EkartDataBase.getAll();
        return  customers.stream().filter(customer -> customer.getEmail().equals(email)).findAny().orElseThrow(()-> new IllegalArgumentException("can't find"));
    }

    public static void main(String[] args) {
        Customer customer = new Customer(1, "esma", "test@gmail.com", Arrays.asList("1111", "22g2"));
        //empty
        //of
        //ofNullable
        Optional<Object> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);

//        Optional<String> emailOptional = Optional.of(customer.getEmail());
//        System.out.println(emailOptional);

        Optional<String> emailOptional2 = Optional.ofNullable(customer.getEmail());
        //System.out.println(emailOptional2.orElse("default@gmail.com"));
        /*if(emailOptional2.isPresent()){
            System.out.println(emailOptional2.get());
        }*/
        //System.out.println(emailOptional2.orElseThrow(()->new IllegalArgumentException("email not present")));
        System.out.println(emailOptional2.map(String::toUpperCase).orElseThrow(()->new IllegalArgumentException("email not present")));
        System.out.println(getCustomerByEmailId("www"));

    }

}
