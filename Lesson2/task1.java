// Реализуйте алгоритм сортировки пузырьком числового массива (введён вами), результат после каждой итерации запишите в лог-файл.

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;


public class task1 {
    public static void main(String[] args) throws FileNotFoundException {
        int[] array = { 19, 0, 5, 2, 15 };

        File file = new File("log.txt");
        PrintWriter pw = new PrintWriter(file);
        pw.println(Arrays.toString(array)); 

        boolean isSorted = false;
        int buffer;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;
                    buffer = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buffer;
                    pw.println(Arrays.toString(array));
                }
            }
        }
        pw.close();
    }
}