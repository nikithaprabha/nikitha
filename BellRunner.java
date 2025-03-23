class BellRunner{

 public static void main(String rings[]){
 
 
	 //copy1
	 Bell bl1 = new Bell();
	 bl1.types="cow bells";
	 bl1.color="reddish";
	 bl1.sound="ding ding";
	
	 System.out.println("shpe :"+bl1.types);
	 System.out.println("color :"+bl1.color);
	 System.out.println("sound :"+bl1.sound);
	 
	 
	 //copy2
	 Bell bl2 = new Bell();
	 bl2.types="hand bells";
	 bl2.color="yellow";
	 bl2.sound="tring tring";

	 System.out.println("types :"+bl2.types);
	 System.out.println("color  :"+bl2.color);
	 System.out.println("sound :"+bl2.sound);
	
	 
	 //copy3
	 Bell bl3 = new Bell();
	 bl3.types="tea bells";
	 bl3.color="gold";
	 bl3.sound="ring ring";

	 System.out.println("types :"+bl3.types);
	 System.out.println("color  :"+bl3.color);
	 System.out.println("sound :"+bl3.sound);
	
	 
	 //copy4
	 Bell bl4 = new Bell();
	 bl4.types="chime bells";
	 bl4.color="white";
	 bl4.sound="chime chime";

	 System.out.println("types :"+bl4.types);
	 System.out.println("color  :"+bl4.color);
	 System.out.println("sound :"+bl4.sound);
	 
	 
	 //copy5
	 Bell bl5 = new Bell();
	 bl5.types="craft bells";
	 bl5.color="red";
	 bl5.sound="to to";

	 System.out.println("types :"+bl5.types);
	 System.out.println("color  :"+bl5.color);
	 System.out.println("sound :"+bl5.sound);
	
 
     //copy 6
     Bell bl6 = new Bell("farm bells",  "brown", "clang");
     System.out.println("types :"+bl6.types);
     System.out.println("color  :"+bl6.color);
     System.out.println("sound :"+bl6.sound);
	
 
     //copy 7
     Bell bl7 = new Bell("garden bells", "silver", "ting thing");
     System.out.println("types :"+bl7.types);
     System.out.println("color  :"+bl7.color);
	 System.out.println("sound :"+bl7.sound);
     
 
 
 }
}