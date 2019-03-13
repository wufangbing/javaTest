/**
 * 测试面向对象
 */
public class TestFaceObject {
  int id;
  String name;
  int age;
  Computer c;

  void printInfo() {
    System.out.println("我的名字叫"+ name + ",我使用的电脑是"+ c.branch);
  }

  public static void main(String[] args) {
    TestFaceObject obj = new TestFaceObject();
    obj.id = 123;
    obj.name = "wfb";
    obj.age = 18;

    Computer c1 = new Computer();
    c1.branch = "小米";

    obj.c = c1;
    obj.printInfo();
  }
}

class Computer {
  String branch;
}