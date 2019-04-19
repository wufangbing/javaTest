package com.unicom;

import java.util.Iterator;

/**
 * 模拟iterator实现
 */
public class MyIterator implements Iterable<String>{
  String[] arr = {"a", "b", "c"};
  int size = arr.length;


  private class MyIt implements Iterator<String> {
    int current;
    public boolean hasNext() {
      return current < size;
    }

    public String next() {
      return arr[current++];
    }
    public void remove() {
    }
  }

  public Iterator<String> iterator() {
    return new MyIt();
  }

  public static void main(String[] args) {

    MyIterator list = new MyIterator();
    Iterator<String> it = list.iterator();

    while (it.hasNext()) {
      System.out.println(it.next());
    }

    for (String temp:list) {
      System.out.println(temp);
    }

  }


}
