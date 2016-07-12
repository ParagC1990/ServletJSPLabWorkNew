
public class BadMonth extends Exception{
	public BadMonth(String msg, Throwable cause){
		super(cause);
		System.err.println(msg);
		System.err.println(cause.getMessage());
	}

}
