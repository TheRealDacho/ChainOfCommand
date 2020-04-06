package chainofresponsibility;

public class ChainPattern {

	private static Logger getLoggers(){

		Logger errorLogger = new ErrorLogger(Logger.ERROR);
		Logger infoLogger = new InfoLogger(Logger.DEBUG);
		Logger debugLogger = new DebugLogger(Logger.INFO);

	      errorLogger.setNextLogger(infoLogger);
	      infoLogger.setNextLogger(debugLogger);

	      return errorLogger;	
	   }
// The message each level will show
	   public static void main(String[] args) {
		   Logger loggerChain = getLoggers();

	      loggerChain.logMessage(Logger.INFO, 
	         "The info level of the logger");

	      loggerChain.logMessage(Logger.DEBUG, 
	         "The debug level of the logger");

	      loggerChain.logMessage(Logger.ERROR, 
	         "The error level of the logger");
	   }
}
