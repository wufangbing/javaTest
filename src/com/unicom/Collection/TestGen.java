package com.unicom.Collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestGen {
  public static void main(String[] args) {
    // 存入整数 int -> Integer -> Object
    MyStudent s1 = new MyStudent(80, 90);

    // Object ->Integer -> int 1.7以后可以,1.6之前能转为Integer
    Object obj = 80;
    int score = (int)80;

    // 使用时指定类型
    GenStudent<String> stu = new GenStudent<String>("100", "100");
    System.out.println(stu.javaScorce);
    stu.printStr(new Date());
    System.out.println(stu.printStr1("abc"));;


    Son1 son1 = new Son1();
    son1.test("this is son1");

    Son2<String> son2 = new Son2<String>();
    son2.test("121231");




  }
}

class MyStudent {
  Object javase;
  Object oracle;
  public MyStudent(Object javase, Object oracle) {
    this.javase = javase;
    this.oracle = oracle;
  }
}

/**
 * 泛型类： 声明使用泛型
 * 泛型方法：返回类型前面
 * 方法随父类而定
 * @param <T>
 */
class GenStudent<T> {
  T javaScorce;
  T orcaleScorce;

  public GenStudent(T javaScorce, T orcaleScorce) {
    this.javaScorce = javaScorce;
    this.orcaleScorce = orcaleScorce;
  }

  // 传入时候决定
  public <T1> void printStr(T1 str) {
    System.out.println(str);
  }

  // 与父类相同
  public T printStr1(T str) {
    return str;
  }
}

/**
 * 泛型父类
 */

abstract class Father <M> {
  public abstract void test(M str);
}

// 子类声明指定类型
class Son1 extends Father <String> {
  @Override
  public void test(String str) {
    System.out.println(str);
  }
}

// 子类运行决定运行
class Son2<M> extends Father<M> {
  @Override
  public void test(M str) {
    System.out.println(str);
  }
}

// 子类为泛型类，父类不指定类型，父类泛型的擦除,使用Object替换
class Son3<M> extends Father {

  @Override
  public void test(Object str) {

  }
}

// 子类和父类同时擦除
class Son4 extends Father {
  @Override
  public void test(Object str) {

  }
}