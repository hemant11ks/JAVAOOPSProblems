import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {

    public static void main(String[] args) {
        // Create a deque
        Deque<String> deque = new ArrayDeque<>();

        // Adding elements to the deque
        deque.addFirst("Element 1"); // Adds the element to the beginning of the deque
        deque.addLast("Element 2"); // Adds the element to the end of the deque

        // Printing the deque
        System.out.println("Deque after adding elements: " + deque);

        // Removing elements from the deque
        String removedFirst = deque.removeFirst(); // Removes and returns the first element
        String removedLast = deque.removeLast(); // Removes and returns the last element

        // Printing the removed elements
        System.out.println("Removed first element: " + removedFirst);
        System.out.println("Removed last element: " + removedLast);

        // Printing the deque after removal
        System.out.println("Deque after removing elements: " + deque);

        // Adding elements again
        deque.addFirst("Element A");
        deque.addLast("Element B");

        // Printing the deque after re-adding elements
        System.out.println("Deque after re-adding elements: " + deque);

        // Peeking elements
        String firstElement = deque.peekFirst(); // Retrieves but does not remove the first element
        String lastElement = deque.peekLast(); // Retrieves but does not remove the last element

        // Printing the peeked elements
        System.out.println("First element (peek): " + firstElement);
        System.out.println("Last element (peek): " + lastElement);

        // Printing the deque after peeking
        System.out.println("Deque after peeking: " + deque);

        // Polling elements
        String polledFirst = deque.pollFirst(); // Retrieves and removes the first element
        String polledLast = deque.pollLast(); // Retrieves and removes the last element

        // Printing the polled elements
        System.out.println("Polled first element: " + polledFirst);
        System.out.println("Polled last element: " + polledLast);

        // Printing the deque after polling
        System.out.println("Deque after polling: " + deque);
    }
}
