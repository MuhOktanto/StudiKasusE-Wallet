package viewGUI;

import controller.Verifikasi;
import entity.Data;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterPage implements ActionListener{
    JFrame regFrame = new JFrame();
    JButton registerButton, exitButton;
    JTextField fieldNama, fieldTgl, fiedNoHp, fieldPin;
//    JLabel peringatan;

    RegisterPage() {
        JLabel text1 = new JLabel();
        text1.setText("Mohon isi data diri anda dengan benar!!!");
        text1.setBounds(12, 10, 268, 21);

        JLabel text2 = new JLabel();
        text2.setText("Nama");
        text2.setBounds(12, 57, 67, 21);

        JLabel text3 = new JLabel();
        text3.setText("Tanggal Lahir");
        text3.setBounds(12, 104, 91, 18);

        JLabel text4 = new JLabel();
        text4.setText("No. Handphone");
        text4.setBounds(12, 161, 107, 18);

        JLabel text5 = new JLabel();
        text5.setText("Buat PIN");
        text5.setBounds(12, 210, 67, 21);

//        peringatan = new JLabel();
//        peringatan.setText("*Nomor ini telah terdaftar!!!");
//        peringatan.setBounds(138,141,168,17);

        fieldNama = new JTextField();
        fieldNama.setBounds(126, 57, 393, 21);
        fieldTgl = new JTextField();
        fieldTgl.setBounds(126, 103, 393, 21);
        fiedNoHp = new JTextField();
        fiedNoHp.setBounds(126, 158, 393, 21);
        fieldPin = new JTextField();
        fieldPin.setBounds(126, 210, 393, 21);

        registerButton = new JButton();
        registerButton.setText("REGISTER");
        registerButton.setBounds(110, 293, 150, 40);
        registerButton.setFont(new Font(null, Font.PLAIN, 20));
        registerButton.addActionListener(this);
        registerButton.setFocusable(false);

        exitButton = new JButton();
        exitButton.setText("EXIT");
        exitButton.setBounds(485, 293, 150, 40);
        exitButton.setFont(new Font(null, Font.PLAIN, 20));
        exitButton.setBackground(Color.RED);
        exitButton.addActionListener(this);
        exitButton.setFocusable(false);

        regFrame.setTitle("Register");
        regFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        regFrame.setResizable(false);
        regFrame.setSize(740, 400);
        regFrame.setVisible(true);
        regFrame.setLayout(null);

        regFrame.add(text1);
        regFrame.add(text2);
        regFrame.add(fieldNama);
        regFrame.add(text3);
        regFrame.add(fieldTgl);
        regFrame.add(text4);
        regFrame.add(fiedNoHp);
        regFrame.add(text5);
        regFrame.add(fieldPin);
        regFrame.add(registerButton);
        regFrame.add(exitButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==registerButton){
            String nama = fieldNama.getText();
            String nomorTelpon = fiedNoHp.getText();
            String tanggalLahir = fieldTgl.getText();
            String PIN = fieldPin.getText();
            int saldo = 0;
            Data pendaftar = new Data(nama,nomorTelpon,tanggalLahir,PIN, saldo);

            if (Verifikasi.register(pendaftar)){
                LoginPage login = new LoginPage();
                JOptionPane.showMessageDialog(null, "Silahkan Login");
                regFrame.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Nomor ini telah terdaftar!");
            }
        }

        if (e.getSource()==exitButton){
            RegLogPage reglog = new RegLogPage();
            regFrame.dispose();
        }
    }
}