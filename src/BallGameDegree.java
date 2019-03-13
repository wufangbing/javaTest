import java.awt.*;
import javax.swing.*;

public class BallGameDegree extends JFrame {

  Image ball = Toolkit.getDefaultToolkit().getImage("images/ball1.png");
  Image desk = Toolkit.getDefaultToolkit().getImage("images/plat.png");

  double x = 100; // 小球横坐标
  double y = 100; // 小球纵坐标

  double degree = 3.14/3; // 弧度

  // 画窗口方法
  public void paint(Graphics g) {
    System.out.println("窗口被画了一次！");
    g.drawImage(desk, 0, 0, null);
    g.drawImage(ball, (int)x, (int)y, null);

    x = x+ 10*Math.cos(degree);
    y = y + 10*Math.sin(degree);

    // 碰到上下边界
    if(y > 420 - 40 - 30 || y < 40 + 40 ) {
      degree = -degree;
    }

    if(x < 0 + 40 || x > 856 - 40 - 30) {
      degree = 3.14 - degree;
    }
  }

  // 窗口加载
  void launchFrame() {
    setSize(856, 420);
    setLocation(50, 50);
    setVisible(true);

    // 重画窗口,每秒画25次
    while (true) {
      try {
        repaint();
        Thread.sleep(40); //40ms，一秒画20次窗口
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }

  //  main方法执行入口
  public static void main(String[] args) {
    System.out.println("创建一个桌球小游戏");
    BallGameDegree game = new BallGameDegree();
    game.launchFrame();
  }
}
