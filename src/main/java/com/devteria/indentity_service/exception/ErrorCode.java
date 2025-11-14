package com.devteria.indentity_service.exception;

public enum ErrorCode {
    INVALID_KEY( 0001, "INVALID_KEY"),
    UNCATEGORIZED_EXCAPTION( 9999, "UNCATEGORIZED_EXCAPTION"),
    USER_EXISTED( 1001, "User existed"),
    USERNAME_INVALID(1003, "Username must be at least 8 characters"),
    PASSWORD_INVALID(1004, "Password must be at least 8 characters"),
    ;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    private int code;
    private String message;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
