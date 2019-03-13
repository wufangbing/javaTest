/**
 * 测试构造函数
 */

class Point {
  int x;
  int y;
  public Point(int x) {
    this.x = x;
  }
  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }
  public double getDistance(Point p) {
    return Math.sqrt((x - p.x) * (x-p.x) + (y-p.y) * (y-p.y));
  }
}
public class TestConstructor {
  public static void main(String[] args) {
    Point p = new Point(3, 4);
    Point p1 = new Point(3);
    System.out.println(p.getDistance(new Point(0, 0)));
  }
}
