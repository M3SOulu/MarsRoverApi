package tdd.training.session1;

public class MarsRoverException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public MarsRoverException(Exception e){
		System.err.println(e.getMessage());
	}
}
