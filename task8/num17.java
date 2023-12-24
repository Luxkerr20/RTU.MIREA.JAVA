package ru.mirea.task8;

import java.util.Scanner;

public class num17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxNumber = 0;

        while (true) {
            int number = scanner.nextInt();
            if (number == 0) {
                break; // Прерываем цикл при вводе нуля
            }

            if (number > maxNumber) {
                maxNumber = number;
            }
        }

        System.out.println("Наибольшее значение в последовательности: " + maxNumber);
    }
}