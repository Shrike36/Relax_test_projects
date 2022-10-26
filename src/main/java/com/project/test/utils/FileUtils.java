package com.project.test.utils;

import com.project.test.exceptions.FileException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileUtils {

    public static List<Long> readNumbersFromFile(String path) throws FileException {
        try {
            File file = new File(path);
            Scanner scanner = new Scanner(file);
            List<Long> numbers = new ArrayList<>();

            while (scanner.hasNextLong()){
                numbers.add(scanner.nextLong());
            }

            return numbers;
        } catch (Exception e) {
            throw new FileException("Incorrect file!");
        }
    }
}
