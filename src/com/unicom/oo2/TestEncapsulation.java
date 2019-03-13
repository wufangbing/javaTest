package com.unicom.oo2;

/**
 * 测试封装
 */
public class TestEncapsulation {
  public static void main(String[] args) {
    Boy h = new Boy();
    h.name = "wfb";
    h.printAge();
    h.sayHello();
  }
}

class Boy extends Human {
  void sayHello() {
    System.out.println(name);
  }
}
