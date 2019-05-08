package com.unicom.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 类排序规则，重写comparable
 */
public class ComparableSort {
  public static void main(String[] args) {
    List list = new ArrayList();
    list.add(new SortTest("wfb", 20));
    list.add(new SortTest("djz", 18));
    list.add(new SortTest("aaa", 21));
    list.add(new SortTest("zzz", 19));
    System.out.println(list);
    Collections.sort(list);
    System.out.println(list);
  }
}

class SortTest implements Comparable<SortTest>{
  public String name;
  public int age;

  public SortTest(String name, int age) {
    this.name = name;
    this.age = age;
  }
  public int compareTo(SortTest obj) {
    if(this.age > obj.age) {
      return -1;
    } else if(this.age < obj.age) {
      return 1;
    }
    return 0;
  }
  public String toString() {
    return this.name;
  }
}
