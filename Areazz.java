class Areazz{

 static int pinCodes[] = {560098, 560096, 5660010, 560001};


   public static void main(String c[]){
   System.out.println("main started");
   
     getpinCodes();
	 
	System.out.println("main ended");
	}
	//<access-specifer> return type method name(parameter){}
	//logic
	
	public static void getpinCodes(){
		System.out.println("inside the list");
	    System.out.println("list of areas are:");
		for(int pinCode : pinCodes){
			System.out.println(pinCode);
	   }
	System.out.println("end of the list");
	}
	   
	   
	   
}