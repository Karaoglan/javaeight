package com.burak.java8features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by bk on 23/09/2017.
 */
public class StringUseComparator {
  public static void main(String[] args) {
    List<String> strings = new ArrayList<>();
    strings.add("EEE");
    strings.add("bbb");
    strings.add("CCC");
    strings.add("ddd");
    strings.add("AAA");

    Collections.sort(strings);
    System.out.println("simple sort without case insensitive");

    strings.forEach(str -> System.out.println(str));


    Collections.sort(strings, (arg1, arg2) -> arg1.compareToIgnoreCase(arg2));

    strings.forEach(str -> System.out.println(str));
  }
}
