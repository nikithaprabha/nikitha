class BubbleGum{

  //Zero parameterized constrcutor or No args constrcutor
BubbleGum(){
System.out.println("BubbleGum constrcutor is invoked");
}

  //Parameterized constrcutor
 
 BubbleGum(String flavor , String colour , String size){
    this.flavor = flavor;
    this.colour = colour;
    this.size = size ;
 }
 
  //Instance variables

  String flavor;
  String colour;
  String size;


}

