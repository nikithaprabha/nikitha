package com.xworkz.passportsevaapp.generatepassport;


import com.xworkz.passportsevaapp.PassportDto;

public class PassportSeva {

    public boolean userRegister(PassportDto passportDto) {
        boolean  isUserRegistered = false;

        validateUserDetails(passportDto);

        return isUserRegistered;
    }
    public boolean validateUserDetails(PassportDto passportDto){

       boolean  userValidated = true;


          boolean dobValid = false;
        if(passportDto.getDob() != null)
                  dobValid = true;
        else System.out.println("please enter valid dob");


        boolean firstNameValid = false;
        if(passportDto.getFirstName() != null )
            firstNameValid = true;
        else System.out.println("please enter valid first name");


        boolean lastNameValid = false;
        if(passportDto.getLastName() !=null)
            lastNameValid = true;
        else System.out.println("please enter valid last name");

        boolean genderValid = false;
        if(passportDto.getGender() !=null)
            genderValid=true;
        else System.out.println("please enter gender details");

        boolean CpvLoactionvalid = false;
        if(passportDto.getCpvLocation() !=null);
        else System.out.println("");



        if(dobValid  && firstNameValid && lastNameValid == true)
                userValidated = true;

        return userValidated;



        }



}
