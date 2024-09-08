package controller;

import model.com.atm.UserLogin;
import view.LoginUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AtmCntrl implements ActionListener {
    private UserLogin userLogin;
    private LoginUI loginUI;

    public AtmCntrl() {
        userLogin = new UserLogin();
        loginUI = new LoginUI();
        loginUI.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
