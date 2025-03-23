class Shampoo{

 //instance variable
 String brand;
 int volume;
 boolean isConditionerAvailable;
 
 
  //no args constructor
   Shampoo(){
   System.out.println(" constructor invoked");
   
   }  
 
  //Parameterized
  Shampoo(String brand, int volume,boolean isConditionerAvailable){
    this.brand=brand;
	this.volume=volume;
	this.isConditionerAvailable=isConditionerAvailable;
  
  }

}