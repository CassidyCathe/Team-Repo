package RHR_APP.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginGUI implements ActionListener {
    JFrame loginFrame = new JFrame();
    JPanel loginPanel = new JPanel();
    TextArea userNameArea = new TextArea();
    JPasswordField passwordField = new JPasswordField();

    public void drawLoginGUI() {

        // initial setup for loginFrame
        loginFrame.setVisible(true);
        loginFrame.setSize(1000, 750);
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.add(loginPanel);

        // initial setup for loginPanel
        loginPanel.setBounds(null);
        loginPanel.add(userNameArea);
        loginPanel.add(passwordField);
    }

    @Override // actionperformed method required to implement actionlistener interface
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}

/*
 * TODO
 * add RHR logo
 */
