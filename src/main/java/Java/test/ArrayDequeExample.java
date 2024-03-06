import java.util.ArrayDeque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();

        // Adding elements to the front of the deque
        deque.addFirst("Apple");
        deque.addFirst("Banana");
        deque.addFirst("Orange");
        deque.addFirst("papaya");

        // Adding elements to the end of the deque
        deque.addLast("Grapes");
        deque.addLast("Mango");

        // Printing the deque
        System.out.println(deque);

        // Removing an element from the front of the deque
        String removedFirst = deque.removeFirst();
        System.out.println("Removed First: " + removedFirst);

        // Removing an element from the end of the deque
        String removedLast = deque.removeLast();
        System.out.println("Removed Last: " + removedLast);

        // Printing the deque after removal
        System.out.println(deque);

        // Getting the element at the front of the deque
        String firstElement = deque.getFirst();
        System.out.println("First Element: " + firstElement);

        // Getting the element at the end of the deque
        String lastElement = deque.getLast();
        System.out.println("Last Element: " + lastElement);

        // Getting the size of the deque
        int size = deque.size();
        System.out.println("Size: " + size);

        // Clearing the deque
        deque.clear();

        // Printing the deque after clearing
        System.out.println(deque);
    }
}