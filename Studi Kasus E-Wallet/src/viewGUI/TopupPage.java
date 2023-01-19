package viewGUI;

import controller.Verifikasi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TopupPage implements ActionListener {

    JFrame topupPage = new JFrame();
    JTextField jmltopup;
    JButton topup50, topup100, topup500, topup1jt, topupjml, kembali;

    public TopupPage(){
        topup50 = new JButton();
        topup50.setText("Rp 50Rb");
        topup50.setBounds(70,57,200,50);
        topup50.setFont(new Font(null, Font.PLAIN,20));
        topup50.addActionListener(this);
        topup50.setFocusable(false);

        topup100 = new JButton();
        topup100.setText("Rp 100Rb");
        topup100.setBounds(470,57,200,50);
        topup100.setFont(new Font(null, Font.PLAIN,20));
        topup100.addActionListener(this);
        topup100.setFocusable(false);

        topup500 = new JButton();
        topup500.setText("Rp 500Rb");
        topup500.setBounds(70,190,200,50);
        topup500.setFont(new Font(null, Font.PLAIN,20));
        topup500.addActionListener(this);
        topup500.setFocusable(false);

        topup1jt = new JButton();
        topup1jt.setText("Rp 1Jt");
        topup1jt.setBounds(470,190,200,50);
        topup1jt.setFont(new Font(null, Font.PLAIN,20));
        topup1jt.addActionListener(this);
        topup1jt.setFocusable(false);

        JLabel jumlain = new JLabel();
        jumlain.setText("Jumlah lain");
        jumlain.setBounds(95,316,87,14);

        jmltopup = new JTextField();
        jmltopup.setBounds(98,335,172,23);

        JLabel rp = new JLabel();
        rp.setText("Rp");
        rp.setBounds(70,337,25,21);

        topupjml = new JButton();
        topupjml.setText("TopUp");
        topupjml.setBounds(287,337,75,25);
        topupjml.setHorizontalAlignment(JLabel.CENTER);
        topupjml.setFont(new Font(null, Font.PLAIN,12));
        topupjml.setBackground(Color.GREEN);
        topupjml.addActionListener(this);
        topupjml.setFocusable(false);

        kembali = new JButton();
        kembali.setText("Kembali");
        kembali.setBounds(605,337,75,25);
        kembali.setHorizontalAlignment(JLabel.CENTER);
        kembali.setFont(new Font(null, Font.PLAIN,11));
        kembali.setBackground(Color.RED);
        kembali.addActionListener(this);
        kembali.setFocusable(false);

        topupPage.setTitle("TopUp");
        topupPage.setSize(740,430);
        topupPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        topupPage.setResizable(false);
        topupPage.setVisible(true);
        topupPage.setLayout(null);

        topupPage.add(topup50);
        topupPage.add(topup100);
        topupPage.add(topup500);
        topupPage.add(topup1jt);
        topupPage.add(jumlain);
        topupPage.add(jmltopup);
        topupPage.add(rp);
        topupPage.add(topupjml);
        topupPage.add(kembali);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==topupjml){
            int jumlah = Integer.parseInt(jmltopup.getText());

            if (jumlah >= 20000){
                Verifikasi.getDataakun().saldo += jumlah;
                JOptionPane.showMessageDialog(null,"Top Berhasil");
                new MenuUtama();
                topupPage.dispose();
            } else {
                JOptionPane.showMessageDialog(null,"Minimal TopUp Rp 20.000","TopUp Gagal",
                        JOptionPane.ERROR_MESSAGE);
            }
        }

        if (e.getSource()==topup50){
            int jumlah = 50000;
            Verifikasi.getDataakun().saldo += jumlah;
            JOptionPane.showMessageDialog(null,"Top Berhasil");
            new MenuUtama();
            topupPage.dispose();
        }

        if (e.getSource()==topup100){
            int jumlah = 100000;
            Verifikasi.getDataakun().saldo += jumlah;
            JOptionPane.showMessageDialog(null,"Top Berhasil");
            new MenuUtama();
            topupPage.dispose();
        }

        if (e.getSource()==topup500){
            int jumlah = 500000;
            Verifikasi.getDataakun().saldo += jumlah;
            JOptionPane.showMessageDialog(null,"Top Berhasil");
            new MenuUtama();
            topupPage.dispose();
        }

        if (e.getSource()==topup1jt){
            int jumlah = 1000000;
            Verifikasi.getDataakun().saldo += jumlah;
            JOptionPane.showMessageDialog(null,"Top Berhasil");
            new MenuUtama();
            topupPage.dispose();
        }

        if (e.getSource()==kembali){
            new MenuUtama();
            topupPage.dispose();
        }
    }
}
