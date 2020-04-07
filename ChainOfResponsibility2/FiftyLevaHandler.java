public class FiftyLevaHandler extends LevaHandler
{
 
 public void fetchLeva(long givenAmount)
 {
 long numberofNotesToBeFetched = givenAmount / 50;
 if (numberofNotesToBeFetched > 0)
 {
 if(numberofNotesToBeFetched >1)
 {
 System.out.println(numberofNotesToBeFetched + " ,Fifty Leva notes are Fetched \n");
 }
 else
 {
 System.out.println(numberofNotesToBeFetched + " ,Fifty Leva note is Fetched \n");
  
 }
 }
 
 long pendingLevaToBeProcessed = givenAmount % 50;
 
 if (pendingLevaToBeProcessed > 0)
 {
 levaHandler.fetchLeva(pendingLevaToBeProcessed);
 
 }
 
}
 
}