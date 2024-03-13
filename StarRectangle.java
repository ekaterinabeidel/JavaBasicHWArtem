package org.example._2024_03_11;

//Показать на экране прямоугольник размером MxN, состоящий из звёздочек.
//Затем сделать то же самое, но чтоб фигура внутри была пустая (остаётся только рамка).
public class StarRectangle {
    public static void main(String[] args) {
        int m = 5;
        int n = 8;
        int[][] rectangle = new int[m][n];
        for (int i = 0; i < rectangle.length; i++) {
            for (int j = 0; j < rectangle[i].length; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("------------------");
        for (int i = 0; i < rectangle.length; i++) {
            for (int j = 0; j < rectangle[i].length; j++) {
                if (i == 0 || i == rectangle.length - 1 || j == 0 || j == rectangle[i].length - 1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
