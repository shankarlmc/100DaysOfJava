import java.awt.*;

public class Frame1 extends Frame {
    Label user, password;
    TextField tusername, tpassword;
    Button submit;
    // PasswordField pass;

    Frame1() {
        // set frame title
        setTitle("Login Page");
        // username label
        user = new Label("Username");
        user.setBounds(80, 100, 80, 20);
        add(user);
        // password label
        password = new Label("Password");
        password.setBounds(80, 130, 80, 20);
        add(password);
        // username text field
        tusername = new TextField();
        tusername.setBounds(100, 100, 150, 20);
        add(tusername);
        // password text field
        tpassword = new TextField();
        tpassword.setBounds(100, 130, 150, 20);
        add(tpassword);
        // submit button
        submit = new Button("Submit");
        submit.setBounds(100, 160, 150, 20);
        add(submit);
        setSize(400, 500);
        setLayout(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Frame1();
    }

}
