package com.oguzhantuncer.formula1data.exception;

public class DomainNotFoundException extends BaseException{
    public DomainNotFoundException (String key) {super(key);}
    public DomainNotFoundException (String key, String... args) {super(key, args);}
}
