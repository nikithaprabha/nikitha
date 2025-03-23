class VaseRunner{

 public static void main(String []showpiece){
 
 
	 //copy1
	 Vase vs1 = new Vase();
	 vs1.type="Mason Jar";
	 vs1.color="orange";
	 vs1.shape="Oval";
	
	 System.out.println("shpe :"+vs1.type);
	 System.out.println("color :"+vs1.color);
	 System.out.println("Shape :"+vs1.shape);
	 
	 
	 //copy2
	 Vase vs2 = new Vase();
	 vs2.type="Milk Bottle";
	 vs2.color="yellow";
	 vs2.shape="square";

	 System.out.println("type :"+vs2.type);
	 System.out.println("color  :"+vs2.color);
	 System.out.println("Shape :"+vs2.shape);
	
	 
	 //copy3
	 Vase vs3 = new Vase();
	 vs3.type="Rustic Vase";
	 vs3.color="grey";
	 vs3.shape="basket";

	 System.out.println("type :"+vs3.type);
	 System.out.println("color  :"+vs3.color);
	 System.out.println("Shape :"+vs3.shape);
	
	 
	 //copy4
	 Vase vs4 = new Vase();
	 vs4.type="Glass Vase";
	 vs4.color="blue";
	 vs4.shape="hourglass";

	 System.out.println("type :"+vs4.type);
	 System.out.println("color  :"+vs4.color);
	 System.out.println("Shape :"+vs4.shape);
	 
	 
	 //copy5
	 Vase vs5 = new Vase();
	 vs5.type=" Bouquet Vase";
	 vs5.color="marron";
	 vs5.shape="bottle";

	 System.out.println("type :"+vs5.type);
	 System.out.println("color  :"+vs5.color);
	 System.out.println("Shape :"+vs5.shape);
	
 
     //copy 6
     Vase vs6 = new Vase("Metal Vase",  "brown", "cone shape");
     System.out.println("type :"+vs6.type);
     System.out.println("color  :"+vs6.color);
     System.out.println("Shape :"+vs6.shape);
	
 
     //copy 7
     Vase vs7 = new Vase("Ceramic Vase", "green", "bag type");
     System.out.println("type :"+vs7.type);
     System.out.println("color  :"+vs7.color);
	 System.out.println("Shape :"+vs7.shape);
     
 
 
 }
}