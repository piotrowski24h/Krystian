package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReaderWithoutHandling;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;

public class ExceptionModuleRunner {

public static void main(String[] args) throws IOException {
    FileReaderWithoutHandling fileReader = new FileReaderWithoutHandling();
    fileReader.readFile();

    try{
        fileReader.readFile();
        } catch (FileAlreadyExistsException e) {
        System.out.println("Problem while reading a file!");
    } catch (IOException e) {
        e.printStackTrace();
    }

}
}
