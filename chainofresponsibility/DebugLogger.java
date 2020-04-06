package chainofresponsibility;
//This is the second lever of the logger
public class DebugLogger extends Logger {

   public DebugLogger(int level){
      this.level = level;
   }
// Level outprint
   @Override
   public void write(String message) {		
      System.out.println("ConsoleLogger: " + message);
   }
}