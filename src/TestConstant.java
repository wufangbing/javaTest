/**
 * 测试常量
 */
import java.math.*;
public class TestConstant {
  public static void main(String[] args) {
    final String NAME = "wfb";
    int age1 = 0b1110111;
    int age2 = 016;
    int age3 = 119;
    int age4 = 0x15;

    byte age = 30;
    short salary = 30000;
    int population = 2000000000;           // 默认为int
    long global_polulation = 740000000000L; // 后面加上L是一个long类型

    float f = 3.14F;
    double f1 = 3.14;

    byte aa1 = 3;
    int aa2 = 4;

    // byte aa4 = aa1 + aa2; // 出错
    // int aa4 = aa1 + aa2;  // 正确

    float a1 = 0.1F;
    float a2 = 1/10;
//    System.out.println(a1 == a2);
    BigDecimal b1 = BigDecimal.valueOf(0.1);
    BigDecimal b2 = BigDecimal.valueOf(1.0/10.0);
//    System.out.println(b1.equals(b2));

    char echar0 = 'a';
    char echar1 = 'b';
    char echar2 = '吴';
    char echar3 = '\u0061';
    char echar4 = '\n';

//    System.out.println(100>>2);
//    System.out.println(100<<2);

//    System.out.println(3+4);
//    System.out.println(3+'4');
//    System.out.println(3+"4");

//    System.out.println(3+4+'5');
//    System.out.println(3+4+"5");
//    System.out.println("3"+4+5);
//    System.out.println('3'+4+5);
//
//    System.out.println('a' + 0);
//    System.out.println('A' + 0);
  }
}
