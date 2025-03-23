class BgRunner{

 public static void main(String[]mouthFreshner){
 
//using no args constructor and ref variables
    //copy1
	BubbleGum ref1 = new BubbleGum();
	ref1.flavor="mint";
	ref1.colour ="green";
    ref1.size = "small";
    System.out.println("BubbleGum flavor is : "+ref1.flavor);
	System.out.println("BubbleGum Colour is : "+ref1.colour);
	System.out.println("BubbleGum size available is : "+ref1.size);
    
	//copy2
    BubbleGum ref2 = new BubbleGum();
	ref2.flavor="strawberry";
	ref2.colour ="pin";
    ref2.size = "regular";
    System.out.println("BubbleGum flavor is : "+ref2.flavor);
	System.out.println("BubbleGum Colour is : "+ref2.colour);
	System.out.println("BubbleGum size is : "+ref2.size);
    
    //copy3
    BubbleGum ref3 = new BubbleGum();
	ref3.flavor="rasberry";
	ref3.colour ="pink";
    ref3.size = "medium";
    System.out.println("BubbleGum flavor is : "+ref3.flavor);
	System.out.println("BubbleGum Colour is : "+ref3.colour);
	System.out.println("BubbleGum size is : "+ref3.size);
    
	//copy4
	BubbleGum ref4 = new BubbleGum();
	ref4.flavor="blueberry";
	ref4.colour ="blue";
    ref4.size = "small";
    System.out.println("BubbleGum flavor is : "+ref4.flavor);
	System.out.println("BubbleGum Colour is : "+ref4.colour);
	System.out.println("BubbleGum size avail is : "+ref4.size);
    
	
//using parameterized constructor
    //copy5
	BubbleGum ref5 = new BubbleGum("watermellom", "red", "large");
	
	System.out.println("BubbleGum flavor is : "+ref5.flavor);
	System.out.println("BubbleGum Colour is : "+ref5.colour);
	System.out.println("BubbleGum size avail is : "+ref5.size);
    
	//copy6
	BubbleGum ref6 = new BubbleGum("lemmon", "yellow", "medium");
	
	System.out.println("BubbleGum flavor is : "+ref6.flavor);
	System.out.println("BubbleGum Colour is : "+ref6.colour);
	System.out.println("BubbleGum size avail is : "+ref6.size);
    
	//copy7
	BubbleGum ref7 = new BubbleGum("orange", "orange", "small");
	
	System.out.println("BubbleGum flavor is : "+ref7.flavor);
	System.out.println("BubbleGum Colour is : "+ref7.colour);
	System.out.println("BubbleGum size avail is : "+ref7.size);
    
  
  
 }

}