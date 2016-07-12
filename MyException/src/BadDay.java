
public class BadDay extends Exception {
	public BadDay(String msg,Throwable cause){
		super(cause);
		System.err.println(msg);
		
		System.err.println(cause.getMessage());
	}

	
}
