package com.unicom.oo2;

import com.unicom.oo.User;

public class TestEqual {
  public static void main(String[] args) {

    Stu s1 = new Stu(100);
    Stu s2 = new Stu(100);
    System.out.println(s1 == s2);
    System.out.println(s1.equals(s2));

    String str1 = new String("aa");
    String str2 = new String("aa");
    System.out.println(str1 == str2);
    System.out.println(str1.equals(str2));
  }
}

class Stu {
  int age;
  public Stu(int age) {
    this.age = age;
  }

  @Override
  public boolean equals(Object obj) {
    Stu other = (Stu)obj;
    if(this.age == other.age) {
      return true;
    } else {
      return false;
    }
  }
}
