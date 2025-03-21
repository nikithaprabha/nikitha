class Amazon{

  public static String signUp(String name, String phoneNumber, String dob, String mailId, String gender )
  {
  String ref = null;
    
	 boolean userIsValid = validateUserProfile(name, phoneNumber, dob, mailId, gender);
	  if(userIsValid == true)
	   ref="User sign up succesfully";
	 else
	   ref="user sign up unsuccesfull";
  return ref;
	 
  }
  
	public static boolean validateUserProfile(String name, String phoneNumber, String dob, String mailId, String gender){
		
	boolean userValid = false;
	boolean isname = false;
	
	boolean isphoneNumber = false;
	boolean isdob = false;
	boolean ismailId = false;
	boolean isgender = false;
	if(name != null && name.length()>=3)
	{
	 isname= true;
	}
	  else{
	  System.out.println("invalid full name");
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
	if(mailId != null)
	{
    ismailId = true;	
	}
	else{
	System.out.println("invalid mail Id");
	}
	if(gender != null)
	{
	isgender = true;
	}
  else{
  System.out.println("invalid gender");
  }
  if(isname==true && isphoneNumber==true && isdob==true && ismailId==true && isgender ==true)
  {
	  userValid=true;
	  
  }  


return userValid ;
  
  
  
  
  }







}