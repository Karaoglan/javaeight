package com.burak.java8features;

/**
 * Created by bk on 23/09/2017.
 */
public class RunnableMain {
  public static void main(String[] args) {
    Runnable r = () -> System.out.println("Hello");
    new Thread(r).start();
    System.out.println("after thread");
  }
}
