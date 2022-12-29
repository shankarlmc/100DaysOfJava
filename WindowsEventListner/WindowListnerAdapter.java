import javax.swing.*;
import java.awt.event.*;

public class WindowListnerAdapter extends WindowAdapter {
    JFrame f;

    WindowListnerAdapter() {
        f = new JFrame("Window Listner with awt");
        f.setSize(300, 300);
        f.addWindowListener(new WindowAdapter() {
            // closing event
            public void windowClosing(WindowEvent e) {
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                f.dispose();
                System.out.println("Window Closing");
            }
        });
        f.setVisible(true);
        f.setLayout(null);
    }

    public static void main(String[] args) {
        new WindowListnerAdapter();
    }
}
