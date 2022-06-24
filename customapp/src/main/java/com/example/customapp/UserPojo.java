package com.example.customapp;

public class UserPojo {
    int image;
    String name,mail,mobile,address;

    public UserPojo(int image, String name, String mail, String mobile) {
        this.image = image;
        this.name = name;
        this.mail = mail;
        this.mobile = mobile;
    }

    public UserPojo(int image, String name, String mail, String mobile, String address) {
        this.image = image;
        this.name = name;
        this.mail = mail;
        this.mobile = mobile;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
