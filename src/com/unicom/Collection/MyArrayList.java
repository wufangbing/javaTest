package com.unicom.Collection;

import com.sun.xml.internal.ws.api.model.CheckedException;

/**
 * 实现ArrayList
 */
public class MyArrayList {
  private Object[] ElementData;
  private int size;

  public int size() {
    return size;
  }
  public boolean isEmpty() {
    return size == 0;
  }

  public MyArrayList() {
    this(3);
  }

  public MyArrayList(int initialCapacity) {
    if(initialCapacity < 0) {
      try {
        throw new Exception();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    ElementData = new Object[initialCapacity];
  }

  public void add(Object obj) {
    // 数组扩容
    if(size ==  ElementData.length) {
      Object[] newArray = new Object[size * 2 + 1];
      System.arraycopy(ElementData, 0, newArray, 0, ElementData.length);
      ElementData = newArray;
    }
    ElementData[size++] = obj;
  }
  public void add(int index, Object obj) {
    rangCheck(index);
    // 数组扩容
    if(size ==  ElementData.length) {
      Object[] newArray = new Object[size * 2 + 1];
      System.arraycopy(ElementData, 0, newArray, 0, ElementData.length);
      ElementData = newArray;
    }
    System.arraycopy(ElementData, index, ElementData, index + 1, size - index - 1);
    ElementData[index] = obj;
  }

  public Object get(int index) {
    rangCheck(index);
    return ElementData[index];
  }

  public void remove(int index) {
    rangCheck(index);
    System.arraycopy(ElementData, index + 1, ElementData, index, size - index - 1);
    ElementData[--size] = null;
  }

  public int remove(Object obj) {
    int i;
    for (i = 0; i < size; i++) {
      if(obj.equals(ElementData[i])) {
        remove(i);
        return i;
      }
    }
    return -1;
  }

  public void set(int index, Object obj) {
    rangCheck(index);
    ElementData[index] = obj;
  }

  public static void main(String[] args) {
    MyArrayList arr = new MyArrayList();
    arr.add("123");
    arr.add("124");
    arr.add("125");
    arr.add("126");
    arr.add("127");
//    System.out.println(arr.size());
//    System.out.println(arr.isEmpty());
//    System.out.println(arr.get(3));
//    arr.remove(3);
//    System.out.println(arr.get(3));
//    System.out.println(arr.remove("127"));
//    System.out.println(arr.get(3));

//    arr.set(0, "000");
//    System.out.println(arr.get(0));
    arr.add(4, "12333");
    System.out.println(arr.get(4));




  }

  private void rangCheck(int index) {
    if(index < 0 || index >= size) {
      try {
        throw new IndexOutOfBoundsException();
      } catch (IndexOutOfBoundsException e) {
        e.printStackTrace();
      }
    }
  }

}
