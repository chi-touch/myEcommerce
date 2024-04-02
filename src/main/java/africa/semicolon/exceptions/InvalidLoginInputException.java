package africa.semicolon.exceptions;

public class InvalidLoginInputException extends RuntimeException{
    public InvalidLoginInputException(String message) {
        super(message);
    }
}
