public class TestRecursion {
  public static void main(String[] args) {
    System.out.printf("%d的阶层结果为%s\n", 10,  factorial(10));
    System.out.println(size);
  }

  static int size = 100;
  static int factorial(int x) {
    if(x == 1) return 1;
    else return factorial(x-1) * x;
  }
}
