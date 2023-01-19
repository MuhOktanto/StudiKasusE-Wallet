package viewGUI;

import controller.Verifikasi;
import model.Akun;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SayaPage implements ActionListener{
    JFrame page = new JFrame();
    JButton kembali = new JButton();

    String user_nama = Verifikasi.getDataakun().getNama(),
            user_tgllahir = Verifikasi.getDataakun().getTanggalLahir(),
            user_nomor = Verifikasi.getDataakun().getNomorTelpon();
    int user_saldo = Verifikasi.getDataakun().getSaldo();

    public SayaPage(){
        ImageIcon profileImg = new ImageIcon("profile.png");

        JLabel profile = new JLabel();
        profile.setIcon(profileImg);
        profile.setBounds(295,24,150,150);
        profile.setHorizontalAlignment(JLabel.CENTER);

        JLabel textNama = new JLabel();
        textNama.setText("NAMA");
        textNama.setBounds(338, 182, 63, 18);
        textNama.setFont(new Font(null, Font.PLAIN,16));
        textNama.setHorizontalAlignment(JLabel.CENTER);

        JLabel namaUser = new JLabel();
        namaUser.setText(user_nama);
        namaUser.setBounds(197, 200, 346, 17);
        namaUser.setFont(new Font(null, Font.PLAIN,16));
        namaUser.setHorizontalAlignment(JLabel.CENTER);

        JLabel textTglLahir = new JLabel();
        textTglLahir.setText("TANGGAL LAHIR");
        textTglLahir.setBounds(290, 227, 160, 18);
        textTglLahir.setFont(new Font(null, Font.PLAIN,16));
        textTglLahir.setHorizontalAlignment(JLabel.CENTER);

        JLabel TglLahirUser = new JLabel();
        TglLahirUser.setText(user_tgllahir);
        TglLahirUser.setBounds(224, 245, 292, 17);
        TglLahirUser.setFont(new Font(null, Font.PLAIN,16));
        TglLahirUser.setHorizontalAlignment(JLabel.CENTER);

        JLabel textNoHp = new JLabel();
        textNoHp.setText("NOMOR HANDPHONE");
        textNoHp.setBounds(284, 272, 172, 18);
        textNoHp.setFont(new Font(null, Font.PLAIN,16));
        textNoHp.setHorizontalAlignment(JLabel.CENTER);

        JLabel nomorUser = new JLabel();
        nomorUser.setText(user_nomor);
        nomorUser.setBounds(251, 290, 238, 17);
        nomorUser.setFont(new Font(null, Font.PLAIN,16));
        nomorUser.setHorizontalAlignment(JLabel.CENTER);

        JLabel textSaldo = new JLabel();
        textSaldo.setText("SALDO");
        textSaldo.setBounds(290, 317, 160, 18);
        textSaldo.setFont(new Font(null, Font.PLAIN,16));
        textSaldo.setHorizontalAlignment(JLabel.CENTER);

        JLabel saldoUser = new JLabel();
        saldoUser.setText("Rp " + String.valueOf(user_saldo));
        saldoUser.setBounds(251, 335, 238, 17);
        saldoUser.setFont(new Font(null, Font.PLAIN,16));
        saldoUser.setHorizontalAlignment(JLabel.CENTER);

        kembali = new JButton();
        kembali.setText("Kembali");
        kembali.setBounds(623,352,90,30);
        kembali.setFont(new Font(null, Font.PLAIN,15));
        kembali.setBackground(Color.RED);
        kembali.addActionListener(this);
        kembali.setFocusable(false);

        page.setTitle("Tentang Akun Pengguna");
        page.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        page.setResizable(false);
        page.setSize(740,430);
        page.setVisible(true);
        page.setLayout(null);

        page.add(profile);
        page.add(textNama);
        page.add(namaUser);
        page.add(textTglLahir);
        page.add(TglLahirUser);
        page.add(textNoHp);
        page.add(nomorUser);
        page.add(textSaldo);
        page.add(saldoUser);
        page.add(kembali);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==kembali){
            MenuUtama menu = new MenuUtama();
            page.dispose();
        }
    }
}
