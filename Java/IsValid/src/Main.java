import java.util.Stack;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

    }
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
                stack.add(s.charAt(i));
            else if (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']') {
                if (stack.empty() || !eq(stack.getLast(), s.charAt(i)))
                    return false;
                else stack.pop();
            }

        }

        return stack.empty() ? true : false;
    }

    boolean eq(char o, char c) {
        if (o == '(' && c == ')') {
            return true;
        } else if (o == '{' && c == '}') {
            return true;
        } else if (o == '[' && c == ']') {
            return true;
        } else return false;

    }
}