package com.esmabeydili;

@FunctionalInterface
public interface MyFunctionalInterface {

    void m1();
    //void m18();//ERROR because funtional interface contains only one abstract method

    default  void m2(){
        System.out.println("default method-1");
    }

    default  void m3(){
        System.out.println("default method-2");
    }
    static  void m4(){
        System.out.println("static method-1");
    }

}
