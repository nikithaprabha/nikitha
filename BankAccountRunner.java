class BankAccountRunner{

   public static void main(String bank[]){
   System.out.println("main started");
   BankAccount.getbalance();
   BankAccount.credit(300.00);
   BankAccount.getbalance();
   
   BankAccount.debit(300.00);
   BankAccount.getbalance();
   
   
   
   System.out.println("main ended");
   
   }








}