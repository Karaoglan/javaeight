package com.burak.java8features;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bk on 25/09/2017.
 */
public class CountItems {
  public static void main(String[] args) {
    System.out.println("creating list");

    List<String> strings = new ArrayList();
    long beforeFor = System.currentTimeMillis();

    for (int i = 0; i < 10000; i++) {
      strings.add("Item" + i);
    }
    long afterFor = System.currentTimeMillis();

    System.out.println("before: " + beforeFor);
    System.out.println("after: " + afterFor);
    System.out.println("difference: " + (afterFor - beforeFor));
    System.out.println("----------");

    long before = System.currentTimeMillis();
    strings.stream()
            .parallel()
            .forEach(str -> System.out.println(str));
    long after = System.currentTimeMillis();
    System.out.println("before: " + before);
    System.out.println("after: " + after);
    System.out.println("difference: " + (after - before));
  }
}
