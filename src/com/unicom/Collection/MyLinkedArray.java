package com.unicom.Collection;

public class MyLinkedArray {
  private Node first;
  private Node last;
  private int size;

  public MyLinkedArray() {}

  public void add(Object obj) {
    if(first == null) {
      // todo 第一次加节点
      Node n = new Node();
      n.previous = null;
      n.obj = obj;
      n.next = null;

      first = n;
      last = n;
    } else {
      // todo 向last节点后加节点
      Node n = new Node();
      n.previous = null;
      n.obj = obj;
      n.next = null;

      last.next = n;
      last = n;
    }

    size++;
  }

  public void add(int index, Object obj) {
    Node up = null;
    Node temp = first;
    for(int i= 0; i < index; i++) {
      up = temp;
      temp = temp.next;
    }

    Node n = new Node();
    n.previous = null;
    n.obj = obj;
    n.next = null;

    if(temp == first) {
      n.next = first;
      first.next = n;
    } else {
      n.next = temp;
      up.next = n;
    }
    size++;
  }

  public void remove(int index) {
    rangCheck(index);
    Node up = null;
    Node temp = first;
    for(int i= 0; i < index; i++) {
      up = temp;
      temp = temp.next;
    }
    if(temp == first) {
      first = first.next;
    } else {
      up.next = temp.next;
    }
    size--;
  }



  public int size() {
    return size;
  }

  public Object get(int index) {

    rangCheck(index);

    Node temp = first;
    for(int i= 0; i < index; i++) {
      temp = temp.next;
    }
    return temp.obj;
  }


  public static void main(String[] args) {
    MyLinkedArray list = new MyLinkedArray();
    list.add("aaa");
    list.add("bbb");
    list.add("ccc");
//    list.add("ddd");
//    System.out.println(list.size);
//    System.out.println(list.get(40));
//    list.remove(2);
//    System.out.println(list.get(2));
//    list.add(1, "bbb");
    System.out.println(list.get(0));
    System.out.println(list.get(1));
    System.out.println(list.get(2));
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

/**
 * 表示一个节点
 */
class Node {
  Node previous;
  Object obj;
  Node next;

  Node() { }
}


