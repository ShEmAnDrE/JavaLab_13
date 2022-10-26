package com.company;

import java.util.Scanner;
import java.util.regex.Pattern;

//Написать регулярное выражение, определяющее является ли данная строка строкой
//        abcdefghijklmnopqrstuv18340 или нет.
//        a) пример правильных выражений: abcdefghijklmnopqrstuv18340
//        b) пример неправильных выражений: abcdefghijklmnoasdfasdpqrstuv18340.

public class Main {
    public static boolean checkString(Pattern p1, String str) {
        return p1.matcher(str).matches();
    }

    public static void main(String[] args) {
	    // проверка на соответствие строки шаблону
        Pattern p1 = Pattern.compile("^abcdefghijklmnopqrstuv18340$");
        String str  = "";
        String choice = "";
        Scanner sc = new Scanner(System.in);
        boolean f = true;
        while (f) {
            System.out.println("Выберите команду:");
            System.out.println("1 - Сравнить строку");
            System.out.println("Любая другая клавиша - Выйти из программы");
            choice = sc.nextLine();
            switch (choice.charAt(0)) {
                case '1':
                    System.out.println("Введите строку");
                    str = sc.nextLine();
                    System.out.println(str + ": " + checkString(p1, str));
                    break;
                default:
                    System.out.println("До свидания!");
                    f = false;
            }
        }
    }
}
