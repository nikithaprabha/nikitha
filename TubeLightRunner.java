class TubeLightRunner{

 public static void main(String TubeLight[]){
 
 
	 //copy1
	 TubeLight tl1 = new TubeLight();
	 tl1.brand= "Philips Lighting";
	 tl1.origin="Eindhoven, Netherlands";
	 tl1.date=1891;
	
	 System.out.println("brand :"+ tl1.brand);
	 System.out.println("origin :"+tl1.origin);
	 System.out.println("Established in :"+tl1.date);
	 
	 
	 //copy2
	 TubeLight tl2 = new TubeLight();
	 tl2.brand="Vorlane";
	 tl2.origin="Guangdong, China";
	 tl2.date=2014;

	 System.out.println("brand :"+tl2.brand);
	 System.out.println("origin  :"+tl2.origin);
	 System.out.println("Established in :"+tl2.date);
	
	 
	 //copy3
	 TubeLight tl3 = new TubeLight();
	 tl3.brand="Syska";
	 tl3.origin="pune,india";
	 tl3.date=1989;

	 System.out.println("brand :"+tl3.brand);
	 System.out.println("origin  :"+tl3.origin);
	 System.out.println("Established in :"+tl3.date);
	
	 
	 //copy4
	 TubeLight tl4 = new TubeLight();
	 tl4.brand="Havells";
	 tl4.origin="Noida, India";
	 tl4.date=1958;

	 System.out.println("brand :"+tl4.brand);
	 System.out.println("origin  :"+tl4.origin);
	 System.out.println("Established in :"+tl4.date);
	 
	 
	 //copy5
	 TubeLight tl5 = new TubeLight();
	 tl5.brand= "Wipro";
	 tl5.origin="Bangalore, India";
	 tl5.date=1945;

	 System.out.println("brand :"+tl5.brand);
	 System.out.println("origin  :"+tl5.origin);
	 System.out.println("Established in :"+tl5.date);
	
 
     //copy 6
     TubeLight tl6 = new TubeLight("Crompton",  "Mumbai, India", 1937);
     System.out.println("brand :"+tl6.brand);
     System.out.println("origin  :"+tl6.origin);
     System.out.println("Established in :"+tl6.date);
	
 
     //copy 7
     TubeLight tl7 = new TubeLight("Bajaj", "Mumbai,India",1945);
     System.out.println("brand :"+tl7.brand);
     System.out.println("origin  :"+tl7.origin);
	 System.out.println("Established in :"+tl7.date);
     
 
 
 }
}