package ca.bytetube._12_exception;

public class EmptyNameException extends RuntimeException{

    public EmptyNameException() {
        super("name must not be empty!");
    }
}
