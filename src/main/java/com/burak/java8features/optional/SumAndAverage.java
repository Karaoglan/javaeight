package com.burak.java8features.optional;

import com.burak.java8features.predicate.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

/**
 * Created by bk on 29/09/2017.
 */
public class SumAndAverage {
  public static void main(String[] args) {
    List<Person> people = new ArrayList<>();

    people.add(new Person("Mehmet", 18));
    people.add(new Person("Veli", 30));
    people.add(new Person("Ali", 25));

    int sum = people.stream()
            .mapToInt(p -> p.getAge())
            .sum();
    System.out.println("total age : " + sum);

    OptionalDouble avg = people.stream()
            .mapToInt(p -> p.getAge())
            .average();

    if (avg.isPresent()) {
      System.out.println("Average is : " + avg.getAsDouble());
    } else {
      System.out.println("Average not calculated");
    }
  }
}
