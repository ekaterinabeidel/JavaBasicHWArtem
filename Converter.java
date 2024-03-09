package org.example._2024_03_04;

import java.util.Scanner;

public class Converter {
    /*Задание 2
Создайте класс Converter - конвертер системы счисления.
У пользователя спрашивается число системы счисления, (используйте Scanner)
Запрашивается само число (ожидается корректный ввод)
У пользователя спрашивается число системы счисления в какую перевести
Конвертация должна быть с помощью класса обертки Long.*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Примечание: только если поместить ввод String numberToConvert в самое начало,
        //не появляется Exception in thread "main" java.lang.NumberFormatException: For input string: ""
        System.out.println("Введите число, которое хотите перевести");
        String numberToConvert = scanner.nextLine();

        System.out.println("Введите основание исходной системы счисления");
        int inputNumberSystem = scanner.nextInt();

        System.out.println("Введите основание конечной системы счисления");
        int outNumbersSystem = scanner.nextInt();
        
        if (isValidNumber(numberToConvert, inputNumberSystem) && isValidNumber(numberToConvert, inputNumberSystem)) {
            String result = convert(inputNumberSystem, numberToConvert, outNumbersSystem);
            System.out.println("Результат:" +result);
        } else {
            System.out.println("Введено некорректное значение.");
        }
    }
    public static boolean isValidNumber (String numberToConvert, int NumberSystem) {
        /* Проверка введенных чисел (метод)
         * Критерии: проверка чисел на существание в заданной системе счисления (СС),
         * проверка существания выбранной СС,
         * валидация ввода.
         */

        // digit - цифра
    for (int i = 0; i < numberToConvert.length(); i++) {
        // цикл for используем для проверки того, что все символы числа являются допустимыми для данной СС.
        // number.length() для получения длины строки, что позволит пройти по каждому символу числа

        char digit = numberToConvert.charAt(i);
        // внутри цикла for используется метод charAt(i) для получения символа на каждой позиции i в строке введенного номера.

        if (Character.digit(digit, NumberSystem) == -1) {
            // для каждого символа метод Character.digit (char, int) используется для определения числового значения символа
            // в указаанной СС. Если символ не является доступной цифрой, то метод возвращает -1.
            return false;
        }
    }
    return true;
    }
    public static String convert (int inputNumberSystem, String numberToConvert, int outNumbersSystem) {
        long convertedNumber = Long.parseLong(numberToConvert, inputNumberSystem);
        // Класс Long - оболочка для примитивного типа данных long, к. позволяет применять методы,
        // а так же контейнер, к. хранит примитивное значение long как объект.
        // Метод parseLong является статическим методом класса Long.
        // Принимает два аргумента: строка, к. необходимо преобразовать в число типа long
        // и система счисления строки типа int.
        return Long.toString(convertedNumber, outNumbersSystem);
        // Метод Long.toString() используется для конвертации значения типа long в строку в указанной СС.
    }
}
