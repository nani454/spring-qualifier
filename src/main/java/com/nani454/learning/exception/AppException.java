package com.nani454.learning.exception;

public class AppException extends RuntimeException{
    public AppException(String msg, Exception e){
        super(e.getMessage());
        System.out.println(msg);
        System.out.println(e.getCause());
        e.printStackTrace();
    }
}
