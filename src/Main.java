import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Stack<String> stack = new Stack<>(5);
        stack.push("10");
        stack.push("10");
        stack.push("10");
        stack.push("10");
        stack.push("10");
        System.out.println(stack);
        System.out.println(stack.isFull());
        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);

        System.out.println(stack.isFull());
        System.out.println(stack);
        stack.clear();
        System.out.println(stack);

        System.out.println(stack.isEmpty());



    }
}