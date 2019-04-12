package com.unicom.Collection;

import java.util.HashMap;
import java.util.Map;

/**
 * 测试Map基本用法
 */
public class TestMap {
  public static void main(String[] args) {
    Map map = new HashMap();
    map.put("wfb", new Wife("张曼玉"));
    map.put("zzz", new Wife("刘亦菲"));
//    map.remove("wfb");
    Wife wife = (Wife)map.get("wfb");
    System.out.println(wife.name);
    System.out.println(map.containsKey("wfb"));
  }
}


class Wife {
  String name;
  public Wife(String name) {
    this.name = name;
  }
}