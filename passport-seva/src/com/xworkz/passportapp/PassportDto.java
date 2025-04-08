package com.xworkz.passportapp;

import com.xworkz.passportapp.cpvlocation.CpvLocation;
import com.xworkz.passportapp.dcdrlocation.DcdrLocation;

public class PassportDto {


        private CpvLocation cpvLocation;
        private DcdrLocation dcdrLocation;
        private long phoneNumber;
        private String emailId;
        private String password;
        private String  confirmPassword;
        private String hintQuestion;


        public void setCpvLocation(CpvLocation cpvLocation){
            this.cpvLocation=cpvLocation;
        }
        public CpvLocation getCpvLocation(){
            return cpvLocation;
        }
        public void setDcdrLocation(DcdrLocation dcdrLocation){
        this.dcdrLocation=dcdrLocation;
        }
        public DcdrLocation getDcdrLocation(){
        return dcdrLocation;
        }

        public void setPhoneNumber(long number){
            this.phoneNumber = phoneNumber;
        }
        public long getPhoneNumber(){
            return phoneNumber;
        }
        public void setEmailId(String Email){
            this.emailId=emailId;
        }
        public String getEmailId(){
            return emailId;
        }
        public void setPassword(String password){
        this.password=password;
        }
        public String getPassword(){
        return password;
        }
        public void setConfirmPassword(String ConfirmPassword){
        this.confirmPassword=confirmPassword;
        }
        public String getConfirmPassword(){
        return confirmPassword;
       }
        public void setHintQuestion(String hintQuestion){
        this.hintQuestion=hintQuestion;
       }
        public String getHintQuestion(){
        return hintQuestion;
       }
    }




