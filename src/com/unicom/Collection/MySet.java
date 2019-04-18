package com.unicom.Collection;

import java.util.HashMap;

/**
 * 测试hashSet常用方法
 * 自定义set
 */
public class MySet {
  HashMap map = new HashMap();
  private static final Object PRESENT = new Object();

  public void add(Object o) {
    map.put(o, PRESENT);
  }

  public void remove(Object o) {
    map.remove(o);
  }

  public boolean contains(Object o) {
    return map.containsKey(o);
  }

  public static void main(String[] args) {
    MySet mySet = new MySet();
    mySet.add("aaa");
    System.out.println(mySet.contains("aaa"));
    mySet.remove("aaa");
    System.out.println(mySet.contains("aaa"));
  }
}
