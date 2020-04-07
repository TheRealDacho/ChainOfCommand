
public abstract class LevaHandler
{
 LevaHandler levaHandler;
 
 //Function to pass the request to next handler
 public void nextHandler( LevaHandler levaHandler)
 {
 this.levaHandler= levaHandler;
 }
 // implement the LevaFetcher function
 public abstract void fetchLeva( long givenAmount );
 
}