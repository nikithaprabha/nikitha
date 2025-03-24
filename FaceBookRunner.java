class FaceBookRunner{

      public static void main(String socialNetwork[]){
	      
       Facebook page = new Facebook(); 
	   page.id = 1234567890;
	   page.firstName = "Kanika";
	   page.lastName = "arjun";
	   page.gender = 'M';
	   page.dob = 27102003;
	   
	   System.out.println("FB id of a User is "+page.id);
	   System.out.println("User First Name "+page.firstName);
	   System.out.println("User last Name "+page.lastName);
	   System.out.println("User gender "+page.gender);
	   System.out.println("User date of birth "+page.dob);
	  
	  }

}