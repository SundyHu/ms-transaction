package com.github.mercy.ms.common.result;

/**
 * ErrorType
 *
 * @author hkc
 * @version 1.0
 * @date 2020-05-16 13:40
 */
public enum ErrorType implements ErrorMessage {

    SUCCESS(1,"success"),FAILURE(0,"failure"),SERVICE_FALLBACK(-11000,"service fallback"),SYSTEM_BUSY(-10002,"system busy"),SYSTEM_EXCEPTION(-10003,"system exception") ;

    private int code ;

    private String message ;

    ErrorType(int code,String message){
        this.code = code ;
        this.message = message ;
    }

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
