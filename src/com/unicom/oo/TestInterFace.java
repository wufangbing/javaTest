package com.unicom.oo;

public class TestInterFace {
  public static void main(String[] args) {
    Volant v = new Angel();
    v.fly();

    Honest g = new GoodMan();
    g.helpOther();
  }
}

interface Volant {
  int FLY_HEIGHT = 1000;
  void fly();
}

interface Honest {
  void helpOther();
}


class Angel implements Volant, Honest {
  @Override
  public void fly() {
    System.out.println("i can fly");
  }

  @Override
  public void helpOther() {
    System.out.println("i like helpOther");
  }

}

class GoodMan implements Honest {
  @Override
  public void helpOther() {
    System.out.println("Good man");
  }
}

class Birdman implements Volant {
  @Override
  public void fly() {
    System.out.println("i can fly");
  }
}