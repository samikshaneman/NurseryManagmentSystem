package masai.com.exception;

public class OrderException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2303399853955792422L;

	public OrderException(){
		
	}
	
	public OrderException (String message) {
		super(message);
	}

}
