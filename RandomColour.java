class RandomColour{
     
	 
	static String randomColours[] = {"pink" ,"white" ,"blue" ,"black" ,"peach " ,"marron " ,"silver " ,"copper" ,"orange " ,"green", "yellow" ,"sea blue" ,"mustard yellow" ,"neon green " ,"violt" ,"lavender" ,"baige" ,"lemon yellow" ,"gold" ,"brown"  ,"copper red" ,"rose gold" ,"megantha", "pista green" ,"rose gold" ,"bottle green" ,"royal blue" ,"baby pink" ,"grey" ,"peach white" ,"olive" ,"amber" ,"cyan" ,"teal" ,"wheel white" ,"light brown" ,"burgundy" ,"ash black" ,"emerald" ,"ivory" };
 
	 
	 
	 public static void main(String n[]){
 
     System.out.println("main started");
   
        fetchrandomColours();
	 
	System.out.println("main ended");
	
	
}
 
 
 
          public static void fetchrandomColours(){
  
     System.out.println("inside new main()");
	 System.out.println("random colours available are: ");
	 
	 
	 for(String nColour : randomColours){
	 System.out.println(nColour);
	 
	 }
	 System.out.println("end new()");
 
 
 
 
 }







}