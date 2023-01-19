package entity;

public class Riwayat {
    String jenisTransaksi;
    int nominalPembayaran;

    public Riwayat(String jenisTransaksi, int nominalPembayaran){
        this.jenisTransaksi = jenisTransaksi;
        this.nominalPembayaran = nominalPembayaran;
    }

    public String getJenisTransaksi() {
        return jenisTransaksi;
    }

    public int getNominalPembayaran() {
        return nominalPembayaran;
    }

    public void setJenisTransaksi(String jenisTransaksi) {
        this.jenisTransaksi = jenisTransaksi;
    }

    public void setNominalPembayaran(int nominalPembayaran) {
        this.nominalPembayaran = nominalPembayaran;
    }
}
