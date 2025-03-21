class MaxFashion{

  public static String signUp(String firstName, String lastName, String phoneNumber, String dob, String mailId, String gender )
  {
  String ref = null;
     //validation
	 boolean userIsValid = validateUserProfile(firstName, lastName, phoneNumber, dob, mailId, gender);
	  if(userIsValid == true)
	   ref="User sign up succesfully";
	 else
	   ref="user sign up unsuccesfull";
  return ref;
	 
  }
  
	public static boolean validateUserProfile(String firstName, String lastName, String phoneNumber, String dob, String mailId, String gender){
		
	boolean userValid = false;
	boolean isfirstName = false;
	boolean islastName = false;
	boolean isphoneNumber = false;
	boolean isdob = false;
	boolean ismailId = false;
	boolean isgender = false;
	if(firstName != null && firstName.length()>=3)
	{
	 isfirstName= true;
	}
	  else{
	  System.out.println("invalid first name");
	  }
	if(lastName != null && lastName.length()>=1)
   {
     islastName = true;
   }	
	else{
	System.out.println("invalid last name");
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
  if(isfirstName==true && islastName==true && isphoneNumber==true && isdob==true && ismailId==true && isgender ==true)
  {
	  userValid=true;
	  
  }  


return userValid ;
  
  
  
  
  }







}