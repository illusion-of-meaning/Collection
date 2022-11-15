package com.asherbakov.hwRacing.exceptions;

public class MissingInQueue extends RuntimeException {
    public MissingInQueue() {
    }

    public MissingInQueue(String message) {
        super(message);
    }
}
