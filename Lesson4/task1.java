// Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.

import java.util.LinkedList;

public class task1 {
    public static void main(String[] args) {
        LinkedList<Object> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        System.out.println("Первоначальный список: " + ll);
        System.out.println("Перевернутый список: " + reverse(ll));
    }
    public static Object reverse(LinkedList<Object> list) {
        for (int i = 0; i < list.size(); i++) {
            list.add(list.size() - i, list.get(0));    
            list.remove();
        }
        return(list);
    }
}