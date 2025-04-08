package com.xworkz.passportsevaapp;

import com.xworkz.passportsevaapp.constants.CpvLocation;
import com.xworkz.passportsevaapp.constants.DcdrLocation;
import com.xworkz.passportsevaapp.generatepassport.PassportSeva;

public class PassportRunner {
    public static void main(String[] args) {
        System.out.println("MAIN STARTED");
        PassportDto passportDto = new PassportDto();
        passportDto.setPassportUserId(1);
        passportDto.setFirstName("Nikitha");
        passportDto.setLastName("varshini");
        passportDto.setDob("27-10-2003");
        passportDto.setCpvLocation(CpvLocation.BANGALORE);
        passportDto.setCpvLocation(CpvLocation.DELHI);
        passportDto.setDcdrLocation(DcdrLocation.DELHI);
        passportDto.setDcdrLocation(DcdrLocation.PASSPORTOFFICE);
        passportDto.setPassportType("international");
        passportDto.setEmail("np@gmail.com");
        passportDto.setGender("female");
        passportDto.setNationality("indian");
        passportDto.setPhoneNumber("7653692231");



        PassportSeva passportSeva = new PassportSeva();
        passportSeva.userRegister(passportDto);

        System.out.println("passport id is "+passportDto.getPassportUserId());
        System.out.println("first name is "+passportDto.getFirstName());
        System.out.println("last name is "+passportDto.getLastName());
        System.out.println("dob is "+passportDto.getDob());
        System.out.println("passport type is "+passportDto.getPassportType());
        System.out.println("nationality is "+passportDto.getNationality());
        System.out.println("phone number is "+passportDto.getPhoneNumber());
        System.out.println("email is "+passportDto.getEmail());
        System.out.println("gender is "+passportDto.getGender());
        System.out.println("passport location is "+passportDto.getCpvLocation());
        System.out.println("MAIN ENDED");



    }


}
