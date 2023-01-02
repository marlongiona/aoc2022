package com.superviss.aoc2022.d01;

import com.superviss.aoc2022.Utils;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Day01 {
    private static final String CALORIES_FILENAME = "d01_calories";
    public static void main(String[] args) {
        List<Integer> calories = new ArrayList<>();

        int currentTotal = 0;
        for (String currentLine : Utils.fileLinesFromResources(CALORIES_FILENAME)) {
            if(StringUtils.isEmpty(currentLine)) {
                calories.add(currentTotal);
                currentTotal = 0;
            } else {
                currentTotal += Integer.parseInt(currentLine);
            }
        }

        Collections.sort(calories);

        System.out.println("Top 1 => " + calories.get(calories.size() - 1));
        System.out.println("Top 3 => " + (calories.get(calories.size() - 1) + calories.get(calories.size() - 2) + calories.get(calories.size() - 3)));
    }
}
