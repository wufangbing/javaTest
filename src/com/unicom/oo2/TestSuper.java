package com.unicom.oo2;

public class TestSuper {
  public static void main(String[] args) {
    ChildClass c1 = new ChildClass();
    c1.f();
  }
}

class FatherClass {
  public int value;
  public FatherClass() {
    System.out.println("创建FatherClass");
  }
  public void f() {
    value = 100;
    System.out.println();
  }
}

class ChildClass extends FatherClass {
  public int value;

  public ChildClass() {
    super();
    System.out.println("创建ChildClass");
  }

  public void f() {
    super.f(); // 调用父类的方法
    value = 200;
    System.out.println(value);
    System.out.println(super.value);
  }
}
