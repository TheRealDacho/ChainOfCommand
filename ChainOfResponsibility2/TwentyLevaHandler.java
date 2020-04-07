public class TwentyLevaHandler extends LevaHandler
{
 
 public void fetchLeva(long givenAmount)
 {
 long numberofNotesToBeFetched = givenAmount / 20;
 if (numberofNotesToBeFetched > 0)
 {
 if(numberofNotesToBeFetched >1)
 {
 System.out.println(numberofNotesToBeFetched + " ,Twenty Leva notes are Fetched \n");
 }
 else
 {
 System.out.println(numberofNotesToBeFetched + " ,Twenty Leva note is Fetched \n");
  
 }
 }
 
 long pendingLevaToBeProcessed = givenAmount % 20;
 
 if (pendingLevaToBeProcessed > 0)
 {
 levaHandler.fetchLeva(pendingLevaToBeProcessed);
 
 }
 
 }
 
}