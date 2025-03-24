class SwigyOver{

 public static double takeOrder(String orderName){
  double foodPrice = 0.0;
  if(orderName == "Burger"){
  foodPrice = 99.00;
  return foodPrice;
  }
 
 return foodPrice;
 }
 public static double takeOrder(String orderName,int quantity){
  double foodPrice = 0.0;
 if(orderName =="Burger"){
 foodPrice = 99.00 * quantity;
 return foodPrice;
 
 }
 return foodPrice;
 }
}