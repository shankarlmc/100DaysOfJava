import java.awt.*;
import javax.swing.*;

public class GridBagExample {
    JFrame frame;
    JPanel panel;
    JButton button1, button2, button3, button4, button5;

    GridBagExample() {
        frame = new JFrame("GridBag Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.setLayout(new GridBagLayout());
        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new GridBagExample();
    }

}
