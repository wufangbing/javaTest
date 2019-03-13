package com.unicom.oo2;

/**
 * 测试多态
 */
public class TestPolym {
  public static void main(String[] args) {
    Animal a = new Animal();
    a.shout();
    Animal c = new Cat();
    c.shout();

    Animal d = new Dog();
    d.shout();
    Dog dd = (Dog) d;
    dd.openDoor();
  }
}

class Animal {
  public void shout() {
    System.out.println("叫了一声");
  }
}

class Cat extends Animal {
  public void shout() {
    System.out.println("喵喵喵喵");
  }
}

class Dog extends Animal {
  public void shout() {
    System.out.println("汪汪汪汪");
  }

  public void openDoor() {
    System.out.println("开门");
  }
}
