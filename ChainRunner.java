class ChainRunner{

 public static void main(String ornaments[]){
 //no args
   //instantiated 1
     Chain cn1 = new Chain();
     cn1.material = "Gold";
	 cn1.shape = "link";
     cn1.size = "20cm*0.3cm";
	 
	 System.out.println("Material :"+cn1.material);
     System.out.println("Shape :"+cn1.shape);
     System.out.println("Size :"+cn1.size);
     
     //instantiated 2
     Chain cn2 = new Chain();
     cn2.material = "patinum";
	 cn2.shape = "snake";
     cn2.size = "10cm*0.2cm";
	 
	 System.out.println("Material :"+cn2.material);
     System.out.println("Shape :"+cn2.shape);
     System.out.println("Size :"+cn2.size);
     
      //instantiated 3
     Chain cn3 = new Chain();
     cn3.material = "rose gold";
	 cn3.shape = "box";
     cn3.size = "25cm*0.4cm";
	 
	 System.out.println("Material :"+cn3.material);
     System.out.println("Shape :"+cn3.shape);
     System.out.println("Size :"+cn3.size);
 
     //instantiated 4
     Chain cn4 = new Chain();
     cn4.material = "Silver";
	 cn4.shape = "round";
     cn4.size = "35m*0.5cm";
	 
	 System.out.println("Material :"+cn4.material);
     System.out.println("Shape :"+cn4.shape);
     System.out.println("Size :"+cn4.size);
 
 //Parameterized
     //instantiated 5
     Chain cn5 = new Chain("copper", "Sqaure(pendant)", "28cm*0.25cm");
     System.out.println("Material :"+cn5.material);
     System.out.println("Shape :"+cn5.shape);
     System.out.println("Size :"+cn5.size);
 
      //instantiated 6
     Chain cn6 = new Chain("steel", "Sqaure(hallow)", "23cm*0.18cm");
     System.out.println("Material :"+cn6.material);
     System.out.println("Shape :"+cn6.shape);
     System.out.println("Size :"+cn6.size);
 
     
      //instantiated 7
     Chain cn7 = new Chain("silver coated gold", "Bead", "40cm*0.6cm");
     System.out.println("Material :"+cn7.material);
     System.out.println("Shape :"+cn7.shape);
     System.out.println("Size :"+cn7.size);

 
 }
}