/**
 * 测试this
 */

public class TestThis {
  int x, y, z;
  static String name = "wfb";

  public TestThis(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public TestThis(int x, int y, int z) {
    this(x, y);
    this.z = z;
  }

  void printName() {
    sing();
  }

  static void sing() {
    System.out.println(name);
  }





  public static void main(String[] args) {
    TestThis obj = new TestThis(1,2,3);
    obj.printName();
  }
}
