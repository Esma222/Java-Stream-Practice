package com.esmabeydili;

import java.util.Comparator;

interface Calculator{
    //void switchOn();

    //void sum(int input);

    int subtract(int i1,int i2);

}

public class CalculatorImpl{
    public static void main(String[] args) {

        //   ()  ->  (body); //syntax of lambda expression
/*
        Calculator calculator =() -> System.out.println("Switch On");

        calculator.switchOn();
*/

/*        Calculator calculator = (input)-> System.out.println("input is "+input);
        calculator.sum(300);
*/
        Calculator calculator = (i1, i2) -> {
            if(i2<i1){
                throw  new RuntimeException("Error Message : i2<i1");
            }else
            return i2 - i1;

        };
        System.out.println(calculator.subtract(2,9));

    }


}
