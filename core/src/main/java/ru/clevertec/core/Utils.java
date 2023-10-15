package ru.clevertec.core;

import ru.clevertec.stringUtils.StringUtils;

public class Utils {
    public static boolean isAllPositiveNumbers(String... str) {
        boolean positiveNumber = false;
        for (String s : str){
            positiveNumber = StringUtils.isPositiveNumber(s);
            System.out.println("positiveNumber = " + positiveNumber);
        }
        return positiveNumber;
    }
}