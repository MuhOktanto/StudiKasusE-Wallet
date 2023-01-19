package controller;

import entity.Data;
import model.Akun;

public class Verifikasi {
    static Data dataakun = null;

    public static boolean login(String pin){
        for (Data user : Akun.AkunParaUser()){
            if ((user.PIN.equals(pin))){
                dataakun = user;
                return true;
            }
        }
        return false;
    }

    public static boolean register(Data Pendaftar) {
        for (Data akun : Akun.AkunParaUser()) {
            if ((akun.nomorTelpon.equals(Pendaftar.nomorTelpon))) {
                return false;
            }
        }
        Akun.registrasi(Pendaftar);
        return true;
    }

    public static Data getDataakun(){
        return dataakun;
    }
}
