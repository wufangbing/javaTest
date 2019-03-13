package com.unicom.oo;


public interface MyInterFace {
  int Max = 100;
  void test();
}

class ChildInterFace implements MyInterFace {
  public void test() {
    System.out.println(MyInterFace.Max);
  }
}