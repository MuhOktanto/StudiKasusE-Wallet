package controller;

import entity.Data;

public class Topup {
    public static void isisaldo(int jumlah){
        Verifikasi.getDataakun().saldo += jumlah;
        Verifikasi.getDataakun().riwayatTransaksi = "TopUp                                                          +"
                +jumlah;
    }
}
