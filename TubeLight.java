class TubeLight{

		 //instance variable
		 String brand;
		 String origin;
		 int date;


		 //no args constructor
		 TubeLight(){
		 System.out.println("TubeLight constructor is invoked");
		 }

		//parameterized constructor
		TubeLight(String brand, String origin, int	date){
		System.out.println("constructor is invoked");
		this.brand=brand;
		this.origin=origin;
		this.date=date;
		}



}