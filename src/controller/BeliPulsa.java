package controller;

public class BeliPulsa {
    public static boolean cekSaldo(int harga){
        if (Verifikasi.getDataakun().saldo >= harga){
            return true;
        }
        return false;
    }

    public static void bayar(int harga){
        Verifikasi.getDataakun().saldo -= harga;
        Verifikasi.getDataakun().riwayatTransaksi = "Beli Pulsa                                                      -"
        +harga;
    }
}
