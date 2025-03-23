class ColdDrink{

		 //instance variable
		 String brand;
		 String origin;
		 String liters;


		 //no args constructor
		 ColdDrink(){
		 System.out.println("ColdDrink constructor is invoked");
		 }

		//parameterized constructor
		ColdDrink(String brand, String origin, String liters){
		System.out.println("constructor is invoked");
		this.brand=brand;
		this.origin=origin;
		this.liters=liters;
		}



}