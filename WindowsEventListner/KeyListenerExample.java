import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyListenerExample implements KeyListener {

    KeyListenerExample() {
        JFrame frame = new JFrame("Key Listner");
        JTextArea ta = new JTextArea();
        ta.setBounds(10, 10, 200, 200);
        frame.add(ta);
        frame.setSize(300, 300);
        frame.setVisible(true);
        ta.addKeyListener(this);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void keyTyped(KeyEvent e) {
        System.out.println("Key Typed");
    }

    public void keyPressed(KeyEvent e) {
        System.out.println(e.getKeyChar());
    }

    public void keyReleased(KeyEvent e) {
        System.out.println(e.getKeyChar());
    }

    public static void main(String[] args) {
        new KeyListenerExample();
    }
}
