package com.unicom.Collection;

import java.util.*;

public class MyIterator {
  public static void main(String[] args) {
    List list = new ArrayList();
    list.add(111);
    list.add(222);
    list.add(333);

//    for (int i = 0; i < list.size(); i++) {
//      System.out.println(list.get(i));
//    }

    Iterator iter0 = list.iterator();
    while (iter0.hasNext()) {
      System.out.println(iter0.next());
    }


    Set set = new HashSet();
    set.add("aaa");
    set.add("bbb");
    set.add("ccc");

    Iterator iter = set.iterator();
    while (iter.hasNext()) {
      System.out.println(iter.next());
    }
  }
}
