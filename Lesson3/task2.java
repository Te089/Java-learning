// Пусть дан произвольный список целых чисел, удалить из него чётные числа

package Lesson3;

import java.util.ArrayList;
import java.util.Arrays;

public class task2 {
    public static void main(String[] args) {
        ArrayList<Integer> MyList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        for (int i = MyList.size() - 1; i >= 0; i--) {
            if (MyList.get(i) % 2 == 0) {
                MyList.remove(i);
            }
        }System.out.println(MyList);
    }
}
