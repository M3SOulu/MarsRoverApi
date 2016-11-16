package tdd.training.session1;

public class MarsRoverException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public MarsRoverException(){
		
		super("Something gone wrong!");
	}
	
public MarsRoverException(String message){
		
		super(message);
	}

}
