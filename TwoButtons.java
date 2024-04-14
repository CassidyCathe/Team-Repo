import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class TwoButtons {
    private JFrame frame;
    private JLabel label;

    public static void main(String[] args) {
        TwoButtons gui = new TwoButtons();
        gui.go();
    }
    
    class MyDrawPanel extends JPanel {
        public void paintComponent(Graphics g) {
        g.setColor(Color.orange);
        g.fillRect(20, 50, 100, 100);
        }
    }

    public void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton labelButton = new JButton("Change Label");
        labelButton.addActionListener(new LabelListener());

        JButton colorButton = new JButton("Change Circle");
        colorButton.addActionListener(new ColorListener());

        label = new JLabel("I’m a label");
        MyDrawPanel drawPanel = new MyDrawPanel();
        
        frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.getContentPane().add(BorderLayout.EAST, labelButton);
        frame.getContentPane().add(BorderLayout.WEST, label);
        frame.setSize(500, 400);
        frame.setVisible(true);
    }

    class LabelListener implements ActionListener {
    public void actionPerformed(ActionEvent event) {
    label.setText("Ouch!");
    }
    }
    class ColorListener implements ActionListener {
    public void actionPerformed(ActionEvent event) {
    frame.repaint();
    }
    }
   }