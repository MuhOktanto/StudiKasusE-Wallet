package viewGUI;

import controller.Verifikasi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuUtama implements ActionListener{
    JFrame menu = new JFrame();
    JButton goSaya, goIsiSaldo, goBeliPulsa, goRiwayat, goKeluar;
    JLabel sambutanUser, saldoUser;
    String namaUser = Verifikasi.getDataakun().getNama();
    int sisaSaldo = Verifikasi.getDataakun().getSaldo();

    MenuUtama(){
        sambutanUser = new JLabel();
        sambutanUser.setText("HI, "+namaUser);
        sambutanUser.setBounds(40,18,256,22);
        sambutanUser.setFont(new Font(null, Font.PLAIN,20));

        saldoUser = new JLabel();
        saldoUser.setText("Rp "+sisaSaldo);
        saldoUser.setBounds(75,49,230,22);
        saldoUser.setFont(new Font(null, Font.PLAIN,20));

        goSaya = new JButton();
        goSaya.setText("Saya");
        goSaya.setBounds(40,102,300,60);
        goSaya.setFont(new Font(null, Font.PLAIN,25));
        goSaya.addActionListener(this);
        goSaya.setFocusable(false);

        goIsiSaldo = new JButton();
        goIsiSaldo.setText("Isi Saldo");
        goIsiSaldo.setBounds(400,102,300,60);
        goIsiSaldo.setFont(new Font(null, Font.PLAIN,25));
        goIsiSaldo.addActionListener(this);
        goIsiSaldo.setFocusable(false);

        goBeliPulsa = new JButton();
        goBeliPulsa.setText("Beli Pulsa");
        goBeliPulsa.setBounds(40,221,300,60);
        goBeliPulsa.setFont(new Font(null, Font.PLAIN,25));
        goBeliPulsa.addActionListener(this);
        goBeliPulsa.setFocusable(false);

        goRiwayat = new JButton();
        goRiwayat.setText("RIwayat");
        goRiwayat.setBounds(400,221,300,60);
        goRiwayat.setFont(new Font(null, Font.PLAIN,25));
        goRiwayat.addActionListener(this);
        goRiwayat.setFocusable(false);

        goKeluar = new JButton();
        goKeluar.setText("Keluar");
        goKeluar.setBackground(Color.RED);
        goKeluar.setBounds(220,319,300,60);
        goKeluar.setFont(new Font(null, Font.PLAIN,25));
        goKeluar.addActionListener(this);
        goKeluar.setFocusable(false);

        menu.setTitle("Menu utama");
        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menu.setResizable(false);
        menu.setSize(740,450);
        menu.setVisible(true);
        menu.setLayout(null);

        menu.add(sambutanUser);
        menu.add(saldoUser);
        menu.add(goSaya);
        menu.add(goIsiSaldo);
        menu.add(goBeliPulsa);
        menu.add(goRiwayat);
        menu.add(goKeluar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==goSaya){
            new SayaPage();
            menu.dispose();
        }
        if (e.getSource()==goIsiSaldo){
            new TopupPage();
            menu.dispose();
        }
        if (e.getSource()==goBeliPulsa){
            new PulsaPage();
            menu.dispose();
        }
        if (e.getSource()==goRiwayat){
            new RiwayatPage();
        }
        if (e.getSource()==goKeluar){
            new RegLogPage();
            menu.dispose();
        }
    }
}
