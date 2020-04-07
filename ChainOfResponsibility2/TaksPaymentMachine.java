public class TaksPaymentMachine
{	
 private static HundredLevaHandler hundredLevaHandler = new HundredLevaHandler();
 private static FiftyLevaHandler   fiftyLevaHandler   = new FiftyLevaHandler();
 private static TwentyLevaHandler  twentyLevaHandler  = new TwentyLevaHandler();
 private static FiveLevaHandler    fiveLevaHandler    = new FiveLevaHandler();
 
 static
 {
 /* Constuction of the handler usuing the nextHandler method
  * Making it so it passes the requet to the next leva handler
  * if it can not perforem the task on that level
  */
 hundredLevaHandler.nextHandler(fiftyLevaHandler);
 fiftyLevaHandler.nextHandler(twentyLevaHandler);
 twentyLevaHandler.nextHandler(fiveLevaHandler);
 }
 
 public void payment( long givenAmount )
 {
 
 hundredLevaHandler.fetchLeva(givenAmount);
 }
}