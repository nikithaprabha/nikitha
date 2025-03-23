class Mat{

 //instance variable
 String pattern;
 String color;
 String clothType;
 boolean isWashable;


 //no args constructor
 Mat(){
 System.out.println("Mat constructor is invoked");
 }

//parameterized constructor
Mat(String pattern, String color, String clothType, boolean isWashable){
System.out.println("constructor is invoked");
this.pattern=pattern;
this.color=color;
this.clothType=clothType;
this.isWashable=isWashable;
}



}