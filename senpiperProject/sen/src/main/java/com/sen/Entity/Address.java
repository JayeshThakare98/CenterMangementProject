package com.sen.Entity;

import jakarta.persistence.Entity;

public class Address {
    private String detailAddress ;
    private String city ;
    private String state ;
    private  String pincode ;

    public Address() {
        super();
    }

    public Address(String detailAddress, String city, String state, String pincode) {
        this.detailAddress = detailAddress;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }

    public String getDetailAddress() {
        return detailAddress;
    }

    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "detailAddress='" + detailAddress + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", pincode='" + pincode + '\'' +
                '}';
    }
}

