// Дана строка (получение через обычный текстовый файл!!!)

// "фамилия":"Иванов","оценка":"5","предмет":"Математика"
// "фамилия":"Петрова","оценка":"4","предмет":"Информатика"

// Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
// Студент [фамилия] получил [оценка] по предмету [предмет].

// Пример вывода:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

import java.io.BufferedReader;
import java.io.FileReader;

public class task2 {
    public static void main(String[] args) {
        StringBuilder stringFile = new StringBuilder();
        try {
            BufferedReader file = new BufferedReader(new FileReader("task2.txt"));
            String line;
            while ((line = file.readLine()) != null) {
                String[] array = line.replace("\"", "")
                        .replace(":", " ")
                        .replace(",", " ")
                        .replace("  ", " ")
                        .split(" ");
                stringFile.append("Студент ")
                        .append(array[1])
                        .append(" получил ")
                        .append(array[3])
                        .append(" по предмету");
                for (int i = 5; i < array.length; i++) {
                    stringFile.append(" ").append(array[i]);
                }
                stringFile.append(".\n");
            }
            file.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println(stringFile);
    }
}
