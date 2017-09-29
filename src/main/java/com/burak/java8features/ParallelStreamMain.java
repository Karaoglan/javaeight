package com.burak.java8features;

import com.burak.java8features.predicate.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by bk on 25/09/2017.
 */
public class ParallelStreamMain {
  public static void main(String[] args) {
    List<Person> persons = new ArrayList();
    persons.add(new Person("ahmet", 10));
    persons.add(new Person("mehmet", 30));

    Predicate<Person> ageUnderTwenty = (p) -> p.getAge() < 20;

    persons.stream()
            .parallel()
            .filter(ageUnderTwenty)
            .forEach(p -> System.out.println(p.getPersonInfo()));

  }
}
