/**
 * 
 * This class occurs when a Notation format is incorrect
 * @author Sokha Heng
 */
public class InvalidNotationFormatException extends Exception {
	
	public InvalidNotationFormatException(String message) {
		super(message);
	}
	
	public InvalidNotationFormatException() {
		super("The format is incorrect");
	}
}
