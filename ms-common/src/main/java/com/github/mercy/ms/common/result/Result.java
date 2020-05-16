package com.github.mercy.ms.common.result;

import lombok.Data;

import java.io.Serializable;

/**
 * Result
 *
 * @author hkc
 * @version 1.0
 * @date 2020-05-16 13:42
 */
@Data
public class Result<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    private int code;

    private String msg;

    private T data;

    public Result() {
        this.code = ErrorType.SUCCESS.getCode();
        this.msg = ErrorType.SUCCESS.getMessage();
    }

    public Result(T data) {
        this();
        this.data = data;
    }

    public Result(ErrorMessage errorMessage) {
        this.code = errorMessage.getCode();
        this.msg = errorMessage.getMessage();
    }

    public static <T> Result<T> ok() {
        return new Result<>();
    }

    public static <T> Result<T> ok(T data) {
        return new Result<>(data);
    }

    public static <T> Result<T> fail(ErrorMessage errorMessage) {
        return new Result<>(errorMessage);
    }
}
