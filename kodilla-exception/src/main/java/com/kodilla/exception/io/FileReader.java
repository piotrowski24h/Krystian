package com.kodilla.exception.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReader {


    public void readFile(String fileName) {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("names.txt").getFile());

        Path path = Paths.get("tego-pliku-nie-ma.txt");

try{
    Stream<String> fileLines = Files.lines(path);
    fileLines.forEach(System.out::println);
} catch(IOException e) {
    System.out.println("Błąd odczytu pliku" +e);
} finally {
    System.out.println("I am gonna be here... always!");

}
    }
}
