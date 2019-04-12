package com.unicom.Exception;

public class MyException extends Exception {
  public MyException(String message) {
    super(message);
  }
}

class TestMyException {
  static void test() throws MyException {
    System.out.println("test");
  }
  public static void main(String[] args) {
    try {
      test();
    } catch (MyException e) {
      e.printStackTrace();
    }
  }
}
