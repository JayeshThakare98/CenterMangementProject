package com.sen.Entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.List;

@Entity
public class CenterDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer centerId ;
    private String centerName;
    private String centerCode;
    @OneToOne(cascade = CascadeType.ALL)
    private  Address address;
    private  Integer studentCapacity;
    private List<String> coursesOffered ;
    private Timestamp createdOn ;
    private  String contactEmail ;
    private  String contactPhone;

    public CenterDetails() {
        super();
    }

    public CenterDetails(Integer centerId, String centerName, String centerCode, Address address, Integer studentCapacity, Timestamp createdOn, List<String> coursesOffered, String contactEmail, String contactPhone) {
        this.centerId = centerId;
        this.centerName = centerName;
        this.centerCode = centerCode;
        this.address = address;
        this.studentCapacity = studentCapacity;
        this.createdOn = createdOn;
        this.coursesOffered = coursesOffered;
        this.contactEmail = contactEmail;
        this.contactPhone = contactPhone;
    }

    public Integer getCenterId() {
        return centerId;
    }

    public void setCenterId(Integer centerId) {
        this.centerId = centerId;
    }

    public String getCenterName() {
        return centerName;
    }

    public void setCenterName(String centerName) {
        this.centerName = centerName;
    }

    public String getCenterCode() {
        return centerCode;
    }

    public void setCenterCode(String centerCode) {
        this.centerCode = centerCode;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Integer getStudentCapacity() {
        return studentCapacity;
    }

    public void setStudentCapacity(Integer studentCapacity) {
        this.studentCapacity = studentCapacity;
    }

    public List<String> getCoursesOffered() {
        return coursesOffered;
    }

    public void setCoursesOffered(List<String> coursesOffered) {
        this.coursesOffered = coursesOffered;
    }

    public Timestamp getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Timestamp createdOn) {
        this.createdOn = createdOn;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    @Override
    public String toString() {
        return "CenterDetails{" +
                "centerId=" + centerId +
                ", centerName='" + centerName + '\'' +
                ", centerCode='" + centerCode + '\'' +
                ", address=" + address +
                ", studentCapacity=" + studentCapacity +
                ", coursesOffered=" + coursesOffered +
                ", createdOn=" + createdOn +
                ", contactEmail='" + contactEmail + '\'' +
                ", ContactPhone='" + contactPhone + '\'' +
                '}';
    }
}
