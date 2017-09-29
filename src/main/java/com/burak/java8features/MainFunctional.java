package com.burak.java8features;

/**
 * Created by bk on 23/09/2017.
 */
public class MainFunctional {

  public static void main(String[] args) {
    TestInterface tester = () -> System.out.println("Burak Karaoglan");
    tester.test();

    FunctionalInterfaceWithParams inter = (arg1, arg2) -> {
      String result = arg1 + " - " + arg2;
      System.out.println("result is: " + result);
    };
    inter.test(1, "burak");
  }
}
