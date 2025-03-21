class AirCon{
        static boolean isOnOrOff=false;
		static int currentTemp;
		static int maxTemp=5;
		static int minTemp;
		
	public static void working()
  {
  
    
        if(isOnOrOff == false){
          isOnOrOff = true;
		  System.out.println("its on");
         } 
		 else{
		 isOnOrOff = false;
		 System.out.println("its off");
		 }
}    

  //increase temp
  public static void increaseTemperature()
  {
  //nested if else condition 
  if(isOnOrOff==true)
  {    
	  if(currentTemp < maxTemp){
      currentTemp = currentTemp+1;
      System.out.println("the current temp is "+currentTemp);
	  }else System.out.println("Max temp reached..");
  }else System.out.println("gube turn on the ac");
 return;
  
  }
  public static void decreaseTemp(){
  if(isOnOrOff==true)  
	{
    if(currentTemp > minTemp){
      currentTemp = currentTemp-1;	
	}else System.out.println("Min temp reached..");
  }else System.out.println("gube turn on the ac");
    
	return;
		
	
	  
	  
	  
	  
   }
  } 
  
  
  
  
  
  
