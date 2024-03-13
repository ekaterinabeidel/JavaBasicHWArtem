package org.example._2024_03_05;

import java.util.Scanner;

/*
№2
Реализовать программу, выводящую на экран результаты:
Сложения двух чисел
Вычитания двух чисел
Умножения двух чисел
Деления двух чисел
Каждая из арифметических операций должна быть реализована как отдельный метод.
*/

public class Calculator {
    public static void main(String[] args) {
        double number1 = getNumber();
        char operation = getOperation();
        double number2 = getNumber();
        double result = calculate(number1, operation, number2);
        System.out.println(result);
    }

    public static double getNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        /*  Для проверки, что пользователь ввел число (любого типа, включая int, double, float, и т. д.),
         *  а не строку или символ, можно использовать методы hasNextInt(), hasNextDouble(),
         *  hasNextFloat() и т. д. объекта Scanner.
         */
        if (!scanner.hasNextDouble()){
            System.out.println("Вы ввели не число.");
            System.exit(0);
        }
        return scanner.nextDouble();
    }

    public static char getOperation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите операцию");
        /* Метод matches() в Java используется для проверки, соответствует ли строка определенному
         * регулярному выражению (РВ). Он возвращает true, если строка соответствует заданному РВ, и false в противном случае.
         * Синтаксис метода matches(): boolean matches(String regex) regex: РВ, к. должна соответствовать строка.
         */
        if (!scanner.next().matches("[+\\-/*]")){
            /*[ ]: это символьный класс в регулярных выражениях.
             * Он описывает набор символов, которые могут быть найдены в строке.
             * Важно! Знак минус нужно экранировать, потому что он будет интерпритироваться как диапазон символов.
             * \\ символ экранирования
             */
            System.out.println("Вы ввели не операцию");
            System.exit(0);
        }
        return scanner.next().charAt(0);
    }

    public static double calculate(double number1, char operation, double number2) {
        switch (operation) {
            case '+':
                return number1 + number2;
            case '-':
                return number1 - number2;
            case '*':
                return number1 * number2;
            case '/':
                return division(number1, number2);
            default:
                System.out.println("Введенная операция неверна");
                System.exit(0);
                return 0;
        }
    }

    public static double division(double number1, double number2) {
        if (number2 == 0) {
            System.out.println("Деление на ноль недопустимо");
            System.exit(0);
        }
        return number1 / number2;
    }

}