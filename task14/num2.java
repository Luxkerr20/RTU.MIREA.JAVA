package ru.mirea.task14;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class num2 {
    public static void main(String[] args) {
        String input = "bvrwjgnbtjvbjvbfkj33447567it24gfy";
        String regex = "^bvrwjgnbtjvbjvbfkj33447567it24gfy$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        boolean isMatch = matcher.matches();
        if (isMatch) {
            System.out.println("Верно, строка соответствует паттерну.");
        } else {
            System.out.println("Неверно, строка не соответствует паттерну.");
        }
    }
}