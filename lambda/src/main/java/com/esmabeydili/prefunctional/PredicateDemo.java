package com.esmabeydili.prefunctional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo /*implements Predicate<Integer>*/ {
   /* @Override
    public boolean test(Integer t) {

        if(t%2==0)
            return true;
        else
            return false;
    }*/

    public static void main(String[] args) {
       //boolean predicate= new PredicateDemo().test(8);

       /* Predicate<Integer> predicate =t -> t % 2 == 0;
       *//* if(t % 2 == 0)
        {         return true;}
        else
        {     return false;}
        ;*//*
        System.out.println(predicate.test(6));*/

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6);
        list1.stream().filter(t->t % 2 == 0).forEach(t -> System.out.println("print even : "+t));


    }
}
