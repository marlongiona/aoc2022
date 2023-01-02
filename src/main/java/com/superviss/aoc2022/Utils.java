package com.superviss.aoc2022;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Utils {
    public static List<String> fileLinesFromResources(String fileName) {
        var scanner = new Scanner(Utils.class.getClassLoader().getResourceAsStream(fileName));
        List<String> lines = new ArrayList<>();
        while(scanner.hasNextLine())
            lines.add(scanner.nextLine());
        return lines;
    }
}
