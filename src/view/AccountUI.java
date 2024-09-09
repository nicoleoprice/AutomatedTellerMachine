package view;

import javax.swing.*;

public class AccountUI extends JFrame {
    public JButton depositButton;
    public JButton withdrawalButton;
    private JPanel buttonPanel;
    private JLabel welcomeLabel;
    private JTextField balanceField;
    private JLabel balanceLabel;
    public JButton backButton;
    private JPanel balancePanel;
    private JPanel welcomePanel;
    private JPanel mainPanel;

    public AccountUI() {
        this.setContentPane(mainPanel);
        this.pack();
        this.setSize(450, 300);
        setLocationRelativeTo(null);
    }
}
