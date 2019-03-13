package com.unicom.oo2;

public class Testoo2 {
  public static void main(String[] args) {
    Student std1 = new Student("wfb", 180, "infoSafe");
    System.out.println(std1 instanceof Object);

    std1.rest();
    std1.study();
    System.out.println(std1.name);
    System.out.println(std1.height);
    System.out.println(std1.major);

    System.out.println(Person.size);
    Person.printSize();
  }
}

class Person {
  String name;
  int height;

  static int size = 100000;

  public static void printSize() {
    System.out.println(size);
  }

  public Person(String name, int height) {
    this.name = name;
    this.height = height;
  }

  public void rest() {
    System.out.println("休息一会");
  }
}

class Student extends Person{
  String major;
  public Student(String name, int height, String major) {
    super(name, height);
    this.major = major;
  }
  public void study() {
    System.out.println("学习一会");
  }
}
