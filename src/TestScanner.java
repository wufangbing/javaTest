import java.util.Scanner;
/**
 * 测试获得键盘输入
 */

public class TestScanner {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("请输入名字");
    String name = scanner.nextLine();
    System.out.println("请输入爱好");
    String favor = scanner.nextLine();
    System.out.println("请输入年龄");
    byte age = scanner.nextByte();

    System.out.println("########");
    System.out.println(name);
    System.out.println(favor);
    System.out.println("来到地球的时间"+ 365 * age);
    System.out.println("离开地球的时间"+ 365 * (72 - age));
  }
}
