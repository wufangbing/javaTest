package com.unicom.oo;

import com.unicom.oo2.PersonEncapsulation;

public class User {
  public static void main(String[] args) {
    PersonEncapsulation p = new PersonEncapsulation();
    p.setAge(100);
    System.out.println(p.getAge());
  }
}
