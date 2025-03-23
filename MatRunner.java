class MatRunner{

 public static void main(String material[]){
 
 
  //copy1
 Mat mt1 = new Mat();
 mt1.pattern="dot";
 mt1.color="orange";
 mt1.clothType="jute";
 mt1.isWashable=false;
 System.out.println("pattern :"+mt1.pattern);
 System.out.println("color :"+mt1.color);
 System.out.println("Material :"+mt1.clothType);
 System.out.println("Mat washable  :"+mt1.isWashable);
 
 //copy2
 Mat mt2 = new Mat();
 mt2.pattern="plain";
 mt2.color="yellow";
 mt2.clothType="cotton";
 mt2.isWashable=true;
 System.out.println("pattern :"+mt2.pattern);
 System.out.println("color  :"+mt2.color);
 System.out.println("Material :"+mt2.clothType);
 System.out.println("Mat Washable :"+mt2.isWashable);
 
 //copy3
 Mat mt3 = new Mat();
 mt3.pattern="striped";
 mt3.color="grey";
 mt3.clothType="polyster";
 mt3.isWashable=true;
 System.out.println("pattern :"+mt3.pattern);
 System.out.println("color  :"+mt3.color);
 System.out.println("Material :"+mt3.clothType);
 System.out.println("Mat Washable :"+mt3.isWashable);
 
 //copy4
 Mat mt4 = new Mat();
 mt4.pattern="folaral";
 mt4.color="blue";
 mt4.clothType="silk";
 mt4.isWashable=false;
 System.out.println("pattern :"+mt4.pattern);
 System.out.println("color  :"+mt4.color);
 System.out.println("Material :"+mt4.clothType);
 System.out.println("Mat Washable :"+mt4.isWashable);
 
 //copy5
 Mat mt5 = new Mat();
 mt5.pattern="embroiedy";
 mt5.color="marron";
 mt5.clothType="syntatic";
 mt5.isWashable=false;
 System.out.println("pattern :"+mt5.pattern);
 System.out.println("color  :"+mt5.color);
 System.out.println("Material :"+mt5.clothType);
 System.out.println("Mat Washable :"+mt5.isWashable);
 
     //copy 6
     Mat mt6 = new Mat("painted",  "brown", "jute", true);
     System.out.println("pattern :"+mt6.pattern);
     System.out.println("color  :"+mt6.color);
     System.out.println("Material :"+mt6.clothType);
	 System.out.println("Mat Washable :"+mt6.isWashable);
 
     //copy 7
     Mat mt7 = new Mat("gomertic", "green", "wool", true);
     System.out.println("pattern :"+mt7.pattern);
     System.out.println("color  :"+mt7.color);
	 System.out.println("Material :"+mt7.clothType);
     System.out.println("Mat Washable :"+mt7.isWashable);
 
 
 }
}