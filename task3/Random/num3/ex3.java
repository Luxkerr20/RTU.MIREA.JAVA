package ru.mirea.task3.Random.num3;

import java.util.Arrays;
import java.util.Random;

public class ex3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] mas = {rand.nextInt(90) + 10,
                rand.nextInt(90) + 10,
                rand.nextInt(90) + 10,
                rand.nextInt(90) + 10};
        System.out.println(Arrays.toString(mas));
        boolean flag = true;
        for(int i = 1; i < mas.length; i++){
            if(mas[i] < mas[i - 1]){
                System.out.println("Не строго возр.");
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("Строго возр.");
        }
    }
}