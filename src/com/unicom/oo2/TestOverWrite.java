package com.unicom.oo2;

/**
 * 测试重写
 */
public class TestOverWrite {
  public static void main(String[] args) {
    Horse h = new Horse();
    h.run();
  }
}

class Vehicle {
  public void run() {
    System.out.println("跑...");
  }

  public void stop() {
    System.out.println("停止");
  }
}

class Horse extends Vehicle {
  public void run() {
    System.out.println("跑的贼块");
  }
}
