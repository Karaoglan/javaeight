package com.burak.java8features.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by bk on 23/09/2017.
 */
public class PredicateInnerClass {
  public static void main(String[] args) {
    List<Person> people = new ArrayList();
    people.add(new Person("mike", 69));
    people.add(new Person("fred", 64));
    people.add(new Person("jenny", 65));
    people.add(new Person("fenny ", 35));
    people.add(new Person("kenny", 25));

    Predicate<Person> predicateOld = (person) -> person.getAge() >= 65;
    Predicate<Person> predicateYoung = (person) -> person.getAge() <= 35;

    System.out.println("predicate old");
    displayPeople(people, predicateOld);
    System.out.println("------------");
    System.out.println("predicate young");
    displayPeople(people, predicateYoung);
  }

  private static void displayPeople(List<Person> people, Predicate<Person> predicate) {
    people.forEach(person -> {
      if (predicate.test(person)) {
        System.out.println(person);
      }
    });
  }
}
