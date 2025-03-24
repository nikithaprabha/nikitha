class Dmart{
  //fruits, groceries, snacks, beverages, stationaries, dairy Products, Vegetables, clothes, Toy 
// variables and dat type 
public static void main(String market[]){
//array

String []fruits = { "orange" ,"grapes" ,"kiwi" ,"avacado" };
String groceries[] = { "salt" ,"sugar" ,"chilli powder" ,"mustard seed" ,"coriendar powder" ,"garm masala" ,"oil" ,"cloves" ,"cadaman" ,"frengrik" };
String snacks[] = { "chocolate" ,"little hearts", "lays" ,"bingo" ,"trianges" ,"mari gold biscuit" ,"hide and sike" ,"good day" };
String dairyProducts[] = { "paneer" ,"milk" ,"milk peda" ,"cheese" ,"butter" ,"ghee" ,"ice cream", };




System.out.println(" Total no of Fruits added "+ fruits.length);
System.out.println("list of fruits avaiable are :");

//looping Structure
//for, while, do while
//for each(used everywhere) ,while, do while
System.out.println( fruits[0]+ " "+ fruits[1]+ " "+ fruits[2]+ " "+ fruits[3]);



 System.out.println(" Total no of groceries added "+ groceries.length);
 System.out.println("List of groceries avaiable are :");
 System.out.println(groceries[0]+ " "+ groceries[1]+ " "+ groceries[2]+ " "+ groceries[3]+ " "+ groceries[4]+ " "+ groceries[5]+ " "+ groceries[6]+ " "+ groceries[7]+ " "+ groceries[8]+ " "+ groceries[9]);




System.out.println("Total no of dairtProducts " +dairyProducts.length);
System.out.println("List of dairy Products avaiable are: ");
System.out.println(dairyProducts[0]+ " "+ dairyProducts[1]+ " "+ dairyProducts[2]+ " "+ dairyProducts[3]+ " "+ dairyProducts[4]+ " "+ dairyProducts[5]+ " "+ dairyProducts[6]);
}}