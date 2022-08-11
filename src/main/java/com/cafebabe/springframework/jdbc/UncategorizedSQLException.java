package com.cafebabe.springframework.jdbc;

public class UncategorizedSQLException extends RuntimeException{
    public UncategorizedSQLException(String message) {
        super(message);
    }

    public UncategorizedSQLException(String task,String sql, Throwable cause) {
        super(sql, cause);
    }
}
