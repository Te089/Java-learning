// Реализовать простой калькулятор (+ - / *)
// Ввод числа ->
// Ввод знака ->
// Ввод числа ->

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.printf("Введите первое число ");
        Integer num1 = Scanner.nextInt();
        System.out.printf("Введите операцию ");
        String num2 = Scanner.next();
        char num3 = num2.charAt(0);
        System.out.printf("Введите второе число ");
        Integer num4 = Scanner.nextInt();
        Scanner.close();

        char a = '+';
        char b = '-';
        char c = '*';
        char d = '/';

        if (num3 == a)
            System.out.println("= " + (num1 + num4));
        if (num3 == b)
            System.out.println("= " + (num1 - num4));
        if (num3 == c)
            System.out.println("= " + (num1 * num4));
        if (num3 == d)
            System.out.println("= " + (num1 / num4));
    }
}
