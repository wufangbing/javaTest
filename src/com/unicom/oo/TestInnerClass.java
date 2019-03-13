package com.unicom.oo;

/**
 * 内部类测试
 */
public class TestInnerClass {
  public static void main(String[] args) {
    // 创建内部类对象
    TestOuter.TestInner t = new TestOuter().new TestInner();
    t.show();

    // 创建静态内部类
    Outer2.TestStaticInner i = new Outer2.TestStaticInner();
    i.printInfo();
  }
}

class TestOuter {
  private int age = 10;
  public void testOuter() { }

  // 非静态内部类
  class TestInner {
    int age = 20;
    public void  show() {
      int age = 30;
      System.out.println("外部类的成员变量age:"+ TestOuter.this.age);
      System.out.println("内部类的成员变量age:"+ this.age);
      System.out.println("局部变量age:"+ age);
    }
  }
}

/**
 * 测试静态内部类
 */
class Outer2 {
  int age = 11;
  static class TestStaticInner {
    int age = 111;
    public void printInfo() {
      System.out.println("外部类的成员变量age:"+ age);
    }
  }
}

/**
 * 匿名内部类
 */

