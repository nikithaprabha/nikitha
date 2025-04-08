package com.xworkz.instaapp.registerpage;

import com.xworkz.instaapp.instadto.InstaDto;

public class RegisterPage {



        public boolean userRegister(InstaDto instaDto) {
            boolean  isUserRegistered = false;

            validateUserDetails(instaDto);

            return isUserRegistered;
        }
        public boolean validateUserDetails(InstaDto instaDto) {

            boolean userValidated = true;


            boolean userNameValid = false;
            if(instaDto.getUserName() != null )
                userNameValid = true;
            else System.out.println("its worng userName");



            boolean passwordValid = false;
            if(instaDto.getPassword() != null )
                passwordValid = true;
            else System.out.println("please enter valid password");

            boolean confirmPasswordValid = false;
            if(instaDto.getConfirmPassword() != null )
                confirmPasswordValid = true;
            else System.out.println("please enter again valisd password which is to be same ");



            if(userNameValid && passwordValid && confirmPasswordValid == true)
                userValidated = true;

            return userValidated;
        }
    }

