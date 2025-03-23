class ColdDrinkRunner{

 public static void main(String ColdDrink[]){
 
 
	 //copy1
	 ColdDrink cd1 = new ColdDrink();
	 cd1.brand= "Coco Cola";
	 cd1.origin="United states";
	 cd1.liters="500ml";
	
	 System.out.println("brand :"+ cd1.brand);
	 System.out.println("origin :"+cd1.origin);
	 System.out.println("liters :"+cd1.liters);
	 
	 
	 //copy2
	 ColdDrink cd2 = new ColdDrink();
	 cd2.brand="Pepsi";
	 cd2.origin="USA";
	 cd2.liters="500ml";

	 System.out.println("brand :"+cd2.brand);
	 System.out.println("origin  :"+cd2.origin);
	 System.out.println("liters :"+cd2.liters);
	
	 
	 //copy3
	 ColdDrink cd3 = new ColdDrink();
	 cd3.brand="Fanta";
	 cd3.origin="Germany";
	 cd3.liters="250ml";

	 System.out.println("brand :"+cd3.brand);
	 System.out.println("origin  :"+cd3.origin);
	 System.out.println("liters :"+cd3.liters);
	
	 
	 //copy4
	 ColdDrink cd4 = new ColdDrink();
	 cd4.brand="Sprite";
	 cd4.origin="USA";
	 cd4.liters="200ml";

	 System.out.println("brand :"+cd4.brand);
	 System.out.println("origin  :"+cd4.origin);
	 System.out.println("liters :"+cd4.liters);
	 
	 
	 //copy5
	 ColdDrink cd5 = new ColdDrink();
	 cd5.brand= "Mirinda";
	 cd5.origin="Algeria";
	 cd5.liters="500ml";

	 System.out.println("brand :"+cd5.brand);
	 System.out.println("origin  :"+cd5.origin);
	 System.out.println("liters :"+cd5.liters);
	
 
     //copy 6
     ColdDrink cd6 = new ColdDrink("Thumbs Up",  "India", "450ml");
     System.out.println("brand :"+cd6.brand);
     System.out.println("origin  :"+cd6.origin);
     System.out.println("liters :"+cd6.liters);
	
 
     //copy 7
     ColdDrink cd7 = new ColdDrink("Limca", "India", "500ml");
     System.out.println("brand :"+cd7.brand);
     System.out.println("origin  :"+cd7.origin);
	 System.out.println("liters :"+cd7.liters);
     
 
 
 }
}