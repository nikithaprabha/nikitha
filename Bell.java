class Bell{

//instance variable
  String types;
  String color;
  String sound;


//no args constructor
  Bell(){
  System.out.println("Bell constructor is invoked");
  }

//parameterized constructor
  Bell(String types, String color, String sound){
  System.out.println("constructor is invoked");
  this.types=types;
  this.color=color;
  this.sound=sound;
		}



}