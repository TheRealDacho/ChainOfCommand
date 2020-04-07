public class FiveLevaHandler extends LevaHandler
{
 
 public void fetchLeva(long givenAmount)
 {
 long numberofNotesToBeFetched = givenAmount / 5;
 if (numberofNotesToBeFetched > 0)
 {
 if(numberofNotesToBeFetched >1)
 {
 System.out.println(numberofNotesToBeFetched + " ,Five Leva notes are Fetched \n");
 }
 else
 {
 System.out.println(numberofNotesToBeFetched + " ,Five Leva note is Fetched \n");
  
 }
 }
 
 long pendingLevaToBeProcessed = givenAmount % 5;
 
 if (pendingLevaToBeProcessed > 0)
 {
 levaHandler.fetchLeva(pendingLevaToBeProcessed);
 
 }
 
 }
 
}