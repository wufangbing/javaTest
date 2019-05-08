package com.unicom.Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {
  public static void main(String[] args) {
    String str = "aa bb cc aa";
    String[] strArray = str.split(" ");
    Map<String, Letter> map = new HashMap<String, Letter>();

    for (String temp:strArray) {
      if(map.containsKey(temp) == true) {
        int num = map.get(temp).getNum();
        map.put(temp, new Letter(num + 1));
      } else {
        map.put(temp, new Letter(1));
      }
    }

    // 输出map的值
    Set<String> keys = map.keySet();
    for (String key:keys) {
      System.out.println("字母:" + key + ", 次数" + map.get(key).getNum());
    }
  }
}

class Letter {
  int num;
  Letter() {
  }
  Letter(int num) {
    this.num = num;
  }
  public int getNum() {
    return this.num;
  }
}
