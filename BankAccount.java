class BankAccount{

  //balance is also called field,property,data member
  static double balance=200.00;
  
  //behaviour,purpose,functionality
  
  public static void credit(double amount){
   System.out.println("credit started");
   if(amount > 0.0)
     balance = balance+amount;
   else
      System.out.println("invalid amt");
      System.out.println("credit ended");
  
  }

 public static void debit(double amount){
 
 System.out.println("debit started");
 if(amount<= balance)
    balance = balance-amount;
 else
    System.out.println("insufficient balance");
	System.out.println("debit ended");
 
 }
    public static void getbalance(){
	System.out.println("balance is : "+balance);
	
	
	}

}