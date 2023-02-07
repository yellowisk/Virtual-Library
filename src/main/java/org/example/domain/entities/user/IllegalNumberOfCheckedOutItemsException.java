package org.example.domain.entities.user;

public class IllegalNumberOfCheckedOutItemsException extends RuntimeException {
    public IllegalNumberOfCheckedOutItemsException(String message) {
        super(message);
    }
}
