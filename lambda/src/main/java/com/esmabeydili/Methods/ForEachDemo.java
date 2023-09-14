package com.esmabeydili.Methods;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class ForEachDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("esma");
        list.add("esra");
        list.add("nisa");
        list.add("ali");
        list.add("veli");
        for (String s : list) {
            if (s.startsWith("e"))
              System.out.println("* "+s);
        }

        list.stream().forEach(s-> System.out.println(s));
        list.stream().filter(s->s.startsWith("e")).forEach(s-> System.out.println("* "+s));

        Map<String,Integer> hMap= new HashMap<>();
        hMap.put("esma",9);
        hMap.put("nisa",6);
        hMap.put("derya",5);

        hMap.forEach((key, value)-> System.out.println(key+": "+ value));
        hMap.entrySet().stream().forEach(obj-> System.out.println(obj.getKey()+" : "+obj.getValue()));

        hMap.entrySet().stream().filter(value-> value.getValue()%2 ==0).forEach(obj-> System.out.println("** "+obj.getKey()+" : "+obj.getValue()));


        Consumer<String> consumer = (t)-> System.out.println(t);
        consumer.accept("hi barbie");
        for (String s : list) {
            consumer.accept(" hi barbie ,hi "+s );
        }
        list.stream().forEach(s-> System.out.println(" hi barbie ,hi "+s));

    }
}
