// В калькулятор добавьте возможность отменить последнюю операцию.
// Пример

// 1
// +
// 2
// ответ:
// 3

// +
// 4
// ответ:
// 7

// Отмена
// 3
// *
// 3

// ответ:
// 9
// Дополнительно каскадная отмена - отмена нескольких операций

import java.util.Scanner;
import java.util.Stack;

public class task3 {
   static Scanner scanner = new Scanner(System.in);

   public static void main(String[] args) {
       Stack<Integer> st = new Stack<>();
       System.out.print("Введите первое число: ");
       st.push(scanner.nextInt());
       char op = operation();
       System.out.print("Введите второе число: ");
       st.push(scanner.nextInt());
       calc(st, op);
       while (true) {
           System.out.println("Отменить последнюю операцию? Да - 'y' | Нет - 'n'");
           op = scanner.next().charAt(0);
           if (op == 'y') {
               System.out.println("Первое число: " + st.peek());
               op = operation();
               System.out.print("Введите второе число: ");
               st.push(scanner.nextInt());
               calc(st, op);
               continue;
           }
           if (op == 'n') {
               System.out.println("Решение завершено.");
               break;
           }
       }
   }

   public static char operation() {
       System.out.print("Введите операцию: ");
       char op = scanner.next().charAt(0);
       if (op == '+' || op == '-' || op == '*' || op == '/') {
           return op;
       } else {
           throw new IllegalArgumentException("Некорректная операция!");
       }
   }

   public static void calc(Stack<Integer> st, Character op) {
       double b = st.pop();
       double a = st.peek();
       double res = 0;
       if (b == 0 && op == '/') {
           System.out.println("Делить на 0 нельзя");
       } else {
           switch (op) {
               case '+' -> res = a + b;
               case '-' -> res = a - b;
               case '*' -> res = a * b;
               case '/' -> res = a / b;
           }
           System.out.println("= " + res);
       }
   }
}