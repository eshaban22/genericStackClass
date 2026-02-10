/**
 * A generic Stack implementation that follows the LIFO (Last In, First Out) principle.
 * This class uses an Object array to store elements to demonstrate runtime polymorphism
 * and manual type casting in the presence of type erasure.
 * * @author Your Name
 * @param <T> The type of elements held in this stack.
 */
public class Stack<T> {
    private Object[] items;
    private int top = -1;

    /**
     * Default constructor that initializes the stack with a fixed capacity of 10.
     */
    public Stack() {
        this.items = new Object[10];
    }

    /**
     * Pushes an item onto the top of the stack.
     * * @param value The generic item to be added to the stack.
     * @throws StackFullException If the internal array has reached its maximum capacity.
     */
    public void push(T value) throws StackFullException {
        if (top == items.length - 1) {
            throw new StackFullException("The stack is full!");
        }
        top++;
        items[top] = value;
    }

    /**
     * Removes and returns the item at the top of the stack.
     * * @return The item previously at the top of the stack.
     * @throws StackEmptyException If the stack contains no elements to remove.
     */
    public T pop() throws StackEmptyException {
        if (top == -1) {
            throw new StackEmptyException("The stack is empty!");
        }
        // Explicit cast from Object to T is required due to type erasure
        T value = (T) items[top];
        top--;
        return value;
    }

    /**
     * Retrieves, but does not remove, the item at the top of the stack.
     * * @return The item currently at the top of the stack.
     * @throws StackEmptyException If the stack is empty.
     */
    public T peek() throws StackEmptyException {
        if (top == -1) {
            throw new StackEmptyException("Nothing to see here!");
        }
        return (T) items[top];
    }

    /**
     * Generates a string representation of the stack elements separated by semicolons.
     * * @return A semicolon-separated string of the current stack contents.
     */
    public String list() {
        String result = "";
        for (int i = 0; i <= top; i++) {
            result += items[i];
            if (i < top) result += ";";
        }
        return result;
    }
}