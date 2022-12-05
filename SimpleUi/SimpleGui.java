import java.awt.*;

public class SimpleGui extends Frame {
    Button b1;
    TextField username, password;

    SimpleGui() {
        setLayout(null);
        setSize(500, 500);
        b1 = new Button("Button 1");
        b1.setSize(50, 20);
        b1.setBounds(10, 10, 20, 15);
        add(b1);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SimpleGui();
    }
}
