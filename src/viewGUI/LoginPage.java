package viewGUI;

import controller.Verifikasi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage implements ActionListener {
    JFrame logFrame = new JFrame();
    JButton loginButton;
    JButton exitButton1;
    JPasswordField inputPass = new JPasswordField();
    LoginPage(){
        JLabel textPass = new JLabel();
        textPass.setText("Masukan PIN");
        textPass.setBounds(241, 41, 264, 41);
        textPass.setHorizontalAlignment(JLabel.CENTER);

        inputPass.setBounds(173,82,395,68);
        inputPass.setHorizontalAlignment(JPasswordField.CENTER);
        inputPass.setFont(new Font(null,Font.PLAIN,25));

        JLabel textSalah = new JLabel();
        textSalah.setText("PIN Anda Salah");
        textSalah.setBounds(275,180,191,45);
        textSalah.setHorizontalAlignment(JLabel.CENTER);

        loginButton = new JButton();
        loginButton.setText("LOGIN");
        loginButton.setBounds(294,264,153,43);
        loginButton.setFont(new Font(null, Font.PLAIN,25));
        loginButton.addActionListener(this);
        loginButton.setFocusable(false);

        exitButton1 = new JButton();
        exitButton1.setText("EXIT");
        exitButton1.setBounds(326,335,88,25);
        exitButton1.setFont(new Font(null, Font.PLAIN,15));
        exitButton1.setBackground(Color.RED);
        exitButton1.addActionListener(this);
        exitButton1.setFocusable(false);

        logFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        logFrame.setResizable(false);
        logFrame.setSize(740,400);
        logFrame.setVisible(true);
        logFrame.setTitle("Login");
        logFrame.setLayout(null);

        logFrame.add(textPass);
        logFrame.add(inputPass);
        logFrame.add(loginButton);
        logFrame.add(exitButton1);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==loginButton){
            String pin = String.valueOf(inputPass.getPassword());
            if (Verifikasi.login(pin)){
                MenuUtama menu = new MenuUtama();
                logFrame.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "PIN anda salah","Gagal Login",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
        if (e.getSource()==exitButton1){
            logFrame.dispose();
            RegLogPage regorLog = new RegLogPage();
        }
    }
}
