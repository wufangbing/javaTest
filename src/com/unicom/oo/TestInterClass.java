package com.unicom.oo;

/**
 * 测试内部类
 */
public class TestInterClass {
  public static void main(String[] args) {
    Outer outer = new Outer(); // 外部类对象

    // 非静态内部类
    Outer.Inner inner = new Outer().new Inner();
    inner.show();

    // 静态内部类
    Outer.StaticInner staticInner = new Outer.StaticInner();
    System.out.println(staticInner.name);

    // 匿名内部类,只使用一次
    TestInterClass.test01(new A(){
      @Override
      public void aa() {
        System.out.println("这个是匿名内部类");
      }
    });
  }

  public static void test01(A a) {
    a.aa();
  }
}

class Outer {
  private int age = 10;

  public void testOuter() {
    System.out.println("outer");
  }

  // 非静态内部类
  class Inner {
    int age = 20;
    public void show() {
      int age = 30;
      System.out.println("外部类属性" + Outer.this.age);
      System.out.println("内部类属性" + this.age);
      System.out.println("局部变量" + age);
    }
  }

  // 静态内部类
  static class StaticInner {
    String name = "wfb";
  }

}

// 匿名内部类
interface A {
  void aa();
}

