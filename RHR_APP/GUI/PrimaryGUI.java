package RHR_APP.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrimaryGUI implements ActionListener {

    public static void main(String[] args) {
        PrimaryGUI test = new PrimaryGUI();
        test.drawPrimaryGUI();

    }

    JFrame primaryFrame = new JFrame();
    JTabbedPane primaryTabs = new JTabbedPane();
    JPanel home = new JPanel();
    JPanel account = new JPanel();
    JPanel evaluations = new JPanel();

    GridBagLayout gridBag = new GridBagLayout(); // used to format components in home

    public void drawPrimaryGUI() {

        // PRIMARY FRAME SETUP \\
        primaryFrame.setTitle("RHR");
        primaryFrame.setVisible(true);
        primaryFrame.setSize(450, 300);
        primaryFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        primaryFrame.add(primaryTabs);

        // PRIMARY TABBED PANE SETUP \\
        primaryTabs.setBounds(250, 250, 400, 400);
        primaryTabs.add("Home Page", home);
        primaryTabs.add("Account", account);
        primaryTabs.add("Evaluations", evaluations);

        // HOME TAB SETUP \\
        JButton coworkers = new JButton("My Co-Workers");
        coworkers.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // define action listener stuff here
            }
        });
        home.add(coworkers);

        JButton managers = new JButton("My Managers"); // creates manager button
        managers.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // define action listener stuff here
            }
        });
        home.add(managers);

        // ACCOUNT TAB SETUP \\
        JButton accountDisplay = new JButton("Display Account"); // creates display account button
        accountDisplay.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // define action listener stuff here
            }
        });
        account.add(accountDisplay);

        JButton editAccount = new JButton("Edit Account"); // creates edit account button
        editAccount.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // define action listener stuff here
            }
        });
        account.add(editAccount);

        // EVALUATION TAB SETUP \\

    }

    @Override // action performed method required to implement actionlistener interface
    public void actionPerformed(ActionEvent e) {
        // Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

}
