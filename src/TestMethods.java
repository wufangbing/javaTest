/**
 * 测试方法
 */
public class TestMethods {
  public static void main(String[] args) {
    TestMethods obj = new TestMethods();
    obj.printSxt();
    add(1);
    add(1,2,3);
  }
  void printSxt() {
    System.out.println("中国联通");
  }

  static void add(int a) {
    System.out.println(a);
  }

  static void add(int a, int b, int c) {
    System.out.println(a + b + c);
  }
}
