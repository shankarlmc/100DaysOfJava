import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseListner extends JFrame implements MouseListener, MouseMotionListener {

    JFrame f1;
    JButton b1;

    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse Clicked");
        JOptionPane.showMessageDialog(this, "Mouse Clicked");
    }

    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse Entered");
    }

    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse Exited");
    }

    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse Pressed");
    }

    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse Released");
    }

    public void mouseDragged(MouseEvent e) {
        System.out.println("Mouse Dragged");
    }

    public void mouseMoved(MouseEvent e) {
        // System.out.println("Mouse Moved");
    }

    MouseListner() {
        f1 = new JFrame("Mouse Event Handling");
        b1 = new JButton("Click me");
        b1.setBounds(100, 100, 100, 15);
        f1.add(b1);
        f1.setSize(300, 300);
        f1.setLayout(null);
        f1.setVisible(true);
        b1.addMouseListener(this);
        f1.addMouseMotionListener(this);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new MouseListner();
    }
}