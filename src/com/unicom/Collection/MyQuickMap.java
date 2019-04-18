package com.unicom.Collection;

import java.util.LinkedList;

/**
 * 优化查询,map底层结构是数组+链表
 */
public class MyQuickMap {
  LinkedList[] arrs = new LinkedList[999];

  // 提高查询速度
  public void put(Object key, Object value) {
    SxtEntry e = new SxtEntry(key, value);
    int hash = key.hashCode();
    hash = hash < 0? -hash: hash;
    int index = hash%arrs.length;

    if(arrs[index] == null) {
      LinkedList list = new LinkedList();
      list.add(e);
      arrs[index] = list;
    } else {
      // 键值去重
      for (int i = 0; i< arrs[index].size(); i++) {
        SxtEntry e2 = (SxtEntry)arrs[index].get(i);
        if(e2.key.equals(key)) {
          e2.value = value;
          return ;
        }
      }
      arrs[index].add(e);
    }
  }

  public Object get(Object key) {
    int hash = key.hashCode();
    hash = hash < 0? -hash: hash;
    int index = hash%arrs.length;

    if(arrs[index] != null) {
      LinkedList list = arrs[index];
      for (int i = 0; i< list.size(); i++) {
        SxtEntry e = (SxtEntry)list.get(i);
        if(e.key.equals(key)) {
          return e.value;
        }
      }
    }
    return null;
  }

  public static void main(String[] args) {
    MyQuickMap myQuickMap = new MyQuickMap();
    myQuickMap.put("wfb", new Wife("djz"));
    myQuickMap.put("wfb", new Wife("zwq"));
    System.out.println(((Wife)(myQuickMap.get("wfb"))).name);
  }
}
