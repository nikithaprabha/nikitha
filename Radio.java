class Radio{
static boolean connected = false;
static int currentVolume ;
static int minVolume;
static int maxVolume = 10;
 public static void onOrOff(){
  if(connected == false){
   connected = true;
   System.out.println("radio is on");
 }
 else{
 connected = false;
 System.out.println("radio is off");
 }
 }
 public static void incVolume(){
  if(connected == true){
   if(currentVolume < maxVolume){
   currentVolume = currentVolume + 1;
   System.out.println("the volume is " +currentVolume);
   }else
   System.out.println("max volume reached");
  
  }else
  System.out.println("turn on the radio");
 
 }
 public static void decVolume(){
	 if(connected == true){
		 if(currentVolume>minVolume){
			 currentVolume = currentVolume-1;
			 System.out.println("the current volume "+currentVolume);
			 
		 }
		 else
			 System.out.println("min Volume reached");
	 }
	 else
		 System.out.println("turn on the radio");
 }
 

}