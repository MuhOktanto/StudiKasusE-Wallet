package model;

import entity.Data;

import java.util.ArrayList;

public class Akun {
    private static ArrayList<Data> akunUsers = new ArrayList<>();

    public static ArrayList<Data> AkunParaUser() {
        return akunUsers;
    }

    public static void registrasi(Data user) {
        akunUsers.add(user);
    }
}
