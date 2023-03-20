import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestEvent extends JFrame {

    private void position(SpringLayout layout, JLabel label, JTextField field, int first, int second) {

        layout.putConstraint(SpringLayout.WEST, label, first, SpringLayout.WEST, getContentPane());
        layout.putConstraint(SpringLayout.NORTH, label, first, SpringLayout.NORTH, getContentPane());

        layout.putConstraint(SpringLayout.WEST, field, second, SpringLayout.EAST, label);
        layout.putConstraint(SpringLayout.SOUTH, field, 0, SpringLayout.SOUTH, label);
        layout.putConstraint(SpringLayout.WEST, field, second, SpringLayout.EAST, label);
    }

    public TestEvent() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel labnum = new JLabel("No client:");
        JLabel labnom = new JLabel("Nom client:");
        JLabel labpre = new JLabel("prenom client:");
        JLabel labadr = new JLabel("Adresse client:");

        JTextField fino = new JTextField(20);
        JTextField finom = new JTextField(20);
        JTextField fipre = new JTextField(20);
        JTextField fiadr = new JTextField(20);

        JPanel panel = new JPanel();
        SpringLayout layout = new SpringLayout();

        panel.add(fino);

        panel.add(labnum);
        panel.add(labnom);
        panel.add(labpre);
        panel.add(labadr);

        panel.add(finom);
        panel.add(fipre);
        panel.add(fiadr);

        panel.setLayout(layout);

        this.setContentPane(panel);

        position(layout, labnum, fino, 20, 6);
        position(layout, labadr, fiadr, 40, 6);
        position(layout, labnom, finom, 60, 6);
        position(layout, labpre, fipre, 80, 6);


        this.setSize(500, 500);

        this.setVisible(true);

    }


    public static void main(String[] Args) {
        TestEvent te = new TestEvent();

    }

}
