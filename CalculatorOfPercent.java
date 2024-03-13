package org.example._2024_03_11;

import java.util.Random;

/*Загадать случайно 100 целых чисел в диапазоне от -100 до 100.
Вычислить процент положительных чисел, процент отрицательных чисел и
процент нулей. Вычислить процент чётных чисел и процент нечётных.*/
public class CalculatorOfPercent {
    public static void main(String[] args) {

        int max = 100;
        int min = -100;
        int positiv = 0;
        int negativ = 0;
        int zero = 0;
        int all = 0;
        int even = 0;
        int odd = 0;
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
           int randomNumber = min + (int) (Math.random() * (max - min) + 1);
           all++;
            System.out.print(randomNumber +"\t");
            if (randomNumber > 0) {
                positiv++;
            } else if (randomNumber == 0) {
                zero++;
            } else {
                negativ++;
            }
            if (randomNumber % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println();
        System.out.println("positiv " +positiv);
        System.out.println("zero " +zero);
        System.out.println("negativ "+negativ);
        System.out.println("all "+all);
        System.out.println("even " +even);
        System.out.println("odd " +odd);

        double percentOfPositive = (double)100*positiv/all;
        double percentOfNegative = (double)100*negativ/all;
        double percentOfNulls = (double)100*zero/all;
        double percentOfEven = (double)100*even/all;
        double percentOfOdd = (double)100*odd/all;

        System.out.printf("Процент положительных чисел:  %.2f%n", percentOfPositive);
        System.out.printf("Процент отрицательных чисел:  %.2f%n", percentOfNegative);
        System.out.printf("Процент нулей:  %.2f%n", percentOfNulls);
        System.out.printf("Процент четных чисел:  %.2f%n", percentOfEven);
        System.out.printf("Процент нечетных чисел:  %.2f%n", percentOfOdd);
    }
}