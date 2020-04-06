package chainofresponsibility;
//This is the first lever of the logger
public class InfoLogger extends Logger {

	   public InfoLogger(int level){
	      this.level = level;
	   }
// Level outprint
	   @Override
	   public void write(String message) {		
	      System.out.println("InfoLogger: " + message);
	   }
	}
