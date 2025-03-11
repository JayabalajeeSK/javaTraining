package com.jb.T17_FilesAndDirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class WriteFileRunner {
    public static void main(String[] args) throws IOException {
        String path = "E:\\TMachineTraining\\javaTraining\\src\\com\\jb\\T17_FilesAndDirectories\\resources\\data.txt";  // Relative path to the file
        Path pathFileToWrite = Paths.get(path);
        Files.lines(pathFileToWrite).forEach(System.out::println);
        System.out.println();
        
        List<String> list = List.of("Apple","cat","car","gold");
        Files.write(pathFileToWrite,list).forEach(System.out::println);
    }
}
// Apple
// cat
// car
// gold

// TMachineTraining
// javaTraining
// src
// com
// jb
// T17_FilesAndDirectories
// resources
// data.txt