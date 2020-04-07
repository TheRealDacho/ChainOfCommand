public abstract class HundredLevaHandler extends LevaHandler
{
 /*
  Implementing the levafetch function which is defind in the LevaHandler
  also we implement the operations regarging the payment
  Basically if the amount needed to be payed is more than a hunder i calls this handler
  to fetch the needed amount of 100 bills, if the amount is less than a hunder will fetch nothing
  */
 public void fetchLeva(long givenAmount)
 {
 long numberofNotesToBeFetched = givenAmount / 100;
 if (numberofNotesToBeFetched > 0)
 {
 if(numberofNotesToBeFetched >1)
 {
 System.out.println(numberofNotesToBeFetched + " ,Hundred Leva notes are Fetched \n");
 }
 else
 {
 System.out.println(numberofNotesToBeFetched + " ,Hundred Leva note is Fetched \n");
  
 }
 }
 
 long pendingLevaToBeProcessed = givenAmount % 100;
 
 if (pendingLevaToBeProcessed > 0)
 {
 levaHandler.fetchLeva(pendingLevaToBeProcessed);
 
 }
 
}
 
}