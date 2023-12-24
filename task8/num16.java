package ru.mirea.task8;

import java.util.Scanner;

public class num16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxNumber = 0;
        int count = 0;

        while (true) {
            int number = scanner.nextInt();
            if (number == 0) {
                break; // Прерываем цикл при вводе нуля
            }

            if (number > maxNumber) {
                maxNumber = number;
                count = 1;
            } else if (number == maxNumber) {
                count++;
            }
        }

        System.out.println("Количество элементов, равных наибольшему элементу: " + count);
    }
}