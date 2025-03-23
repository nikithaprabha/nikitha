class Noodles{
 
 Noodles(){
 System.out.println("connstructor is invoked");
 }

 String flavor;
 String type;
 boolean isVegetarian;

 Noodles(String flavor, String type, boolean isVegetarian){
 System.out.println("connstructor is invoked");
 this.flavor=flavor;
 this.type=type;
 this.isVegetarian=isVegetarian;
 }

}