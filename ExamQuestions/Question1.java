/*
 * Question1
 * Write a java program to find sum of two 
 * numbers using swing components. Use text 
 * fields for input and output. your program 
 * should display the result when the user press a button.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Question1 implements ActionListener {
    JTextField firstNumberField, secondNumberField, resultField;
    JButton calculateButton;

    Question1() {
        JFrame frame = new JFrame("Sum Calculator");

        JLabel firstNumberLabel = new JLabel("Enter first number: ");
        JLabel secondNumberLabel = new JLabel("Enter second number: ");
        JLabel resultLabel = new JLabel("Result: ");

        firstNumberField = new JTextField(10);
        secondNumberField = new JTextField(10);
        resultField = new JTextField(10);
        // disable editing of result field
        resultField.setEditable(false);

        calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(this);

        // grid layout with 4 rows and 2 columns
        JPanel panel = new JPanel(new GridLayout(4, 2));
        panel.add(firstNumberLabel);
        panel.add(firstNumberField);
        panel.add(secondNumberLabel);
        panel.add(secondNumberField);
        panel.add(resultLabel);
        panel.add(resultField);
        panel.add(calculateButton);

        frame.add(panel);
        frame.setSize(400, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == calculateButton) {
            int firstNumber = Integer.parseInt(firstNumberField.getText());
            int secondNumber = Integer.parseInt(secondNumberField.getText());
            int result = firstNumber + secondNumber;
            resultField.setText(Integer.toString(result));
        }
    }

    public static void main(String[] args) {
        Question1 qn = new Question1();
    }
}
