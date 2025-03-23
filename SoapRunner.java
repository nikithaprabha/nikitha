class SoapRunner{

   public static void main(String bodyWash[]){
   
  Soap hold = new Soap();
   //instantiated 1
     Soap hold1= new Soap();
     hold1.brand = "Lux";
	 hold1.fregrance = "Rose";
     hold1.grams = 200;
	 
	 System.out.println("brand :"+hold1.brand);
     System.out.println("fregrance :"+hold1.fregrance);
     System.out.println("grams :"+hold1.grams);
     
     //instantiated 2
     Soap hold2 = new Soap();
     hold2.brand = "LifeBoy";
	 hold2.fregrance = "rose";
     hold2.grams = 125;
	 
	 System.out.println("brand :"+hold2.brand);
     System.out.println("fregrance :"+hold2.fregrance);
     System.out.println("grams :"+hold2.grams);
     
      //instantiated 3
     Soap hold3 = new Soap();
     hold3.brand = "detol";
	 hold3.fregrance = "mixed detol";
     hold3.grams = 150;
	 
	 System.out.println("brand :"+hold3.brand);
     System.out.println("fregrance :"+hold3.fregrance);
     System.out.println("grams :"+hold3.grams);
 
     //instantiated 4
     Soap hold4 = new Soap();
     hold4.brand = "medmix";
	 hold4.fregrance = " Gardenia";
     hold4.grams = 200;
	 
	 System.out.println("brand :"+hold4.brand);
     System.out.println("fregrance :"+hold4.fregrance);
     System.out.println("grams :"+hold4.grams);
 
 //Parameterized
     //instantiated 5
     Soap hold5 = new Soap("Santoor", "sandal", 100);
     System.out.println("brand :"+hold5.brand);
     System.out.println("fregrance :"+hold5.fregrance);
     System.out.println("grams :"+hold5.grams);
 
      //instantiated 6
     Soap hold6 = new Soap("pears", "lemon", 75);
     System.out.println("brand :"+hold6.brand);
     System.out.println("fregrance :"+hold6.fregrance);
     System.out.println("grams :"+hold6.grams);
 
     
      //instantiated 7
     Soap hold7 = new Soap("cintol", "irish", 65);
     System.out.println("brand :"+hold7.brand);
     System.out.println("fregrance :"+hold7.fregrance);
     System.out.println("grams :"+hold7.grams);

 
 }
}
