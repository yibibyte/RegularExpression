package ru.regexp.pro;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String text = "Иванов Петров Сидоров";
        String pattern = "\\b[А-Я][а-я]+ов\\b"; // Регулярное выражение для поиска фамилий, оканчивающихся на "ов"

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);

        while (m.find()) {
            System.out.println("Найдено совпадение: " + m.group());
        }
    }
}