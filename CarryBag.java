class CarryBag{

		 //instance variable
		 String type;
		 String material;
		 int price;


		 //no args constructor
		 CarryBag(){
		 System.out.println("CarryBag constructor is invoked");
		 }

		//parameterized constructor
		CarryBag(String type, String material, int price){
		System.out.println("constructor is invoked");
		this.type=type;
		this.material=material;
		this.price=price;
		}



}