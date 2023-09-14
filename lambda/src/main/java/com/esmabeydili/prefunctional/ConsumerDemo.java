package com.esmabeydili.prefunctional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo /*implements java.util.function.Consumer<Integer>*/ {
    /*@Override
    public void accept(Integer t) {
        System.out.println("print : "+t);
    }*/

    public static void main(String[] args) {
        // new ConsumerDemo().accept(7);
        /*Consumer<Integer> consumer = (t) -> {System.out.println("print : " + t);};
        consumer.accept(12);
*/
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6);
        list1.stream().forEach(t -> System.out.println("print : " + t));

    }
}
