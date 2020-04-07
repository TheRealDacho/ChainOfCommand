public class ChainOfResponsibility
{
 /* Here we are letting the machine know what 
  amount of money we give is so it know how much and what handler to use
  */
 public static void main( String[] args )
 {
	 TaksPaymentMachine TaksPaymentMachine = new TaksPaymentMachine();
  //This is to print out the amount so it's visible in the console
 System.out.println("\n ----------------Paid Amount 525-----------------------\n");
  
 TaksPaymentMachine.payment(525);
  
 System.out.println("\n ----------------Paid Amount 305-----------------------\n");
  
 TaksPaymentMachine.payment(305);
 }
 
}