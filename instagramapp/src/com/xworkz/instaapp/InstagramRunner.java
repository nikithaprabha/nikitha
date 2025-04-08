package com.xworkz.instaapp;

import com.xworkz.instaapp.instadto.InstaDto;
import com.xworkz.instaapp.registerpage.RegisterPage;

public class InstagramRunner {

    public static void main(String[] args) {
        System.out.println("MAIN STARTED");
        //object
        InstaDto sp = new InstaDto();
        sp.setPhoneNumber(9876543234l);
        sp.setUserName("vanithavijay");
        sp.setPassword("nn^23");
        sp.setConfirmPassword("98765m");

        RegisterPage condi = new RegisterPage();
        condi.userRegister(sp);
        System.out.println("full name is " + sp.getPhoneNumber());
        System.out.println("User name is " + sp.getUserName());
        System.out.println("password : " + sp.getPassword());
        System.out.println("Confirm password : " + sp.getConfirmPassword());
        System.out.println("MAIN ENDED");
    }
}
