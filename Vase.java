class Vase{

		
		 String type;
		 String color;
		 String shape;

		 Vase(){
		 System.out.println("Vase constructor is invoked");
		 }

		Vase(String type, String color, String shape){
		System.out.println("constructor is invoked");
		this.type=type;
		this.color=color;
		this.shape=shape;
		}
}