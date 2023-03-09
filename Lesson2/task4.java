// К калькулятору из предыдущего дз добавить логирование.

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner Scanner = new Scanner(System.in);
        System.out.printf("Введите первое число ");
        Integer num1 = Scanner.nextInt();
        System.out.printf("Введите операцию ");
        String num2 = Scanner.next();
        char num3 = num2.charAt(0);
        System.out.printf("Введите второе число ");
        Integer num4 = Scanner.nextInt();
        Scanner.close();

        File file = new File("task4.txt");
        PrintWriter pw = new PrintWriter(file);

        char a = '+';
        char b = '-';
        char c = '*';
        char d = '/';

        if (num3 == a) pw.println("Сумма чисел равна " + (num1 + num4));
                        
        if (num3 == b) pw.println("Разница чисел равна " + (num1 - num4));
                        
        if (num3 == c) pw.println("Произведение чисел равно " + (num1 * num4));
                        
        if (num3 == d) pw.println("Деление чисел равно " + (num1 / num4));
                        
            pw.close();
        }
    }