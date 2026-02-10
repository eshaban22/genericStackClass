public class StackTest {
    public static void main(String[] args) {
        // Test 1: Numbers
        System.out.println("--- Integer Test ---");
        Stack<Integer> myNumbers = new Stack<>();
        try {
            myNumbers.push(1); // Adding 1
            myNumbers.push(2); // Adding 2
            System.out.println("List: " + myNumbers.list()); // Output: 1;2
            System.out.println("Pop: " + myNumbers.pop());   // Removes 2
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Test 2: Text
        System.out.println("\n--- String Test ---");
        Stack<String> myWords = new Stack<>();
        try {
            myWords.push("Hello");
            myWords.push("World");
            System.out.println("Peek: " + myWords.peek()); // Shows "World"
            System.out.println("List: " + myWords.list());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}