package com.cafebabe.springframework.jdbc;

public class IncorrectResultSetColumnCountException extends RuntimeException{
    private final int expectedCount;

    private final int actualCount;

    public IncorrectResultSetColumnCountException(int expectedCount, int actualCount) {
        super("Incorrect column count: expected " + expectedCount + ", actual " + actualCount);
        this.expectedCount = expectedCount;
        this.actualCount = actualCount;
    }
}
