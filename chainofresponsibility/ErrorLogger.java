package chainofresponsibility;
//This is the third lever of the logger
public class ErrorLogger extends Logger {

   public ErrorLogger(int level){
      this.level = level;
   }
// Level outprint
   @Override
   public void write(String message) {		
      System.out.println("ErrorLogger: " + message);
   }
}