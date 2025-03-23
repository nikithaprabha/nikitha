class NoodlesRunner{

 public static void main(String []food){
 
    //copy1
    Noodles food1 = new Noodles("ramen", "vegetable", true);
    System.out.println("flavor :"+food1.flavor);
	System.out.println("type :"+food1.type);
	System.out.println("isVegetarian :"+food1.isVegetarian);
  
    //copy2  
    Noodles food2 = new Noodles("spaghetti", "saucy", false);
    System.out.println("flavor :"+food2.flavor);
	System.out.println("type :"+food2.type);
	System.out.println("isVegetarian :"+food2.isVegetarian);	
	
	//copy3
    Noodles food3 = new Noodles("chicken schezhawan", "spicy", false );
    System.out.println("flavor :"+food3.flavor);
	System.out.println("type :"+food3.type);
	System.out.println("isVegetarian :"+food3.isVegetarian);
    
	//copy4
	Noodles food4 = new Noodles("instant noodles", "shrimp", true);
    System.out.println("flavor :"+food4.flavor);
	System.out.println("type:"+food4.type);
	System.out.println("isVegetarian :"+food4.isVegetarian);
	
	//copy5
	Noodles food5 = new Noodles();
	food5.flavor = "Penne";
	food5.type = "salty";
	food5.isVegetarian = true;
	
	System.out.println("flavor :"+food5.flavor);
	System.out.println("type :"+food5.type);
	System.out.println("isVegetarian :"+food5.isVegetarian);
	
	//copy6
	Noodles food6 = new Noodles();
	food6.flavor = "egg noodles";
	food6.type = "oraganic";
	food6.isVegetarian = false;
	
	System.out.println("flavor :"+food6.flavor);
	System.out.println("type :"+food6.type);
	System.out.println("isVegetarian :"+food6.isVegetarian);
	
	//copy7
    Noodles food7 = new Noodles();
	food7.flavor = "rice noodles";
	food7.type = "juicy";
	food7.isVegetarian =  true;
	
	System.out.println("flavor :"+food7.flavor);
	System.out.println("type :"+food7.type);
	System.out.println("isVegetarian :"+food7.isVegetarian);

 
 
 }
}