// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка.

package Lesson3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class task3 {
    public static void main(String[] args) {
        ArrayList<Integer> MyList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        
        int sum = 0;
        int avg = 0;
        for (int i = 0; i < MyList.size(); i++) {
            sum += MyList.get(i);
            avg = sum / MyList.size();
        }

        System.out.println("Максимальное число списка: " + Collections.max(MyList));
        System.out.println("Минимальное число списка: " + Collections.min(MyList));
        System.out.println("Среднее арифметическое число списка: " + avg);
    }
}
