package com.unicom.Collection;

import java.util.ArrayList;
import java.util.List;

public class Genericity {
  public static void main(String[] args) {

    // 泛型由来，强制解决容器放置同一类对象，类型清晰
    List<String> list = new ArrayList<String>();
    list.add("aaa");
    list.add("bbb");
    list.add("ccc");

    for (int i = 0; i < list.size(); i++) {
//      System.out.println(list.get(i));
    }

    Box<Integer> a = new Box<Integer>(100);
    Box<String> b = new Box<String>("bbb");

    Box<Number> c = new Box<Number>(100);
    Box<Integer> d = new Box<Integer>(99);
    Box<String> e = new Box<String>("88");

    // d不能看成c的子类
//    getData(c);
//    getData(d);

    // 可以用通配符解决
    getData2(c);
    getData2(d);

    // 通配符上限
    getData3(c);
    getData3(d);
    //getData3(e);  //只能为Number或者其子类



  }

  public static void getData(Box<Number> data) {
    System.out.println(data.getData());
  }

  public static void getData2(Box<?> data) {
    System.out.println(data.getData());
  }
  public static void getData3(Box<? extends Number> data) {
    System.out.println(data.getData());
  }
}

// 自定义泛型类和方法
class Box<T> {
  T data;

  public Box(T data) {
    this.data = data;
  }

  public T getData() {
    return data;
  }
}
