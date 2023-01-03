import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RadioButtonExample implements
        ActionListener {
    public int selectedGender = -1;
    JFrame f;
    JRadioButton male, female;
    ButtonGroup g;

    RadioButtonExample() {
        f = new JFrame("Radio Button Action Listener");
        f.setSize(500, 500);
        f.setLayout(null);
        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        male.setBounds(100, 100, 100, 30);
        female.setBounds(200, 100, 100, 30);
        g = new ButtonGroup();
        g.add(male);
        g.add(female);
        f.add(male);
        f.add(female);
        male.addActionListener(this);
        female.addActionListener(this);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == male) {
            this.selectedGender = 0;
            JOptionPane.showMessageDialog(null, "Male Selected");
        } else if (e.getSource() == female) {
            this.selectedGender = 1;
            JOptionPane.showMessageDialog(null, "Female Selected");
        } else {
            System.out.println("Invalid Action button");
        }
    }

    public static void main(String[] args) {
        new RadioButtonExample();

    }
}
