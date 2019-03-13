/**
 * 测试静态初始化
 */
public class TestStatic {
  int id;
  static String company;

  static {
    System.out.println("执行初始化工作");
    company = "深圳联通";
    printCompony();
  }

  public static void printCompony() {
    System.out.println(company);
  }

  public static void main(String[] args) {

  }
}
