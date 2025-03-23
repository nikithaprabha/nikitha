class Chain{

 String material;
 String shape;
 String size;
 
 
 //parameterized constructor
  Chain(String material, String shape, String size){
      this.material = material;
	  this.shape = shape;
	  this.size = size;
  }

 //no args constructor
  Chain(){
  System.out.println("constructor invoked");
  }



}