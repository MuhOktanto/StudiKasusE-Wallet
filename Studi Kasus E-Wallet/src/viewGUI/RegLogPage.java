package viewGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegLogPage implements ActionListener {
    JFrame reglog = new JFrame();
    JButton goLogin;
    JButton goRegister;
    JButton goQuit;

    public RegLogPage(){
        JLabel textSambutan = new JLabel();
        textSambutan.setText("Selamat Datang");
        textSambutan.setBounds(218, 10, 304, 45);
        textSambutan.setFont(new Font(null, Font.PLAIN,20));
        textSambutan.setHorizontalAlignment(JLabel.CENTER);

        goLogin = new JButton();
        goLogin.setText("LOGIN");
        goLogin.setBounds(279,80,182,56);
        goLogin.setFont(new Font(null, Font.PLAIN,25));
        goLogin.addActionListener(this);
        goLogin.setFocusable(false);

        goRegister = new JButton();
        goRegister.setText("REGISTER");
        goRegister.setBounds(279,188,182,56);
        goRegister.setFont(new Font(null, Font.PLAIN,25));
        goRegister.addActionListener(this);
        goRegister.setFocusable(false);

        goQuit = new JButton();
        goQuit.setText("QUIT");
        goQuit.setBounds(279,296,182,56);
        goQuit.setFont(new Font(null, Font.PLAIN,25));
        goQuit.addActionListener(this);
        goQuit.setFocusable(false);

        reglog.setTitle("Studi Kasus E-Wallet");
        reglog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        reglog.setResizable(false);
        reglog.setSize(740,400);
        reglog.setVisible(true);
        reglog.setLayout(null);

        reglog.add(textSambutan);
        reglog.add(goLogin);
        reglog.add(goRegister);
        reglog.add(goQuit);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==goLogin){
            reglog.dispose();
            LoginPage login = new LoginPage();
        }
        if (e.getSource()==goRegister){
            reglog.dispose();
            RegisterPage register = new RegisterPage();
        }
        if (e.getSource()== goQuit){
            reglog.dispose();
            reglog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }
    }
}
