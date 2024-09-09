package view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CreateUI extends JFrame {
    private JTextField usernameField;
    private JTextField cardNumberField;
    private JTextField balanceField;
    private JPanel informationPanel;
    private JLabel firstNameLabel;
    private JPasswordField passwordField;
    private JTextField firstNameField;
    private JLabel passwordLabel;
    private JLabel usernameLabel;
    private JLabel cardNumberLabel;
    private JLabel balanceLabel;
    private JPanel titlePanel;
    private JLabel titleLabel;
    public JButton createAccountButton;
    private JPanel mainPanel;
    public JButton backButton;
    private JTextField lastNameField;
    private JLabel lastNameLabel;

    public CreateUI() {
        this.setContentPane(mainPanel);
        informationPanel.setBorder(new EmptyBorder(10, 25, 10, 25));
        titleLabel.setFont(titleLabel.getFont().deriveFont(15f));
        this.pack();
        setSize(450, 300);
        setLocationRelativeTo(null);

    }

    public JTextField getUsernameField() {
        return usernameField;
    }

    public void setUsernameField(JTextField usernameField) {
        this.usernameField = usernameField;
    }

    public JTextField getCardNumberField() {
        return cardNumberField;
    }

    public void setCardNumberField(JTextField cardNumberField) {
        this.cardNumberField = cardNumberField;
    }

    public JTextField getBalanceField() {
        return balanceField;
    }

    public void setBalanceField(JTextField balanceField) {
        this.balanceField = balanceField;
    }

    public JPasswordField getPasswordField() {
        return passwordField;
    }

    public void setPasswordField(JPasswordField passwordField) {
        this.passwordField = passwordField;
    }

    public JTextField getFirstNameField() {
        return firstNameField;
    }

    public void setFirstNameField(JTextField nameField) {
        this.firstNameField = firstNameField;
    }

    public JTextField getLastNameField() {
        return lastNameField;
    }

    public void setLastNameField(JTextField lastNameField) {
        this.lastNameField = lastNameField;
    }
}
