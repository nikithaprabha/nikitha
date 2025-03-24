class LulluHypermart{
	
	
	
	static String groceries[] = { "egg" ,"bread" ,"nuts" ,"sugar" ," chat powder" ,"maida" ,"oil" ,"wheat" ,"gram powder" ,"salt" };
    static String perfumes[] = {"Bella vita" ,"yardley london" ,"miniso morning mist" ,"COCO MADEMOISELLE" ,"Carolina Herrera" ,"Envy " ,"Ramsons U. R." ,"Valentino Donna Born In Roma" ,"skinn NOX" ,"Water girl" };
    static String biscuits[] = { "bourbon" ,"little hearts", "britannia 50-50 " ,"masca chaska" ,"good day" ,"mari gold biscuit" ,"hide and sike" ,"dark fantansy" };
    static String vegetables[] = { "tomato" ,"onion" ,"ginger" ,"garlic" ,"mashroom" ,"bottle gard" ,"ladies finger" ,"cabbage" ,"drum stick" ,"coliflower"};       
    static String utensils[] = { "knives" ,"forks" ,"spoons" ,"spatula" ,"pan" ,"grater" ,"stove" ,"gass lighter" ,"plate" ,"pealer"};

 
   public static void main(String market[]){

   System.out.println("main started");
   
     getgroceries();
	 getperfumes();
	 getbiscuits();
	 getvegetables();
	 getutensils();
	System.out.println("main ended");
	
	
	}

	public static void  getgroceries(){
  
     
     
	 System.out.println("groceries avaiable: ");
	 
	 
	 for(String gro1 : groceries ){
	 System.out.println(gro1);
	 }
	 }
	 
	public static void  getperfumes(){
  
     
	 System.out.println("perfumes avaiable: ");
	 
	 
	 for(String perf1 : perfumes ){
	 System.out.println(perf1);
	 }
	 }


	public static void getbiscuits(){
  
     
	 System.out.println("biscuits avaiable: ");
	 
	 
	 for(String bis1 : biscuits ){
	 System.out.println(bis1);
	 }
	 }
	 
	  public static void getvegetables(){
  
     
	 System.out.println("vegetables avaiable: ");
	 
	 
	 for(String veg1 : vegetables  ){
	 System.out.println(veg1);
	 }
	 }
	 
	 
	 
	 
	
	  public static void getutensils(){
  
     
	 System.out.println("utensils avaiable: ");
	 
	 
	 for(String util : utensils  ){
	 System.out.println(util);
	 }
	 } 
}	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
