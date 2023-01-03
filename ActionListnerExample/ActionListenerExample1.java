import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ActionListenerExample1 implements ActionListener {
    JFrame f;
    JButton b1, b2;

    ActionListenerExample1() {
        f = new JFrame("Action Listener");
        f.setSize(500, 500);
        f.setLayout(null);
        b1 = new JButton("Button 1");
        b1.setBounds(100, 100, 100, 30);
        f.add(b1);
        b1.addActionListener(this);
        b2 = new JButton("Button 2");
        b2.setBounds(100, 200, 100, 30);
        f.add(b2);
        b2.addActionListener(this);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            JOptionPane.showMessageDialog(null, "Button 1 Clicked");
        } else if (e.getSource() == b2) {
            JOptionPane.showMessageDialog(null, "Button 2 Clicked");
        } else {
            System.out.println("Invalid Action button");
        }
    }

    public static void main(String[] args) {
        new ActionListenerExample1();
    }

}