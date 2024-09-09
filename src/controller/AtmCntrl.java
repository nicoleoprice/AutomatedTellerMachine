package controller;

import model.com.atm.Account;
import model.com.atm.UserLogin;
import view.AccountUI;
import view.CreateUI;
import view.LoginUI;

import javax.swing.*;
import java.awt.event.*;

public class AtmCntrl implements ActionListener {
    private UserLogin userLogin;
    private LoginUI loginUI;
    private CreateUI createUI;
    private AccountUI accountUI;

    public AtmCntrl() {
        userLogin = new UserLogin();
        loginUI = new LoginUI();
        createUI = new CreateUI();
        accountUI = new AccountUI();

        addALButtons();

        loginUI.setVisible(true);

        //I want the Create Account window to return to the login UI if the user closes the window
        createUI.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        createUI.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                loginUI.setVisible(true);
            }
        });

        //The application should stop if the user closes the window
        accountUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        accountUI.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int confirm = JOptionPane.showConfirmDialog(null, "Do you want to exit?", "Exit?",
                        JOptionPane.YES_NO_OPTION);
                if(confirm == JOptionPane.YES_OPTION) {
                    System.exit(0);
                } else {
                    accountUI.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
                }
            }
        });
    }

    //make buttons functional
    public void addALButtons() {
        loginUI.loginButton.addActionListener(this);
        loginUI.createButton.addActionListener(this);
        createUI.createAccountButton.addActionListener(this);
        createUI.backButton.addActionListener(this);
        accountUI.backButton.addActionListener(this);
        accountUI.withdrawalButton.addActionListener(this);
        accountUI.depositButton.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();

        //loginUI buttons
        if (obj == loginUI.createButton) {
            //close current window and open create window
            loginUI.setVisible(false);
            createUI.setVisible(true);

        }
        if (obj == loginUI.loginButton) {
            //if username and password match
           // if(loginUI.getUsernameField() )
            loginUI.setVisible(false);
            accountUI.setVisible(true);
            //if they do not match
        }


        //createUI buttons
        if (obj == createUI.backButton) {
            createUI.dispose();
            loginUI.setVisible(true);
        }
        if (obj == createUI.createAccountButton) {
            Account newUser = new Account(
                    createUI.getUsernameField().toString(),
                    createUI.getPasswordField().toString(),
                    createUI.getFirstNameField().toString(),
                    createUI.getLastNameField().toString(),
                    Integer.parseInt(createUI.getCardNumberField().toString()),
                    Integer.parseInt(createUI.getBalanceField().toString()));
        }

        //accountUI buttons
        if (obj == accountUI.backButton) {
            accountUI.dispose();
            loginUI.setVisible(true);
        }
        if (obj == accountUI.withdrawalButton) {
        }
        if (obj == accountUI.depositButton) {

        }
    }
}
