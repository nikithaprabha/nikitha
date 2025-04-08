package com.xworkz.passportapp.passportseva;

import com.xworkz.passportapp.PassportDto;
import com.xworkz.passportapp.cpvlocation.CpvLocation;
import com.xworkz.passportapp.dcdrlocation.DcdrLocation;

public class PassportSeva {

 public boolean registerUser(PassportDto PassportDto) {


  boolean isUserRegisterd = false;

  boolean userValidate = validateUser(PassportDto);
          if(userValidated == true)
           isUserRegisterd = true;
          else {
            System.out.println("user is not registered try again later");
          }
          return isUserRegisterd;
 }
public boolean validateUser(PassportDto passportDto){
   boolean userValidated = false;
   boolean isCpvLocationValid = false;
   boolean isDcdrLocationValid = false;
  boolean phoneNumberValid = false;
  boolean emaiIdValid = false;
  boolean passwordValid = false;
  boolean confirmPadsswordValid =false;
  boolean hintQuestion = false;
  String

 }