package com.xworkz.spotifyapp.generation;

import com.xworkz.spotifyapp.SoptifyDto;

public class Spotify {


    public boolean userRegister(SoptifyDto soptifyDto) {
        boolean  isUserRegistered = false;

        validateUserDetails(soptifyDto);

        return isUserRegistered;
    }
    public boolean validateUserDetails(SoptifyDto soptifyDto) {

        boolean userValidated = true;

        boolean passwordValid = false;
        if(soptifyDto.getPassword() != null )
            passwordValid = true;
        else System.out.println("please enter valid password");

        boolean confirmPasswordValid = false;
        if(soptifyDto.getConfirmPassword() != null )
            confirmPasswordValid = true;
        else System.out.println("please enter again valisd password which is to be same ");



        if( passwordValid && confirmPasswordValid == true)
            userValidated = true;

        return userValidated;
    }
    }