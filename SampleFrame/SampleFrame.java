import javax.swing.*;
import java.awt.event.*;

public class SampleFrame {
    SampleFrame() {
        JFrame f = new JFrame("Registration Form");

        JLabel firstName = new JLabel("First Name");
        firstName.setBounds(50, 50, 100, 30);

        JLabel lastName = new JLabel("Last Name");
        lastName.setBounds(50, 100, 100, 30);

        JLabel email = new JLabel("Email");
        email.setBounds(50, 150, 100, 30);

        JLabel password = new JLabel("Password");
        password.setBounds(50, 200, 100, 30);

        JLabel gender = new JLabel("Gender");
        gender.setBounds(50, 250, 100, 30);

        JLabel country = new JLabel("Country");
        country.setBounds(50, 300, 100, 30);

        JTextField tfirstName = new JTextField();
        tfirstName.setBounds(150, 50, 200, 30);

        JTextField tlastName = new JTextField();
        tlastName.setBounds(150, 100, 200, 30);

        JTextField temail = new JTextField();
        temail.setBounds(150, 150, 200, 30);

        JPasswordField tpassword = new JPasswordField();
        tpassword.setBounds(150, 200, 200, 30);

        JRadioButton male = new JRadioButton("Male");
        male.setBounds(150, 250, 100, 30);

        JRadioButton female = new JRadioButton("Female");
        female.setBounds(250, 250, 150, 30);

        String countries[] = { "Nepal", "India", "Aus", "U.S.A", "England", "Newzealand" };
        JComboBox cb = new JComboBox(countries);
        cb.setBounds(150, 300, 200, 30);

        // i agree radio button
        JRadioButton agree = new JRadioButton("I agree to the terms and conditions.");
        agree.setBounds(50, 350, 300, 30);

        // create submit button
        JButton submit = new JButton("Submit");
        submit.setBounds(250, 400, 100, 30);
        // add labels and text fields to frame
        f.add(firstName);
        f.add(tfirstName);
        f.add(lastName);
        f.add(tlastName);
        f.add(email);
        f.add(temail);
        f.add(password);
        f.add(tpassword);
        f.add(gender);
        f.add(male);
        f.add(female);
        f.add(country);
        f.add(cb);
        f.add(agree);
        f.add(submit);
        // set frame size
        f.setSize(500, 500);
        // set layout to null
        f.setLayout(null);
        // set frame visibility
        f.setVisible(true);

        // add action listener to submit button
        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(e);
            }
        });
    }

    public static void main(String[] args) {
        new SampleFrame();
    }

}