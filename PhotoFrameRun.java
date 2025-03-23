class PhotoFrameRun{

 public static void main(String showPiece[]){
 
     //instantiated 1
     PhotoFrame frame1= new PhotoFrame();
     frame1.glassType = "fiber";
	 frame1.frameColor = "black";
     frame1.shape = "square";
	 
	 System.out.println("glassType :"+frame1.glassType);
     System.out.println("frameColor :"+frame1.frameColor);
     System.out.println("shape :"+frame1.shape);
     
     //instantiated 2
     PhotoFrame frame2 = new PhotoFrame();
     frame2.glassType = "Tempered glass";
	 frame2.frameColor = "silver";
     frame2.shape = "pentagon";
	 
	 System.out.println("glassType :"+frame2.glassType);
     System.out.println("frameColor :"+frame2.frameColor);
     System.out.println("shape :"+frame2.shape);
     
      //instantiated 3
     PhotoFrame frame3 = new PhotoFrame();
     frame3.glassType = "acrylic";
	 frame3.frameColor = "Tan";
     frame3.shape = "round";
	 
	 System.out.println("glassType :"+frame3.glassType);
     System.out.println("frameColor :"+frame3.frameColor);
     System.out.println("shape :"+frame3.shape);
 
     //instantiated 4
     PhotoFrame frame4 = new PhotoFrame();
     frame4.glassType = "fiber type";
	 frame4.frameColor = "sea green";
     frame4.shape = "hexagon";
	 
	 System.out.println("glassType :"+frame4.glassType);
     System.out.println("frameColor :"+frame4.frameColor);
     System.out.println("shape :"+frame4.shape);
 
 //Parameterized
     //instantiated 5
     PhotoFrame frame5 = new PhotoFrame("palastic", "white", "oval");
     System.out.println("glassType :"+frame5.glassType);
     System.out.println("frameColor :"+frame5.frameColor);
     System.out.println("shape :"+frame5.shape);
 
      //instantiated 6
     PhotoFrame frame6 = new PhotoFrame("plexiglass", "blue", "rectangle");
     System.out.println("glassType :"+frame6.glassType);
     System.out.println("frameColor :"+frame6.frameColor);
     System.out.println("shape :"+frame6.shape);
 
     
      //instantiated 7
     PhotoFrame frame7 = new PhotoFrame("resin glass", "ivory", "half moon");
     System.out.println("glassType :"+frame7.glassType);
     System.out.println("frameColor :"+frame7.frameColor);
     System.out.println("shape :"+frame7.shape);

 
 }
}
