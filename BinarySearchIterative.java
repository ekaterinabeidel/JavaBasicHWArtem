package org.example._2024_03_13;
//Реализовать бинарный поиск с помощью итеративного подхода(через циклы)

import java.util.Arrays;
import java.util.Random;

/*Итерационный бинарный поиск:
В итерационной реализации используется цикл (обычно while или for) для управления процессом поиска.
Необходимо найти середину массива и сравнивнить значение в середине с целевым значением.
В зависимости от результата сравнения  диапазон поиска сужается, начальный и конечный индексы обновляюся.
Процесс продолжается до тех пор, пока не будет найден элемент или диапазон поиска станет пустым.*/
public class BinarySearchIterative {
    public static void main(String[] args) {
        Random rand = new Random();
        int arrLen = 10; //array.length
        int findEl = 0; //элемент массива, к. нужно найти
        int[] array = new int[arrLen];
        for (int i = 0; i < arrLen; i++) {
            array[i] = rand.nextInt(21) - 10;
        }

        System.out.println("Искомое число: " + findEl);
        System.out.println("Исходный массив: "+Arrays.toString(array));
        Arrays.sort(array); //Если важно сохранить исходный массив, то сортировать в копии
        System.out.println("Отсортированный массив: " +Arrays.toString(array));
        System.out.println("Индекс искомого числа: " +searchBinaryIterative(array, findEl));
    }
    public static int searchBinaryIterative (int [] array, int findEl) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == findEl) {
                return mid;
            } else if (array[mid] < findEl) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
