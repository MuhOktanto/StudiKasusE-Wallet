package viewGUI;

import controller.Verifikasi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RiwayatPage implements ActionListener {

    String ambil = Verifikasi.getDataakun().getRiwayatTransaksi();
    JFrame riwayat = new JFrame();
    JButton kembali = new JButton();

    RiwayatPage(){
        JLabel text = new JLabel();
        text.setText("Transasi Terakhir:");
        text.setBounds(18,18,182,21);
        text.setFont(new Font(null, Font.PLAIN, 15));

        JLabel ambilriwayat = new JLabel();
        ambilriwayat.setText(ambil);
        ambilriwayat.setBounds(32,63,337,18);
        ambilriwayat.setFont(new Font(null, Font.PLAIN, 15));

        kembali.setText("Tutup");
        kembali.setBounds(163,400,75,25);
        kembali.addActionListener(this);
        kembali.setBackground(Color.RED);

        riwayat.setTitle("Halaman Riwayat Transasi");
        riwayat.setResizable(false);
        riwayat.setSize(400,470);
        riwayat.setVisible(true);
        riwayat.setLayout(null);

        riwayat.add(text);
        riwayat.add(ambilriwayat);
        riwayat.add(kembali);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==kembali){
            riwayat.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            riwayat.dispose();
        }
    }
}
