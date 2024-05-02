package RHR_APP.GUI;

import javax.swing.*;

import RHR_APP.TempArrays;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginGUI implements ActionListener {
    public static void main(String[] args) {
        LoginGUI test = new LoginGUI();
        test.drawLoginGUI();

    }

    TempArrays loginArrays = new TempArrays();
    String username;
    String password;

    JFrame loginFrame = new JFrame(); // this block creates the components for login gui
    JPanel loginPanel = new JPanel();
    TextField usernameField = new TextField(20);
    JTextField passwordField = new JTextField(20);
    JButton loginButton = new JButton("Login");
    ImageIcon rhrIcon = new ImageIcon("ScaledRHR01.png");

    public void drawLoginGUI() {

        // setup for loginFrame
        loginFrame.setVisible(true);
        loginFrame.setSize(650, 450);
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.add(loginPanel);

        // setup for loginPanel
        loginPanel.add(new JLabel("Enter Username"));
        loginPanel.add(usernameField);
        loginPanel.add(new JLabel("Enter Password"));
        loginPanel.add(passwordField);
        loginPanel.add(loginButton);
        loginButton.addActionListener(this);

    }

    JFrame popupFrame = new JFrame();
    JPanel popupPanel = new JPanel();

    public void drawPopup(String labelText) {
        JLabel testLabel = new JLabel(labelText);

        // setup for the popup
        popupFrame.setVisible(true);
        popupFrame.setSize(650, 450);
        popupFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        popupFrame.add(popupPanel);

        // setup for the popup panel
        popupFrame.add(popupPanel);
        popupPanel.add(testLabel);

    }

    public void arrayDriverForGUI() { // when implemented into main this will be replaced by the instance there
        loginArrays.populateArrays(loginArrays);
    }

    @Override // actionperformed method required to implement actionlistener interface
    public void actionPerformed(ActionEvent e) {
        username = usernameField.getText();
        password = passwordField.getText();

        if ((username.length() == 0) || (password.length() == 0)) {
            String labelText = "You need to enter your username and password.";
            drawPopup(labelText); // displays the popup window if nothing is entered in either field
        }

        if ((username.length() > 0) && (password.length() > 0)) {

        }

    }
}

/*
 * TODO
 * add login button and action listener for said button
 * add RHR logo
 * logic for checking the array for if the password is right
 * make sure it throws a page if nothing is entered
 */