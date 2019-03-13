/**
 * 测试选择语句
 */

public class TestSwitch {
  public static void main(String[] args) {
    double number = Math.random();
    System.out.println((int) (6 * number)); // 范围[0,5]

    double r = 5 * Math.random();
    System.out.println("圆形的面积为=" + Math.PI * Math.pow(r, 2));

    int size = 200;
    switch (size) {
      case 50:
        System.out.println("this is 50");
        break;
      case 100:
        System.out.println("this is 100");
        break;
      default:
        System.out.println("this is 200");
        break;
    }


    /*
    int i = 1;
    int sum = 0;

    while(i <= 100) {
      sum += i;
      i++;
    }
    for(; i<= 100; i++) {
      sum += i;
    }
    System.out.println(sum);

    for (int j = 0; j < 5; j++) {
      for (int k = 0; k < 5; k++) {
        System.out.print(j+1+ " ");
      }
      System.out.println();
    }


    for (int i = 1; i <= 9; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j + "*" + i + "=" + i * j + " ");
      }
      System.out.println();
    }

    for (int i = 0; i <=100; i++) {
      sum += i%2 == 0 ? i: 0;
    }
    System.out.println(sum);

    int count = 0;
    while (i <= 1000) {
      if(i % 5 == 0) {
        System.out.print(i + "\t");
        count++;
      }
      if (count == 5) {
        System.out.println();
        count = 0;
      }
      i++;
    }
    */
//    boolean status = true;
//    for (int i = 101; i < 150; i++) {
//      for(int j = 2; j< i; j++) {
//        if(i % j == 0) {
//          status = false;
//        }
//      }
//      if(status) {
//        System.out.println(i);
//        status = true;
//      }
//    }
    boolean status = true;
    for (int i = 101; i < 150; i++) {
      for(int j = 2; j < i/2; j++) {
        if(i % j == 0) {
          status = false;
          break;
        }
      }
      if(status) System.out.println(i);
      status = true;
    }

  }
}
