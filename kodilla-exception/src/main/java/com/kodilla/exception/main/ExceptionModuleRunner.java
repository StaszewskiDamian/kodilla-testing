package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.io.FileReaderException;

public class ExceptionModuleRunner {

    public static void main(String args[]) {

        FileReader fileReader = new FileReader();
        try {
            fileReader.readFile();
        } catch (RuntimeException o) {
            System.out.println("Found exception: " + o);
        } catch (FileReaderException o) {
            System.out.println("Found exception: " + o);
        }
    }
}
