package model;

import entity.Data;

import java.util.ArrayList;

public class ModelData{
    public ArrayList<Data> dataUser;

    public ModelData(){
        dataUser = new ArrayList<>();
    }

    public ArrayList<Data> getDataUsers(){
        return dataUser;
    }
//    @Override
//    public void viewData(int index) {
//
//    }
//
//    @Override
//    public void login(int index) {
//        dataUser.add();
//    }
//
//    @Override
//    public void register(int index) {
//
//    }
//
//    @Override
//    public void beliPulsa(int index) {
//
//    }
//
//    @Override
//    public void riwayat(int index) {
//
//    }
}
