class Converse{

  public static String signUp(String fullName, String phoneNumber, String dob, String gender )
  {
  String ref = null;
	 boolean userIsValid = validateUserProfile(fullName, phoneNumber, dob, gender);
	  if(userIsValid == true)
	   ref="User sign up succesfully";
	 else
	   ref="user sign up unsuccesfull";
  return ref;
	 
  }
  
	public static boolean validateUserProfile(String fullName, String phoneNumber, String dob, String gender){
		
	boolean userValid = false;
	boolean isfullName = false;
	boolean isphoneNumber = false;
	boolean isdob = false;
	boolean isgender = false;
	if(fullName != null && fullName.length()>=3)
	{
	 isfullName= true;
	}
	  else{
	  System.out.println("invalid name");
	  }

	if(phoneNumber != null && phoneNumber.length() > 0 && phoneNumber.length() == 10)
	{
	isphoneNumber = true;
	}
	else{
	System.out.println("Invalid phone number");
	
	}
	if(dob != null)
	{
    isdob = true;	
	}
	else{
	System.out.println("invalid DOB");
	}
	
	if(gender != null)
	{
	isgender = true;
	}
  else{
  System.out.println("invalid gender");
  }
  if(isfullName==true && isphoneNumber==true && isdob==true && isgender ==true)
  {
	  userValid=true;
	  
  }  


return userValid ;
  
  
  
  
  }







}0