import javax.swing.*;

public class CheckBoxRadioButtonMenu {
    JFrame frame;
    JMenuBar menuBar;
    JCheckBoxMenuItem i1, i2;
    JRadioButtonMenuItem i3, i4;
    ButtonGroup bg;

    CheckBoxRadioButtonMenu() {
        frame = new JFrame("CheckBox and RadioButton Menu");
        frame.setSize(500, 500);
        frame.setLayout(null);
        menuBar = new JMenuBar();
        JMenu menu = new JMenu("Menu");
        menuBar.add(menu);
        i1 = new JCheckBoxMenuItem("Item 1");
        i2 = new JCheckBoxMenuItem("Item 2");
        i3 = new JRadioButtonMenuItem("Item 3");
        i4 = new JRadioButtonMenuItem("Item 4");
        bg = new ButtonGroup();
        bg.add(i3);
        bg.add(i4);
        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
        menu.add(i4);
        frame.setJMenuBar(menuBar);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new CheckBoxRadioButtonMenu();
    }
}
