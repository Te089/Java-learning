// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;

public class task2 {
    public static void main(String[] args) {
        LinkedList<Object> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list + "\n");

        System.out.println("enqueue:");
        System.out.println(enqueue(list, 6));
        System.out.println(list + "\n");

        System.out.println("dequeue:");
        System.out.println(dequeue(list));
        System.out.println(list + "\n");

        System.out.println("first:");
        System.out.println(first(list));
        System.out.println(list + "\n");
    }
    public static Object enqueue(LinkedList<Object> list, Object element) {
        return list.offer(element);
    }

    public static Object dequeue(LinkedList<Object> list) {
        return list.poll();
    }

    public static Object first(LinkedList<Object> list) {
        return list.peek();
    }
}
