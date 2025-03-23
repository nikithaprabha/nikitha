class shampooRun{
 public static void main(String hairWash[]){
 
 //copy1
 Shampoo so1 = new Shampoo();
 so1.brand="Dove";
 so1.volume=400;
 so1.isConditionerAvailable=false;
 System.out.println("Brand :"+so1.brand);
 System.out.println("volume in ml is :"+so1.volume);
 System.out.println("Conditioner Available :"+so1.isConditionerAvailable);
 
 //copy2
 Shampoo so2 = new Shampoo();
 so2.brand="clinic pluse";
 so2.volume=180;
 so2.isConditionerAvailable=true;
 System.out.println("Brand :"+so2.brand);
 System.out.println("volume in ml is :"+so2.volume);
 System.out.println("Conditioner Available :"+so2.isConditionerAvailable);
 
 //copy3
 Shampoo so3 = new Shampoo();
 so3.brand="meera";
 so3.volume=180;
 so3.isConditionerAvailable=true;
 System.out.println("Brand :"+so3.brand);
 System.out.println("volume in ml is :"+so3.volume);
 System.out.println("Conditioner Available :"+so3.isConditionerAvailable);
 
 //copy4
 Shampoo so4 = new Shampoo();
 so4.brand="tresme";
 so4.volume=200;
 so4.isConditionerAvailable=false;
 System.out.println("Brand :"+so4.brand);
 System.out.println("volume in ml is :"+so4.volume);
 System.out.println("Conditioner Available :"+so4.isConditionerAvailable);
 
 //copy5
 Shampoo so5 = new Shampoo();
 so5.brand="panteene";
 so5.volume=500;
 so5.isConditionerAvailable=false;
 System.out.println("Brand :"+so5.brand);
 System.out.println("volume in ml is :"+so5.volume);
 System.out.println("Conditioner Available :"+so5.isConditionerAvailable);
 
     //copy 6
     Shampoo so6 = new Shampoo("matrix", 800, true);
     System.out.println("Brand :"+so6.brand);
     System.out.println("volume in ml is :"+so6.volume);
     System.out.println("Conditioner Available :"+so6.isConditionerAvailable);
 
     //copy 7
     Shampoo so7 = new Shampoo("l'oreal paris", 500, true);
     System.out.println("Brand :"+so7.brand);
     System.out.println("volume in ml is :"+so7.volume);
     System.out.println("Conditioner Available :"+so7.isConditionerAvailable);
 
    
 }
}