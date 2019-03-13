package com.unicom.oo;

/**
 * 抽象类
 */
public abstract class TestAnimal {
  public static int Length = 200;
  public int age = 100;

  abstract public void shout();

  public void run() {
    System.out.println("abstract");
  }

  public static void main(String[] args) {
    TestAnimal t = new Dog();
    t.run();
  }
}

class Dog extends TestAnimal {
  @Override
  public void shout() {}
  public void run() {
    System.out.println(Length);
  }
}
