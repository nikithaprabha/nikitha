class PhotoFrame{

  //instance variable
  String glassType;
  String frameColor;
  String shape;
  
  PhotoFrame(){
  System.out.println("Constructor is invoked");
  }
  
  PhotoFrame(String glassType, String frameColor, String shape){
  this.glassType=glassType;
  this.frameColor=frameColor;
  this.shape=shape;
  System.out.println("Constructor is invoked");
 
 }
}