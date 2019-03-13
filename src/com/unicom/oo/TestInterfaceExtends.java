package com.unicom.oo;

public class TestInterfaceExtends {
  public static void main(String[] args) {
    CC c = new MySubClass();
    c.testa();
    c.testb();
    c.testc();
  }
}

interface AA {
  void testa();
}

interface BB {
  void testb();
}

interface CC extends AA, BB {
  void testc();
}

class MySubClass implements CC {
  @Override
  public void testa(){
    System.out.println("testa");
  }
  @Override
  public void testb() {
    System.out.println("testb");
  }
  @Override
  public void testc(){
    System.out.println("testc");
  }
}
