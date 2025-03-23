class StoveRun{
 public static void main(String[]cooking){
 
 //parameterized constructor
    //copy1
    Stove st1 = new Stove("Haier", "6", "gas");
    System.out.println("brand :"+st1.brand);
	System.out.println("Burner :"+st1.burner);
	System.out.println("Type :"+st1.type);
  
    //copy2  
    Stove st2 = new Stove("Hawels", "2", "electric");
    System.out.println("brand :"+st2.brand);
	System.out.println("Burner :"+st2.burner);
	System.out.println("Type :"+st2.type);	
	
	//copy3
    Stove st3 = new Stove("perstige", "4", "induction");
    System.out.println("brand :"+st3.brand);
	System.out.println("Burner :"+st3.burner);
	System.out.println("Type :"+st3.type);
    
	//copy4
	Stove st4 = new Stove("pegion", "3", "gas");
    System.out.println("brand :"+st4.brand);
	System.out.println("Burner :"+st4.burner);
	System.out.println("Type :"+st4.type);
	
	//copy5
	Stove st5 = new Stove();
	st5.brand = "preethi";
	st5.burner = "3";
	st5.type = "induction";
	
	System.out.println("brand :"+st5.brand);
	System.out.println("Burner :"+st5.burner);
	System.out.println("Type :"+st5.type);
	
	//copy6
	Stove st6 = new Stove();
	st6.brand = "butterfly";
	st6.burner = "5";
	st6.type = "gas";
	
	System.out.println("brand :"+st6.brand);
	System.out.println("Burner :"+st6.burner);
	System.out.println("Type :"+st6.type);
	
	//copy7
    Stove st7 = new Stove();
	st7.brand = "Samsung";
	st7.burner = "2";
	st7.type = "gas";
	
	System.out.println("brand :"+st7.brand);
	System.out.println("Burner :"+st7.burner);
	System.out.println("Type :"+st7.type);

 }
}