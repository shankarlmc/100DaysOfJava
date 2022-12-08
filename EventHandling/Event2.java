import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Event2 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Event2");
        JButton button = new JButton("Click to Close!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(button);
        button.addActionListener(e -> {
            frame.dispose();
        });
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(550, 300));
        frame.pack();
        frame.setVisible(true);
    }
}
