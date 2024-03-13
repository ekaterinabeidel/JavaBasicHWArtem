package org.example._2024_03_07;
/*1. В три переменные a, b и c явно записаны программистом три целых попарно неравных между собой числа.
Создать программу, которая переставит числа в переменных таким образом,
чтобы при выводе на экран последовательность a, b и c оказалась строго возрастающей.*/
public class IncreasingSequence {
    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        int c = 1;
        int first;
        int second;
        int third;

        if (a < b && a < c && b < c) {
            first = a;
            second = b;
            third = c;
            System.out.println(first+" "+second +" "+third);
        }
        if (a < b && a < c && c < b) {
            first = a;
            second = c;
            third = b;
            System.out.println(first+" "+second +" "+third);
        }
        if (b < a && b < c && c < a) {
            first = b;
            second = c;
            third = a;
            System.out.println(first+" "+second +" "+third);
        }
        if (b < a && b < c && a < c) {
            first = b;
            second = a;
            third = c;
            System.out.println(first+" "+second +" "+third);
        }
        if (c < a && c < b && a < b) {
            first = c;
            second = a;
            third = b;
            System.out.println(first+" "+second +" "+third);
        }
        if (c < a && c < b && b < a) {
            first = c;
            second = b;
            third = a;
            System.out.println(first+" "+second +" "+third);
        }
    }
}

