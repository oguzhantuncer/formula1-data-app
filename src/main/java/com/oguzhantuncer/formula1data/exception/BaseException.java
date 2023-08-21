package com.oguzhantuncer.formula1data.exception;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

public class BaseException extends RuntimeException{

    private final String key;
    private final String[] args;

    protected BaseException(String key) {
        this.key = key;
        this.args = ArrayUtils.EMPTY_STRING_ARRAY;
    }

    protected BaseException(String key, String... args) {
        this.key = key;
        this.args = args;
    }


    public String getKey() {
        return key;
    }

    public String[] getArgs() {
        return args;
    }

    public String getMessage() {
        return "exception occured" + key + " " + StringUtils.join(args);
    }
}
