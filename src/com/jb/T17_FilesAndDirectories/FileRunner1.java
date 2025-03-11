package com.jb.T17_FilesAndDirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileRunner1 {
    public static void main(String[] args) {
        String path = "E:\\TMachineTraining\\javaTraining\\src\\com\\jb\\T17_FilesAndDirectories\\resources\\data.txt";  // Relative path to the file

        try {
            Path pathFileToRead = Paths.get(path);

            // Print the absolute path for debugging
            System.out.println("Reading from: " + pathFileToRead.toAbsolutePath());

            // Check if file exists
            if (Files.exists(pathFileToRead)) {
                System.out.println("File found! Printing content:\n");
                Files.lines(pathFileToRead).forEach(System.out::println);
System.out.println();
                Files.lines(pathFileToRead).map(String::toUpperCase).forEach(System.out::println);
System.out.println();
                Files.lines(pathFileToRead).filter(str -> str.contains("33")).forEach(System.out::println);
            } else {
                System.err.println("Error: File not found at " + pathFileToRead.toAbsolutePath());
            }

        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
// Reading from: E:\TMachineTraining\javaTraining\src\com\jb\T17_FilesAndDirectories\resources\data.txt
// File found! Printing content:

// 220282601033
// jayabalajee s k
// jaya
// bala

// 220282601033
// JAYABALAJEE S K
// JAYA
// BALA

// 220282601033