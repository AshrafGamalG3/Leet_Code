import java.util.Stack;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

    }
    public String removeDuplicates(String s) {

        String afterRemove = "";
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && c == stack.peek())
                stack.pop();
            else stack.push(c);
        }
        for (char r : stack) {
            afterRemove = afterRemove + r;
        }

        return afterRemove;
    }
}