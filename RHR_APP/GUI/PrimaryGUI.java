package RHR_APP.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrimaryGUI implements ActionListener {

    public static void main(String[] args) {

    }

    JFrame primaryFrame = new JFrame();
    JTabbedPane primaryTabs = new JTabbedPane();
    JPanel home = new JPanel();
    JPanel employee = new JPanel();
    JPanel evaluations = new JPanel();

    public void drawPrimaryGUI() {
        // primaryFrame initial setup
        primaryFrame.setVisible(true);
        primaryFrame.setSize(1000, 750);
        primaryFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        primaryFrame.add(primaryTabs);

        // primaryTabs initial setup
        primaryTabs.setBounds(null);
        primaryTabs.add("Home Page", home);
        primaryTabs.add("Employee", employee);
        primaryTabs.add("Evaluations", evaluations);

        // home tab setup

        // employee tab setup

        // evaluations tab setup

    }

    @Override // action performed method required to implement actionlistenet interface
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

}
