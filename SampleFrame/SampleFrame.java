import javax.swing.*;
import java.awt.event.*;

public class SampleFrame {

    // Labels
    private JLabel firstName;
    private JLabel lastName;
    private JLabel email;
    private JLabel password;
    private JLabel gender;
    private JLabel country;
    // text fields
    private JTextField tfirstName;
    private JTextField tlastName;
    private JTextField temail;
    private JPasswordField tpassword;

    // radio buttons
    private JRadioButton male;
    private JRadioButton female;
    private JRadioButton agree;
    // combo box
    private JComboBox cb;
    // submit button
    private JButton submit;
    // constatnts
    private String countries[] = { "Nepal", "India", "Aus", "U.S.A", "England", "Newzealand" };

    SampleFrame() {
        JFrame f = new JFrame("Registration Form");

        firstName = new JLabel("First Name");
        firstName.setBounds(50, 50, 100, 30);

        lastName = new JLabel("Last Name");
        lastName.setBounds(50, 100, 100, 30);

        email = new JLabel("Email");
        email.setBounds(50, 150, 100, 30);

        password = new JLabel("Password");
        password.setBounds(50, 200, 100, 30);

        gender = new JLabel("Gender");
        gender.setBounds(50, 250, 100, 30);

        country = new JLabel("Country");
        country.setBounds(50, 300, 100, 30);

        tfirstName = new JTextField();
        tfirstName.setBounds(150, 50, 200, 30);

        tlastName = new JTextField();
        tlastName.setBounds(150, 100, 200, 30);

        temail = new JTextField();
        temail.setBounds(150, 150, 200, 30);

        tpassword = new JPasswordField();
        tpassword.setBounds(150, 200, 200, 30);

        male = new JRadioButton("Male");
        male.setBounds(150, 250, 100, 30);

        female = new JRadioButton("Female");
        female.setBounds(250, 250, 150, 30);

        cb = new JComboBox(countries);
        cb.setBounds(150, 300, 200, 30);

        agree = new JRadioButton("I agree to the terms and conditions.");
        agree.setBounds(50, 350, 300, 30);

        // create submit button
        submit = new JButton("Submit");
        submit.setBounds(250, 400, 100, 30);

        // add action listener to submit button
        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == submit) {
                    String data1;
                    String data = "First Name: " + tfirstName.getText();
                    data += ", Last Name: " + tlastName.getText();
                    data += ", Email: " + temail.getText();
                    data += ", Country: " + cb.getItemAt(cb.getSelectedIndex());

                    if (male.isSelected()) {
                        data1 = "Gender: Male";
                    } else {
                        data1 = "Gender: Female";
                    }
                    data += ", " + data1;
                    JOptionPane.showMessageDialog(f, data);
                }

            }
        });

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

        f.setSize(440, 500);
        f.setResizable(false);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new SampleFrame();
    }

}