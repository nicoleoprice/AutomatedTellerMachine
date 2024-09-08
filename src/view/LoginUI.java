package view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class LoginUI extends JFrame {
    private JPanel titlePanel;
    private JLabel titleLabel;
    private JPanel loginPanel;
    private JPanel buttonPanel;
    private JButton loginButton;
    private JButton createButton;
    private JTextField usernameField;
    private JLabel usernameLabel;
    private JLabel passwordLabel;
    private JPasswordField passwordField;
    private JPanel mainPanel;

    public LoginUI() {
    this.setContentPane(mainPanel);
    //border is added to loginPanel so the fields and labels are not on the edge of the panel
    loginPanel.setBorder(new EmptyBorder(10, 25, 10, 25));
    titleLabel.setFont(titleLabel.getFont().deriveFont(20f));
    this.pack();
    setSize(450, 300);
    setLocationRelativeTo(null);

    //close application when window is closed
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
}
}
