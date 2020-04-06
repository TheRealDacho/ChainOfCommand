package chainofresponsibility;

public abstract class Logger {
	// The 3 levels of the logger chain
	   public static int INFO = 1;
	   public static int DEBUG = 2;
	   public static int ERROR = 3;

	   public int level;

	   /*
	    Here we make the actual chain of responsibility
	    Basically we make it so if one of level of the logger can't process info
	    To passes the request on to the next level
	    */
	   public Logger nextLogger;

	   public void setNextLogger(Logger nextLogger){
	      this.nextLogger = nextLogger;
	   }

	   public void logMessage(int level, String message){
	      if(this.level <= level){
	         write(message);
	      }
	      if(nextLogger !=null){
	         nextLogger.logMessage(level, message);
	      }
	   }

	   abstract protected void write(String message);
}
