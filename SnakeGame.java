import javax.swing.*;
import java.awt.*;

public class SnakeGame {
    JFrame frame;
    SnakeGame(){
        frame=new JFrame("Snake Game");
        MyPanel panel=new MyPanel();
        panel.setBackground(Color.darkGray);
        frame.add(panel);
        frame.setBounds(10,10,905,700);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
      SnakeGame s=new SnakeGame();
    }
}
