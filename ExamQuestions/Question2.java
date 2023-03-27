/*
 * Question2
 * Write a java program to find sum and difference of two 
 * numbers using swing components. Use text 
 * fields for input and output. The program 
 * should display sum if user presses mouse and 
 * difference if user release mouse.
 */

import java.awt.event.*;
import javax.swing.*;

public class Question2 extends MouseAdapter {
    JFrame f1;
    JLabel l1, l2, l3, l4;
    JTextField t1, t2, t3;

    Question2() {
        f1 = new JFrame("Arithmetic Operations");
        l1 = new JLabel("First Number");
        l1.setBounds(20, 20, 100, 20);
        l2 = new JLabel("Second Number");
        l2.setBounds(20, 50, 100, 20);
        l3 = new JLabel("Result");
        l3.setBounds(20, 80, 100, 20);
        t1 = new JTextField();
        t1.setText("0");
        t1.setBounds(150, 20, 100, 20);
        t2 = new JTextField();
        t2.setText("0");
        t2.setBounds(150, 50, 100, 20);
        t3 = new JTextField();
        t3.setText("0");
        t3.setBounds(150, 80, 100, 20);
        t3.setEditable(false);
        l4 = new JLabel("Click to add, release to subtract");
        l4.setBounds(20, 110, 200, 20);

        f1.add(l1);
        f1.add(l2);
        f1.add(l3);
        f1.add(l4);
        f1.add(t1);
        f1.add(t2);
        f1.add(t3);

        f1.addMouseListener(this);
        f1.setLayout(null);
        f1.setVisible(true);
        f1.setSize(400, 400);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void mousePressed(MouseEvent e) {
        int num1 = Integer.parseInt(t1.getText());
        int num2 = Integer.parseInt(t2.getText());
        int sum = num1 + num2;
        t3.setText(String.valueOf(sum));
    }

    public void mouseReleased(MouseEvent e) {
        int num1 = Integer.parseInt(t1.getText());
        int num2 = Integer.parseInt(t2.getText());
        int diff = num1 - num2;
        t3.setText(String.valueOf(diff));
    }

    public static void main(String args[]) {
        new Question2();
    }
}
