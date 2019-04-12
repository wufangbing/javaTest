package com.unicom.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestCollection {
  public static void main(String[] args) {
    List list = new ArrayList();
    list.add("aaa");
    list.add(new Integer(123));
    list.add(new Dog());
    list.add(true);
    System.out.println(list.size());
    list.remove(new Dog());
    System.out.println(list.size()); // 4
    list.remove("aaa");
    System.out.println(list.size());  //3

    Integer i = (Integer)list.get(0);
    System.out.println(i);
  }
}

class Dog {
}