package com.burak.java8features;

import com.burak.java8features.predicate.Person;

/**
 * Created by bk on 25/09/2017.
 */
public interface PersonInterface {
  String getName();
  void setName(String name);
  int getAge();
  void setAge(int age);

  default String getPersonInfo() {
    return getName() + " (" + getAge() + ")";
  }

  static String getPersonInfo(Person person) {
    return person.getName() + " (" + person.getAge() + ")";

  }
}
