package com.xworkz.instaapp.instadto;

public class InstaDto {

    private long phoneNumber;
    private String userName;
    private String password;
    private String confirmPassword;
    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public long getPhoneNumber(){
        return phoneNumber;
    }
    public void setUserName(String UserName){ this.userName = userName;}
    public String getUserName(){return userName;}
    public void setPassword(String password){this.password = password;}
    public String getPassword(){return password;}
    public void setConfirmPassword(String confirmPassword){this.confirmPassword = confirmPassword;}
    public String getConfirmPassword(){return confirmPassword;}


}
