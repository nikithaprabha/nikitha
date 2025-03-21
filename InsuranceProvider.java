class InsuranceProvider {

   public static double search(String insuranceName){
       
	   double termprice = 0.0;
	   if(insuranceName == "ICIC Prudential life insurance"){
	       termprice =8967.00;
	   }
       else if("LIC" == insuranceName){
           termprice = 800.00;
		}
		
       else if("Bajaj Allianz Life Insurance" == insuranceName){
           termprice = 5755.09;
		}
       else if("HDFC Life Insurance" == insuranceName){
	    termprice = 9784.99;
	   }
       else if("Max Life Insurance" == insuranceName){
	    termprice = 654.96;
	   }
        else if("Muthood finance" == insuranceName){
	    termprice = 9658.93;
	   }
	   else if("SBI Life Insurance" == insuranceName){
	    termprice = 95229.55;
	   }
       else if("Tata AIA Life Insurance Company Limited" == insuranceName){
	    termprice = 26554.55;
	   }
	    else if("Life Insurance Corporation Of India" == insuranceName){
	    termprice = 1358.85;
	   }
	   else if("Bharti AXA Life Insurance" == insuranceName){
	   termprice = 5323.98;
	   }
	   else{
		   System.out.println(insuranceName + "not valid");
	   }
	   return termprice;
 }
}