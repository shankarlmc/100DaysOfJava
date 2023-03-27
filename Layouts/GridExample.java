import java.awt.*;
import javax.swing.*;

public class GridExample {
    JFrame frame;

    GridExample() {
        frame = new JFrame("Grid Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.setLayout(new GridLayout());
        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new GridExample();
    }
}
