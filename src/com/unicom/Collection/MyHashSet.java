package com.unicom.Collection;

import java.util.*;

/**
 * 测试HashSet
 */
public class MyHashSet {
  public static void main(String[] args) {
    Set set = new HashSet(); // set不能重复
    set.add(new Name("w", "fb"));
    set.add(new Name("d", "jz"));
    set.add(new Name("z", "zz"));
//    set.remove("wfb");
//    set.remove(new Integer(100));
//    set.remove(new Name("w", "fb"));
    Iterator i1 = set.iterator();
    while(i1.hasNext()) {
      Name n = (Name)i1.next();
      System.out.println(n.firstName);
    }

    Map map = new HashMap();  // map不能重复
    map.put("wfb", 10);
    map.put("djz", 20);

//    Iterator iter = map.entrySet().iterator();
//    while(iter.hasNext()) {
//      Map.Entry entry = (Map.Entry)iter.next();
//      Object key = entry.getKey();
//      Object val = entry.getValue();
//      System.out.println(key);
//      System.out.println(val);
//    }


    List list = new ArrayList(); // ArrayList
    list.add(new Name("d", "jz"));
    list.add(new Name("l", "yp"));
//    Iterator i3 = list.iterator();
//    while(i3.hasNext()) {
//      System.out.println(i3.next());
//    }

    List list1 = new LinkedList(); // LinkedList
    list1.add(new Name("d", "jz"));
    list1.add(new Name("l", "yp"));
//    Iterator i4 = list1.iterator();
//    while(i4.hasNext()) {
//      System.out.println(i4.next());
//    }
  }

  public static void printEle() {
  }
}

// 重写hashCode和equals方法
class Name {
  public String firstName;
  public String lastName;
  public Name(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }
  public int hashCode() {
    return firstName.hashCode();
  }
  public boolean equals(Object obj) {
    Name n = (Name)obj;
    return firstName == n.firstName && lastName == n.lastName;
  }

//  public String toString() {
//    return this.firstName + this.lastName;
//  }
}
