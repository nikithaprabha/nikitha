package com.xworkz.passportsevaapp;

import com.xworkz.passportsevaapp.constants.CpvLocation;
import com.xworkz.passportsevaapp.constants.DcdrLocation;

public class PassportDto {
    private CpvLocation cpvLocation;
    private DcdrLocation dcdrLocation;
    private int passportUserId;
    private String lastName;
    private String firstName;
    private String gender;
    private String dob;
    private String address;
    private String phoneNumber;
    private String email;
    private String passportType;
    private String nationality;

    public void setCpvLocation(CpvLocation cpvLocation) {
        this.cpvLocation = cpvLocation;
    }

    public CpvLocation getCpvLocation() {
        return cpvLocation;
    }

    public void setDcdrLocation(DcdrLocation dcdrLocation) {
        this.dcdrLocation = dcdrLocation;
    }

    public DcdrLocation getDcdrLocation() {
        return dcdrLocation;
    }

    public void setPassportUserId(int passportUserId) {
        this.passportUserId = passportUserId;
    }

    public int getPassportUserId() {
        return passportUserId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;

    }

    public String getGender() {
        return gender;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getDob() {
        return dob;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;

    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;

    }

    public String getEmail() {
        return email;
    }

    public void setPassportType(String passportType) {
        this.passportType = passportType;
    }

    public String getPassportType() {
        return passportType;
    }
    public void setNationality(String nationality){

        this.nationality=nationality;
    }
    public String getNationality(){
        return nationality;
    }
}