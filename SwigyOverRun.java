class SwigyOverRun{
   public static void main(String n[]){
   double foodPrice = SwigyOver.takeOrder("Burger");
   System.out.println(foodPrice);
   double foodPriceWithQuantity = SwigyOver.takeOrder("Burger", 9); 
   System.out.println(foodPriceWithQuantity);
   
   }

}