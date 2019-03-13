package com.unicom.WrappedClass;

public class TestWrapperClass {
  public static void main(String[] args) {
    Integer a = new Integer(3);
    Integer b = Integer.valueOf(4);

    int c = b.intValue();
    double d = b.doubleValue();

    Integer e = new Integer("999");

    String f = e.toString();

//    System.out.println(Integer.MAX_VALUE);

    /**
     * 自动装箱
     */
    Integer g = 100;  // Integer.valueOf(100)
    int h = new Integer(200); // new Integer(200).intValue()

    Integer in1 = Integer.valueOf(-128);
    Integer in2 = Integer.valueOf(-128);
    System.out.println(in1 == in2);
    System.out.println(in1.equals(in2));
    System.out.println("############");
    Integer in3 = 1234;
    Integer in4 = 1234;
    System.out.println(in3 == in4);
    System.out.println(in3.equals(in4));
  }
}
