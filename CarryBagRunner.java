class CarryBagRunner{

 public static void main(String CarryBag[]){
 
 
	 //copy1
	 CarryBag cb1 = new CarryBag();
	 cb1.type= "Canvas carry bags";
	 cb1.material="plastic";
	 cb1.price=30;
	
	 System.out.println("type :"+ cb1.type);
	 System.out.println("material :"+cb1.material);
	 System.out.println("price :"+cb1.price);
	 
	 
	 //copy2
	 CarryBag cb2 = new CarryBag();
	 cb2.type="Paper carry bags";
	 cb2.material="paper";
	 cb2.price=35;

	 System.out.println("type :"+cb2.type);
	 System.out.println("material  :"+cb2.material);
	 System.out.println("price :"+cb2.price);
	
	 
	 //copy3
	 CarryBag cb3 = new CarryBag();
	 cb3.type="Jute Carry Bags";
	 cb3.material="jute";
	 cb3.price=40;

	 System.out.println("type :"+cb3.type);
	 System.out.println("material  :"+cb3.material);
	 System.out.println("price :"+cb3.price);
	
	 
	 //copy4
	 CarryBag cb4 = new CarryBag();
	 cb4.type="Cotton Carry Bags";
	 cb4.material="cotton";
	 cb4.price=45;

	 System.out.println("type :"+cb4.type);
	 System.out.println("material  :"+cb4.material);
	 System.out.println("price :"+cb4.price);
	 
	 
	 //copy5
	 CarryBag cb5 = new CarryBag();
	 cb5.type= "Non Woven Bags";
	 cb5.material="fibre";
	 cb5.price=50;

	 System.out.println("type :"+cb5.type);
	 System.out.println("material  :"+cb5.material);
	 System.out.println("price :"+cb5.price);
	
 
     //copy 6
     CarryBag cb6 = new CarryBag("event bags",  "polypropylene", 40);
     System.out.println("types :"+cb6.type);
     System.out.println("material  :"+cb6.material);
     System.out.println("price :"+cb6.price);
	
 
     //copy 7
     CarryBag cb7 = new CarryBag("jewellary bag", "polyethylene", 50);
     System.out.println("types :"+cb7.type);
     System.out.println("material  :"+cb7.material);
	 System.out.println("price :"+cb7.price);
     
 
 
 }
}