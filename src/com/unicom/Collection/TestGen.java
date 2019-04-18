package com.unicom.Collection;

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
 * @param <T>
 */
class GenStudent<T> {
  T javaScorce;
  T orcaleScorce;

  public GenStudent(T javaScorce, T orcaleScorce) {
    this.javaScorce = javaScorce;
    this.orcaleScorce = orcaleScorce;
  }
}
