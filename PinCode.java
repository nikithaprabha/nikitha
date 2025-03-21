class PinCode{


    static String zipcodes[] = {"560001-Mahatma Gandhi road" ,"560003-malleshwaram" ,"560096-Nandinilayout" ,"560021-Okalipuram" ,"560010-Rajajinagar I block" ,"560022-Yeswanthpur" ,"560050-Dasarahalli" ,"560038-Indiranagar" ,"560078-J P nagar" ,"560013-Jalahalli" };
  

    
  public static void main(String area[]){
       
	   
   System.out.println("main started");
   
     getzipCodes();
	 
	System.out.println("main ended");
	
	
}	   
	   
  
 
  
  
   public static void getzipCodes(){
  
     System.out.println("inside new main()");
	 System.out.println("Area pincodes are as follows  : ");
	 
	 
	 for(String zipCode : zipcodes){
	 System.out.println(zipCode);
	 
	 }
	 System.out.println("end of new main ()");
	 
	 
	 }
  
  
  
  
  }
   
   