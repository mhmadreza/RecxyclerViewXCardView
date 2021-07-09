package com.mr.recyclerxcardview.model;

public class ItemModel {

    private String nama;
    private int avatar;

    public ItemModel(){

    }

    public ItemModel(String nama, int avatar) {
        this.nama = nama;
        this.avatar = avatar;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }
}
