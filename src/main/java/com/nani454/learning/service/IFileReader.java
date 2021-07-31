package com.nani454.learning.service;

import com.nani454.learning.exception.AppException;
import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

@Component
public interface IFileReader {


    default BufferedReader loadFile(String filePath){
        try{
            File file = ResourceUtils.getFile("classpath:static/"+filePath);

            BufferedReader br = new BufferedReader(new FileReader(file));
            return br;
        }catch(Exception e){
            throw new AppException("Error occurred while reading a file, below is the stacktrace: ", e);
        }
    }

    default void loadReadPrintContents(String filePath){
        readAndPrintContents(loadFile(filePath));
    }

    public void readAndPrintContents(BufferedReader br);

}
