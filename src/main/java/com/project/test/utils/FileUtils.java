package com.project.test.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileUtils {

    public static List<Long> readNumbersFromFile(String path) throws Exception{

        File file = new File(path);
        Scanner scanner = new Scanner(file);

        List<Long> numbers = new ArrayList<>();

        while (scanner.hasNextLong()){
            //String s = scanner.next();
            //System.out.println(s);
            numbers.add(scanner.nextLong());
        }

        return numbers;
    }

}
