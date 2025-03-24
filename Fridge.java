class Fridge{
static boolean isConnected = false;
	static int currentTemp;
    static int minTemp;
	static int maxTemp = 6;
 
  public static void onOrOff(){
	  if(isConnected == false){
	isConnected=true;
	System.out.println("AC is on");
}

else{
	isConnected=false;
System.out.println("AC is off");
return ;
}
  }
 public static void incTemp(){
	if(isConnected == true){
		if(currentTemp<maxTemp) {
			currentTemp = currentTemp+1;
			System.out.println("the current temp "+currentTemp);
		}
	else
		System.out.println("max tem reached");
	} 

 
 else
	 System.out.println("turn on the Ac");
 }
 public static void decTemp(){
	 if(isConnected == true){
		 if(currentTemp>minTemp){
			 currentTemp = currentTemp-1;
			 System.out.println("the current temp "+currentTemp);
			 
		 }
		 else
			 System.out.println("min temp reached");
	 }
	 else
		 System.out.println("turn on ac");
 }

}