package RHR_APP.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIpresentation implements ActionListener {
    // cassidy method calls her login GUI
    //

    public static void main(String[] args) { // body set sequentially
        GUIpresentation presenting = new GUIpresentation();
        presenting.cassidy();

    }

    // THIS IS LOGIN GUI \\

    boolean control = true;

    JFrame frame = new JFrame("RHR - Login");

    public void cassidy() { // my entire login killed itself, im sorry i stole yours
        // Set the size of the frame
        frame.setSize(800, 400);

        // Create a JPanel to hold components
        JPanel mainPanel = new JPanel();
        // JPanel topPanel = new JPanel();
        // JPanel botPanel = new JPanel();

        // Load the image
        ImageIcon rhrIcon = new ImageIcon("ScaledRHR01.png");
        // ImageIcon scaledIcon = new
        // ImageIcon(rhrIcon.getImage().getScaledInstance(200, 100,
        // Image.SCALE_SMOOTH));

        // Create a JLabel to display the scaled image
        JLabel iconLabel = new JLabel(rhrIcon);
        // JLabel iconLabel = new JLabel(scaledIcon);
        mainPanel.add(iconLabel, BorderLayout.CENTER);

        // Create a JPanel for username and password fields
        JPanel inputPanel = new JPanel(new GridLayout(2, 2));
        JLabel usernameLabel = new JLabel("Username:");
        JTextField usernameField = new JTextField(20);
        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField(20);
        inputPanel.add(usernameLabel);
        inputPanel.add(usernameField);
        inputPanel.add(passwordLabel);
        inputPanel.add(passwordField);

        // Add the input panel to the main panel
        mainPanel.add(inputPanel);

        // Create a JButton for login
        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                frame.dispose();
                drawPrimaryGUI();
            }
        });
        mainPanel.add(loginButton);

        // Add the panel to the frame
        frame.add(mainPanel);
        // frame.add(topPanel);
        // frame.add(botPanel);
        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
        // frame.getContentPane().add(BorderLayout.NORTH, topPanel);
        // frame.getContentPane().add(BorderLayout.CENTER, botPanel);

        // Set frame properties
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setVisible(true);
        control = true;
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

    public Boolean GUIMover() {
        return control;
    }

    // THIS IS PRIMARY GUI \\

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
                drawCoworkers();
            }
        });
        home.add(coworkers);

        JButton managers = new JButton("My Managers"); // creates manager button
        managers.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                drawManagers();
            }
        });
        home.add(managers);

        // ACCOUNT TAB SETUP \\

        String last = "Johnson";
        String title = "Employee";
        String userID = "45896712";
        String appUsername = "aJohnson";
        String phone = "270-333-4444";
        JTextArea accountDisplay = new JTextArea("Name: " + first + " " + last + "\n" +
                "Title: " + title + "\n" + "User ID: " + userID + "\n" + "Username: " + appUsername
                + "\n" + "Phone Number: " + phone);
        account.add(accountDisplay);

        /*
         * JButton accountDisplay = new JButton("Display Account"); // creates display
         * account button
         * accountDisplay.addActionListener(new ActionListener() {
         * public void actionPerformed(ActionEvent e) {
         * displayAccount();
         * }
         * });
         * account.add(accountDisplay);
         * 
         * JButton editAccount = new JButton("Edit Account"); // creates edit account
         * button
         * editAccount.addActionListener(new ActionListener() {
         * public void actionPerformed(ActionEvent e) {
         * // define action listener stuff here
         * }
         * });
         * //account.add(editAccount);
         */
    }

    JTextArea displayC = new JTextArea(
            "Name: Cassidy Larcomb \n Email: cLarcomb@gmail.com \n Phone #: 270-222-3333 \n \n Name: Alexandria Johnson \n Email: aJohnson@gmail.com \n Phone #: 270-333-4444 \n \n Name: Ethan James \n Email: eJames@gmail.com \n Phone #: 270-444-5555");

    void drawCoworkers() { // display coworkers NOT managers
        displayC.setSize(75, 100);
        home.remove(displayM);
        home.add(displayC);
        home.invalidate();
        home.validate();
        home.repaint();
    }

    JTextArea displayM = new JTextArea("Name: Seth Rogen \n Email: sRogen@gmail.com \n Phone #: 270-111-2222 ");

    void drawManagers() { // display managers NOT coworkers
        displayM.setSize(75, 100);
        home.remove(displayC);
        home.add(displayM);
        home.invalidate();
        home.validate();
        home.repaint();
    }

    String first = "Alexandria";
    String last = "Johnson";
    String title = "Employee";
    String userID = "45896712";
    String appUsername = "aJohnson";
    String phone = "270-333-4444";
    JTextArea accountDisplay = new JTextArea(
            "Name: " + first + " " + last + "\n" + "Title: " + title + "\n" + "User ID: " + userID + "\n" + "Username: "
                    + appUsername + "\n" + "Phone Number: " + phone);

    void displayAccount() {
        account.add(accountDisplay);
        account.invalidate();
        account.validate();
        account.repaint();
    }

    @Override // do not use, use anonymmous inner classes
    public void actionPerformed(ActionEvent e) {
        frame.setVisible(false);
        frame.dispose();
    }

}
