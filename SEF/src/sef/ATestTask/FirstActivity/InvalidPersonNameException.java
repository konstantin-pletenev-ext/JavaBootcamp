package sef.ATestTask.FirstActivity;

public class InvalidPersonNameException extends Exception {

    @Override
    public String getMessage() {
        return "invalid name";
    }
}
