// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
// Добавить функции 1) Добавление номера
// 2) Вывод всего
// Пример:
// Я ввожу: 1
// К: Введите фамилию
// Я: Иванов
// К: Введите номер
// Я: 1242353
// К: Введите 1) Добавление номера
// 2) Вывод всего
// Я ввожу: 1
// К: Введите фамилию
// Я: Иванов
// К: Введите номер
// Я: 547568
// К: Введите 1) Добавление номера
// 2) Вывод всего
// Я: 2
// Иванов: 1242353, 547568


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Map<String, ArrayList<String>> phonebook = new HashMap<String, ArrayList<String>>();
        menu(phonebook);
    }

    public static void menu(Map<String, ArrayList<String>> phonebook) {
        Scanner Scanner = new Scanner(System.in);
        while (true){
            System.out.println("Выберите пункт: 1) Добавление номера, 2) Вывод всего ");
            String operation = Scanner.nextLine();
            if (operation.equals("1")) {
                addNumber(phonebook, Scanner);
            } else if (operation.equals("2")) {
                printAll(phonebook);
            } else break;
        }
        Scanner.close();
    }

    public static void addNumber(Map<String, ArrayList<String>> phonebook, Scanner input) {
        System.out.print("Введите фамилию: ");
        String name = input.nextLine();
        System.out.print("Введите номер: ");
        String number = input.nextLine();
        ArrayList<String> numbers = new ArrayList<>();
        if (phonebook.containsKey(name)) {
            numbers = phonebook.get(name);
        }
        numbers.add(number);
        phonebook.put(name, numbers);
    }

    public static void printAll(Map<String, ArrayList<String>> phoneBook) {
        if (phoneBook.isEmpty()) {
            System.out.println("В телефонной книге нет записей");
        }
        for (var record : phoneBook.entrySet()) {
            System.out.printf("%s: ", record.getKey());
            for (int i = 0; i < record.getValue().size() - 1; i++) {
                System.out.printf("%s, ", record.getValue().get(i));
            }
            System.out.printf("%s\n", record.getValue().get(record.getValue().size() - 1));
        }
    }
}