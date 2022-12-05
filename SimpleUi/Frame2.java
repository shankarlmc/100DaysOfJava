import java.awt.*;

public class Frame2 {
    Button b1;

    Frame2() {
        Frame f1 = new Frame("Home Page");
        b1 = new Button("Button 1");
        b1.setBounds(100, 100, 100, 15);
        f1.add(b1);
        f1.setSize(500, 500);
        f1.setLayout(null);
        f1.setVisible(true);
    }

    public static void main(String[] args) {
        new Frame2();
    }

}
