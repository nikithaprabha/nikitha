class NoodlesAdda{
     
	 
	 
	     static String noodles[] = {"chiken noodles" ,"Egg noodles" ,"veg noodles" ,"mixed noodles" ,"gobi noodles" ,"thai noodles" ,"schezwan veg noodles" ,"schezwan fried chiken noodles" ,"Talwanese egg noodles" ,"Talwanese veg noodles"};
 
         public static void main(String hotel[]){
 
            System.out.println("main started");
   
              fetchnoodles();
	 
	         System.out.println("main ended");
	
	
}
                         
      		public static void fetchnoodles(){
  
                    System.out.println("inside new()");
                    System.out.println("noodles served from noodles adda are as follows: ");
	 
	 
	                          for(String noodlesFirst : noodles){
	                             System.out.println(noodlesFirst);
	 
	                          }
	                 System.out.println("end of new()");
	 
	 
	 }
  
  
  
  
  }
