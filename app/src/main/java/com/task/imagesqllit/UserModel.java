package com.task.imagesqllit;

public class UserModel {

    private int id;
    private String name;
    private String address;
    private byte[] image;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public UserModel(String name, String address, byte[] image, int id) {
        this.name = name;
        this.address = address;
        this.image = image;
        this.id = id;
    }
}
