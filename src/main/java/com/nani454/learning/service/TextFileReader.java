package com.nani454.learning.service;

import com.nani454.learning.exception.AppException;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;

@Component
@Primary
public class TextFileReader implements IFileReader{
    @Override
    public void readAndPrintContents(BufferedReader br) {
        try{
        String st;
        while ((st = br.readLine()) != null)
            System.out.println(st);
    }catch (Exception e){
            throw new AppException("Exception occurred while reading and printing contents, below is the stacktrace: ", e);
        }

    }
}
