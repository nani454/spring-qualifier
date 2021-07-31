package com.nani454.learning.main;

import com.nani454.learning.service.IFileReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AppMain {
    @Autowired
    IFileReader txtReader;

    @Autowired
    @Qualifier("csvFileReader")
    IFileReader csvReader;

    String txtFilePath = "TextFile.txt";
    String csvFilePath = "CSVFile.csv";

    public void runSimulation(){
        System.out.println("Printing contents of text file");
        System.out.println("======================================================================");
        txtReader.loadReadPrintContents(txtFilePath);
        System.out.println("======================================================================");

        System.out.println("Printing contents of CSV file");
        System.out.println("======================================================================");
        csvReader.readAndPrintContents(csvReader.loadFile(csvFilePath));
        System.out.println("======================================================================");
    }
}
