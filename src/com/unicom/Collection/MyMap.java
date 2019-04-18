package com.unicom.Collection;

import java.util.Date;

/**
 * 存放键值对,根据键找value，键不能重复
 */
public class MyMap {
  SxtEntry[] arr = new SxtEntry[990];
  int size;

  public void put(Object key, Object value) {
    SxtEntry e = new SxtEntry(key, value);
    // 键值重复的处理
    for (int i = 0; i < size; i++) {
      if(arr[i].key.equals(key)) {
        arr[i].value = value;
        return ;
      }
    }
    arr[size++] = e;
  }
  // 时间复杂度n
  public Object get(Object key) {
    for (int i = 0; i < size; i++) {
      if(arr[i].key.equals(key)) {
        return arr[i].value;
      }
    }
    return null;
  }
  public void remove(Object key) {
    for (int i = 0; i < size; i++) {
      if(arr[i].key.equals(key)) {
        System.arraycopy(arr, i + 1, arr, i, size - i - 1);
      }
      arr[--size] = null;
    }
  }

  public Boolean containsKey(Object key) {
    for (int i = 0; i < size; i++) {
      if(arr[i].key.equals(key)) {
        return true;
      }
    }
    return false;
  }
  public static void main(String[] args) {
    MyMap myMap = new MyMap();

    myMap.put("wfb", "cool");
    myMap.put("zzz", new Wife("小哲玛利亚1"));
    myMap.put("zzz", new Wife("小哲玛利亚2"));

    System.out.println(((Wife)(myMap.get("zzz"))).name);
  }
}

class SxtEntry {
  Object key;
  Object value;
  SxtEntry(Object key, Object value) {
    this.key = key;
    this.value = value;
  }
}