class HospitalRunner{

public static void main(String service[]){
    Hospital site1= new Hospital();
    site1.id="35SP21";
    site1.name="spark";
    site1.type=" specialty hospital";
    site1.appoinment="tommorow 10:00Am";
    site1.labAndTesting="intergrated"; 
	
    System.out.println(" patient id "+site1.id);
    System.out.println("patient  Name "+site1.name);
    System.out.println("patient type "+site1.type);
    System.out.println("patient appoinment "+site1.appoinment);
    System.out.println("patient labAndTesting "+site1.labAndTesting);

   Hospital site2= new Hospital();
    site2.id = "58SG90";
    site2.name="sapthagiri ";
    site2.type=" specialty hospital";
    site2.appoinment="today 11:00Am";
    site2.labAndTesting="intergrated"; 
	
    System.out.println(" patient id "+site2.id);
    System.out.println("patient  Name "+site2.name);
    System.out.println("patient type "+site2.type);
    System.out.println("patient appoinment "+site2.appoinment);
    System.out.println("patient labAndTesting "+site2.labAndTesting);





}
}