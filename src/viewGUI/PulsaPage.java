package viewGUI;

import controller.BeliPulsa;
import controller.Verifikasi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PulsaPage implements ActionListener {

    BeliPulsa beli;
    JFrame pulsapage = new JFrame();
    JButton pil1, pil2, pil3, pil4, pil5, pil6, pil7, pil8, pil9, kembali;

    String nomor = Verifikasi.getDataakun().nomorTelpon;

    public PulsaPage(){
        JLabel textbeli = new JLabel();
        textbeli.setText("Beli Pulsa");
        textbeli.setBounds(327,30,95,25);
        textbeli.setFont(new Font(null, Font.PLAIN,20));
        textbeli.setHorizontalAlignment(JLabel.CENTER);

        JLabel textnomor = new JLabel();
        textnomor.setText("Nomor : "+nomor);
        textnomor.setBounds(48,70,248,21);
        textnomor.setFont(new Font(null, Font.PLAIN,20));

        pil1 = new JButton();
        pil1.setText("5.000 harga Rp 6.000");
        pil1.setBounds(40,116,180,55);
        pil1.addActionListener(this);
        pil1.setFocusable(false);

        pil2 = new JButton();
        pil2.setText("10.000 harga Rp 11.000");
        pil2.setBounds(285,116,180,55);
        pil2.addActionListener(this);
        pil2.setFocusable(false);

        pil3 = new JButton();
        pil3.setText("15.000 harga Rp 15.900");
        pil3.setBounds(530,115,180,55);
        pil3.addActionListener(this);
        pil3.setFocusable(false);

        pil4 = new JButton();
        pil4.setText("20.000 harga Rp 20.900");
        pil4.setBounds(40,204,180,55);
        pil4.addActionListener(this);
        pil4.setFocusable(false);

        pil5 = new JButton();
        pil5.setText("25.000 harga Rp 25.900");
        pil5.setBounds(284,201,180,55);
        pil5.addActionListener(this);
        pil5.setFocusable(false);

        pil6 = new JButton();
        pil6.setText("50.000 harga Rp 50.000");
        pil6.setBounds(530,203,180,55);
        pil6.addActionListener(this);
        pil6.setFocusable(false);

        pil7 = new JButton();
        pil7.setText("75.000 harga Rp 75.900");
        pil7.setBounds(40,294,180,55);
        pil7.addActionListener(this);
        pil7.setFocusable(false);

        pil8 = new JButton();
        pil8.setText("100.000 harga Rp 99.500");
        pil8.setBounds(285,294,180,55);
        pil8.addActionListener(this);
        pil8.setFocusable(false);

        pil9 = new JButton();
        pil9.setText("500.000 harga Rp 498.000");
        pil9.setBounds(530,293,180,55);
        pil9.setFont(new Font(null, Font.BOLD,11));
        pil9.addActionListener(this);
        pil9.setFocusable(false);

        kembali = new JButton();
        kembali.setText("Kembali");
        kembali.setBounds(337,360,75,25);
        kembali.setHorizontalAlignment(JLabel.CENTER);
        kembali.setFont(new Font(null, Font.PLAIN,11));
        kembali.setBackground(Color.RED);
        kembali.addActionListener(this);
        kembali.setFocusable(false);

        pulsapage.setTitle("Beli Pulsa");
        pulsapage.setSize(750,430);
        pulsapage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pulsapage.setResizable(false);
        pulsapage.setVisible(true);
        pulsapage.setLayout(null);

        pulsapage.add(textbeli);
        pulsapage.add(textnomor);
        pulsapage.add(pil1);
        pulsapage.add(pil2);
        pulsapage.add(pil3);
        pulsapage.add(pil4);
        pulsapage.add(pil5);
        pulsapage.add(pil6);
        pulsapage.add(pil7);
        pulsapage.add(pil8);
        pulsapage.add(pil9);
        pulsapage.add(kembali);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==pil1){
            int harga = 6000;
            if (BeliPulsa.cekSaldo(harga)){
                BeliPulsa.bayar(harga);
                JOptionPane.showMessageDialog(null,"Pembayaran Berhasil");
            } else {
                JOptionPane.showMessageDialog(null,"Saldo anda tidak cukup","Pembayran Gagal",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
        if (e.getSource()==pil2){
            int harga = 11000;
            if (beli.cekSaldo(harga)){
                BeliPulsa.bayar(harga);
                JOptionPane.showMessageDialog(null,"Pembayaran Berhasil");
            } else {
                JOptionPane.showMessageDialog(null,"Saldo anda tidak cukup","Pembayran Gagal",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
        if (e.getSource()==pil3){
            int harga = 15900;
            if (beli.cekSaldo(harga)){
                BeliPulsa.bayar(harga);
                JOptionPane.showMessageDialog(null,"Pembayaran Berhasil");
            } else {
                JOptionPane.showMessageDialog(null,"Saldo anda tidak cukup","Pembayran Gagal",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
        if (e.getSource()==pil4){
            int harga = 20900;
            if (beli.cekSaldo(harga)){
                BeliPulsa.bayar(harga);
                JOptionPane.showMessageDialog(null,"Pembayaran Berhasil");
            } else {
                JOptionPane.showMessageDialog(null,"Saldo anda tidak cukup","Pembayran Gagal",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
        if (e.getSource()==pil5){
            int harga = 25900;
            if (beli.cekSaldo(harga)){
                BeliPulsa.bayar(harga);
                JOptionPane.showMessageDialog(null,"Pembayaran Berhasil");
            } else {
                JOptionPane.showMessageDialog(null,"Saldo anda tidak cukup","Pembayran Gagal",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
        if (e.getSource()==pil6){
            int harga = 50000;
            if (beli.cekSaldo(harga)){
                BeliPulsa.bayar(harga);
                JOptionPane.showMessageDialog(null,"Pembayaran Berhasil");
            } else {
                JOptionPane.showMessageDialog(null,"Saldo anda tidak cukup","Pembayran Gagal",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
        if (e.getSource()==pil7){
            int harga = 75900;
            if (beli.cekSaldo(harga)){
                BeliPulsa.bayar(harga);
                JOptionPane.showMessageDialog(null,"Pembayaran Berhasil");
            } else {
                JOptionPane.showMessageDialog(null,"Saldo anda tidak cukup","Pembayran Gagal",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
        if (e.getSource()==pil8){
            int harga = 99500;
            if (beli.cekSaldo(harga)){
                BeliPulsa.bayar(harga);
                JOptionPane.showMessageDialog(null,"Pembayaran Berhasil");
            } else {
                JOptionPane.showMessageDialog(null,"Saldo anda tidak cukup","Pembayran Gagal",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
        if (e.getSource()==pil9){
            int harga = 498000;
            if (beli.cekSaldo(harga)){
                BeliPulsa.bayar(harga);
                JOptionPane.showMessageDialog(null,"Pembayaran Berhasil");
            } else {
                JOptionPane.showMessageDialog(null,"Saldo anda tidak cukup","Pembayran Gagal",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
        if (e.getSource()==kembali){
            new MenuUtama();
            pulsapage.dispose();
        }
    }
}
