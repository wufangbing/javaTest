import java.awt.*;
import javax.swing.*;

public class BallGame extends JFrame {

  Image ball = Toolkit.getDefaultToolkit().getImage("images/ball1.png");
  Image desk = Toolkit.getDefaultToolkit().getImage("images/plat.png");

  double x = 100; // 小球横坐标
  double y = 100; // 小球纵坐标
  boolean right = true; // 小球的方向

  // 画窗口方法
  public void paint(Graphics g) {
    System.out.println("窗口被画了一次！");
//    g.drawImage(desk, 0, 0, null);
    g.drawImage(ball, (int)x, (int)y, null);

    if(right) {
      x = x + 10;
    } else {
      x = x - 10;
    }

    if(x >= 856 - 40 - 30) {
      right = false;
    }

    if(x < 40) {
      right = true;
    }
  }


  // 窗口加载
  void launchFrame() {
    setSize(856, 450);
    setLocation(50, 50);
    setVisible(true);

    // 重画窗口,每秒画25次
    while (true) {
      repaint();
      try {
        Thread.sleep(40); //40ms，一秒画20次窗口
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }

//  main方法执行入口
  public static void main(String[] args) {
    System.out.println("创建一个桌球小游戏");
    BallGame game = new BallGame();
    game.launchFrame();
  }
}
