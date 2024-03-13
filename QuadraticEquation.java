package org.example._2024_03_07;

import java.util.Scanner;

import static java.lang.Math.sqrt;


/*В три переменные a, b и c записаны три вещественных числа.
Создать программу, которая будет находить и выводить на экран
вещественные корни квадратного уравнения ax²+bx+c=0,
либо сообщать, что корней нет.*/
public class QuadraticEquation {
    public static void main(String[] args) {
        System.out.println("В десятичных числах в качестве отделения целой части от дробной \n" +
                "используется запятая, а не точка");
        System.out.println("Введите a (коэффициент при x²)");
        double a = getNumber();
        System.out.println("Введите b (коэффициент при x)");
        double b = getNumber();
        System.out.println("Введите c");
        double c = getNumber();
        solveQuadraticEquation(a, b, c);

    }
    public static double getNumber() {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextDouble()) {
            System.out.println("Вы ввели не число.");
            System.exit(0);
        }
        return scanner.nextDouble();
    }
    public static void solveQuadraticEquation(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            double result1 = (-b + sqrt(discriminant)) / (2 * a);
            double result2 = (-b - sqrt(discriminant)) / (2 * a);
            System.out.println("Квадратное уравнение имеет два решения: " + result1 + " и " + result2);
        }
        if (discriminant == 0) {
            double result = (-b) / (2 * a);
            System.out.println("Квадратное уравнение имеет единственное решение: " + result);
        }
        if (discriminant < 0) {
            System.out.println("Квадратное уравнение не имеет решений");
        }
    }
}
