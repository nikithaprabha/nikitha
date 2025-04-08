package com.xworkz.spotifyapp;

import com.xworkz.spotifyapp.generation.Spotify;

public class SoptifyRunner {

    public static void main(String[] args) {
        System.out.println("MAIN STARTED");
        //object
        SoptifyDto sp = new SoptifyDto();
        sp.setFullName("Nalini Nagesh");
        sp.setEmailId("Nalini@123");
        sp.setPassword("nn^23");
        sp.setConfirmPassword("nn^23lk");

        Spotify condi = new Spotify();
        condi.userRegister(sp);
        System.out.println("full name is " + sp.getFullName());
        System.out.println("mailID is " + sp.getEmailId());
        System.out.println("password : " + sp.getPassword());
        System.out.println("Confirm password : " + sp.getConfirmPassword());
        System.out.println("MAIN ENDED");
    }
}
