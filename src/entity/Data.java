package entity;

public class Data {
    public String nama, nomorTelpon, tanggalLahir, PIN;
    public int saldo;

    public Data(String nama, String nomorTelpon,
                String tanggalLahir, String PIN, int saldo){
        this.nama = nama;
        this.nomorTelpon = nomorTelpon;
        this.tanggalLahir = tanggalLahir;
        this.PIN = PIN;
        this.saldo = saldo;
    }

    public void setNama(String nama_pengguna){
        this.nama = nama_pengguna;
    }

    public void setNomorTelpon(String nomorTelpon) {
        this.nomorTelpon = nomorTelpon;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public void setPIN(String PIN) {
        this.PIN = PIN;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public Data(String nama, String nomorTelpon, String tanggalLahir, String PIN){
    }

    public String getNama() {
        return nama;
    }
    public String getNomorTelpon() {
        return nomorTelpon;
    }
    public String getTanggalLahir() {
        return tanggalLahir;
    }
    public String getPIN() {
        return PIN;
    }
    public int getSaldo() {
        return saldo;
    }
}
