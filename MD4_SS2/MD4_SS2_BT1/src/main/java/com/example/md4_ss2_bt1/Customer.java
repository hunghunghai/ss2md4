package com.example.md4_ss2_bt1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Customer {
    private int id;
    private String name;
    private Date dateOfBirth;
    private String avatarUrl;
    private String address;
    private static final DateFormat df = new SimpleDateFormat("MM/dd/yyyy");

    public Customer() {
    }

    public Customer(int id, String name, String dateOfBirth,String address, String avatarUrl) {
        this.id = id;
        this.name = name;
        try {
            this.dateOfBirth = df.parse(dateOfBirth);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        this.avatarUrl = avatarUrl;
        this.address = address;
    }

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

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
