/**
 * Exception thrown when attempting to access elements from an empty stack.
 */
public class StackEmptyException extends Exception {
  public StackEmptyException(String message) { super(message); }
}