



import javax.swing.*;
import java.awt.*;

public class TESTLoginGUI {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Login");

        // Set the size of the frame
        frame.setSize(800, 400);

        // Create a JPanel to hold components
        JPanel mainPanel = new JPanel();
        //JPanel topPanel = new JPanel();
        //JPanel botPanel = new JPanel();

        // Load the image
        ImageIcon rhrIcon = new ImageIcon("ScaledRHR01.png"); 
        //ImageIcon scaledIcon = new ImageIcon(rhrIcon.getImage().getScaledInstance(200, 100, Image.SCALE_SMOOTH));
       

        // Create a JLabel to display the scaled image
        JLabel iconLabel = new JLabel(rhrIcon);
        //JLabel iconLabel = new JLabel(scaledIcon);
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
        mainPanel.add(loginButton);

        

        // Add the panel to the frame
        frame.add(mainPanel);
        //frame.add(topPanel);
        //frame.add(botPanel);
        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
        //frame.getContentPane().add(BorderLayout.NORTH, topPanel);
        //frame.getContentPane().add(BorderLayout.CENTER, botPanel);
        
        
        // Set frame properties
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setVisible(true);
    }
}


/*
/*import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class LoginGUI implements ActionListener{

    
    private JButton button;
    public static void main(String[] args) {
        LoginGUI gui = new LoginGUI();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        button = new JButton("click me");

        button.addActionListener(this);

        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        button.setText("I've been clicked!");
    }

    /*you nee an action performed method!!!
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
    
}
*/