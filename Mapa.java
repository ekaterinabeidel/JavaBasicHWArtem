package org.example._2024_03_05;

import java.util.Scanner;

/* 1 уровень сложности: №1
Введите 2 слова, воспользуйтесь сканером, состоящие из четного количества букв (проверьте количество букв в слове).
Нужно получить слово, состоящее из первой половины первого слова и второй половины второго слова. распечатать на консоль.
Например:
ввод - mama, papa
вывод - mapa*/
/*Метод .substring() используется для извлечения подстроки из строки,
//позволяет получить часть строки, начиная с определенного индекса и до указанного индекса (вкл.)
Синтаксис: .substring(int startIndex), .substring(int startIndex, int endIndex)
*/
public class Mapa {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое слово, состоящее из четного числа символов");
        String firstWord = scanner.next();
        checkInput(firstWord);

        System.out.println("Введите второе слово, состоящее из четного числа символов");
        String secondWord = scanner.next();
        checkInput(secondWord);

        String substringOfFirstWord = firstWord.substring(0,firstWord.length()/2);
        String substringOfSecondWord = secondWord.substring(firstWord.length()/2,firstWord.length());
        System.out.println(substringOfFirstWord+substringOfSecondWord);
    }
    public static void checkInput (String string) {
        //Проверка введенных пользователем данных
        if (string.length() % 2 != 0) {
            System.out.println("Вы ввели слово, состоящее из нечетного количества символов");
            System.out.println("Повторите попытку");
            System.exit(0);
        }
    }
}
