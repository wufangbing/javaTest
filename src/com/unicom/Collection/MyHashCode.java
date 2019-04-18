package com.unicom.Collection;

public class MyHashCode {
  public static void main(String[] args) {
    Student s1 = new Student(100, "wfb");
    Student s2 = new Student(100, "zzz");
    if(s1.equals(s2)) System.out.println("s1==s2");
    else System.out.println("s1 !=s2");
  }
}

class Student extends Object {
  int id;
  String name;

  Student(int id, String name) {
    this.id = id;
    this.name = name;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + id;
    return result;
  }

//  @Override
  public boolean equals(Object obj) {
    if(obj instanceof Student) {
      Student s = (Student)obj;
      if(this.id == s.id) {
        return true;
      }
    }
    return false;
  }

}
