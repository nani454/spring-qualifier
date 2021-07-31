package com.nani454.learning.service;

import com.nani454.learning.exception.AppException;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.util.Arrays;
import java.util.List;

@Component
@Qualifier("csvFileReader")
public class CSVFileReader implements IFileReader{
    @Override
    public void readAndPrintContents(BufferedReader br) {
        try{
            String lineContent;
            int linesCount = 0;
            while ((lineContent = br.readLine()) != null) {
                List<String> lineContents = Arrays.asList(lineContent.split(","));
                lineContents.forEach( s -> {
                    System.out.print(s + "\t");
                });

                System.out.println("");

                if(linesCount ==0)
                    System.out.println("======================================================================");

                linesCount++;
            }
            System.out.println("");
            System.out.println("Total number of lines printed: "+linesCount);
        }catch (Exception e){
            throw new AppException("Exception occurred while reading and printing contents, below is the stacktrace: ", e);
        }

    }
}
