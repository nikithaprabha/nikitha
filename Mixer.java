class Mixer{
static boolean connected = false;
static int currentSpeed ;
static int minSpeed;
static int maxSpeed = 3;
 public static void onOrOff(){
  if(connected == false){
   connected = true;
   System.out.println("mixer is on");
 }
 else{
 connected = false;
 System.out.println("mixer is off");
 }
 }
 public static void incSpeed(){
  if(connected == true){
   if(currentSpeed < maxSpeed){
   currentSpeed = currentSpeed + 1;
   System.out.println("the Speed is " +currentSpeed);
   }else
   System.out.println("max Speed reached");
  
  }else
  System.out.println("turn on the mixer");
 
 }
 public static void decSpeed(){
	 if(connected == true){
		 if(currentSpeed>minSpeed){
			 currentSpeed = currentSpeed-1;
			 System.out.println("the current Speed "+currentSpeed);
			 
		 }
		 else
			 System.out.println("min Speed reached");
	 }
	 else
		 System.out.println("turn on the mixer");
 }
 
 
 
}