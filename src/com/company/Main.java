package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            System.out.println("Enter the filepath:");
            String filename = sc.nextLine();

            Path path = Paths.get(filename);
            File my_file  = path.toFile();

            Scanner sc = new Scanner(my_file);
            Lexer lexer = new Lexer();

            while (sc.hasNextLine())
            {
                String line = sc.nextLine();
                lexer.startState(line);
            }

            lexer.DisplayResults();
        } catch (FileNotFoundException error) {
            System.out.println("No such file");
        }
    }
}