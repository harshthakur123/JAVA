package Custom_Exceptions;

public class InvalidInputException extends Exception{
	public InvalidInputException(String errorMsg) {
		super(errorMsg);
	}
}
