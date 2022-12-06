import java.awt.*;
import java.awt.event.*;

public class Event1 extends Frame implements ActionListener {
    Label label1;
    TextField text1;
    Button submit;

    Event1() {
        // set frame title
        setTitle("Login Page");
        // username label
        label1 = new Label("Enter text here: ");
        label1.setBounds(80, 100, 120, 20);
        add(label1);

        // username text field
        text1 = new TextField();
        text1.setBounds(200, 100, 200, 20);
        add(text1);

        // submit button
        submit = new Button("Submit");
        submit.setBounds(100, 160, 150, 20);
        submit.addActionListener(this);
        add(submit);
        setSize(600, 500);
        setLayout(null);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        text1.setText("Submit Button Clicked.");
    }

    public static void main(String[] args) {
        new Event1();
    }
}