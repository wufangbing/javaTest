package com.unicom.Collection;

import java.util.*;

public class CollectionPractice {
  public static void main(String[] args) {
    List<Staff> list1 = new ArrayList<Staff>();
    list1.add(new Staff("0301", "高企", 3000, "尚学堂", new Date()));
    list1.add(new Staff("0302", "马士兵", 3000, "尚学堂", new Date()));
    list1.add(new Staff("0303", "培新", 3000, "尚学堂", new Date()));
    System.out.println(list1.get(0).name);

    LinkedList list2 = new LinkedList();
    list2.add(new Staff("0301", "高企", 3000, "尚学堂", new Date()));
    list2.add(new Staff("0302", "马士兵", 3000, "尚学堂", new Date()));
    list2.add(new Staff("0303", "培新", 3000, "尚学堂", new Date()));
    System.out.println(((Staff)(list2.get(1))).name);


    Map map = new HashMap();  // 一个map对应一行记录
    map.put("id", 1001);
    map.put("name", "zzz");
    map.put("salary", 3000);
    map.put("company", "sz");
    map.put("time", "2017-07");

    Map map2 = new HashMap();
    map2.put("id", 1002);
    map2.put("name", "tb");
    map2.put("salary", 4000);
    map2.put("company", "sh");
    map2.put("time", "2017-08");

    Map map3 = new HashMap();
    map3.put("id", 1002);
    map3.put("name", "wfb");
    map3.put("salary", 1000);
    map3.put("company", "sh");
    map3.put("time", "2017-09");

    List<Map> mapp = new ArrayList<Map>();
    mapp.add(map);
    mapp.add(map2);
    mapp.add(map3);
    System.out.println(mapp.get(0));
  }

  public static void printListName(List<Staff> list) {
    for(int i = 0; i< list.size(); i++) {
      System.out.println(list.get(i).name);
    }
  }
}

// javabean,实体类
class Staff {
  String id;
  String name;
  int salary;
  String company;
  Date time;

  public Staff(String id, String name, int salary, String company, Date time) {
    this.id = id;
    this.name = name;
    this.salary = salary;
    this.company = company;
    this.time = time;
  }
}
