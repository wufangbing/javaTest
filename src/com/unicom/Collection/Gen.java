package com.unicom.Collection;

import java.util.*;

public class Gen {
  public static void main(String[] args) {
    System.out.println("gen");
    String[] strarr = {"aa", "bb", "cc", "aa", "bb"};
    Map map = new HashMap();
    for (String temp:strarr) {
      if(null == map.get(temp)) {
        map.put(temp, 1);
      } else {
        int num = (Integer) map.get(temp);
        map.put(temp, num +1);
      }
    }

    List<String> list = new ArrayList<String>();
    list.add("aaa");
    list.add("bbb");
    list.add("ccc");
//    System.out.println(list.get(0) instanceof String);

    Collection<String> c2 = new HashSet<String>();
    c2.add("aaa");
    c2.add("bbb");
    c2.add("ccc");
    for (Iterator<String> it = c2.iterator(); it.hasNext();) {
      String s = it.next();
      System.out.println(s);
    }

  }
}
