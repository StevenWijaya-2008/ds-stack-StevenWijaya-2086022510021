import java.util.Stack;

public class Question2 {

    public static int evaluate_rpn(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            switch (token) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    int b = stack.pop();
                    int a = stack.pop();
                    stack.push(a - b);
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                    int divisor = stack.pop();
                    int dividend = stack.pop();
                    stack.push(dividend / divisor);
                    break;
                default:
                    stack.push(Integer.parseInt(token));
                    break;
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String[] tokensExample1 = {"2", "1", "+", "3", "*"};
        System.out.println("Input 1: 2 1 + 3 *");
        System.out.println("Output 1: " + evaluate_rpn(tokensExample1)); 

        String[] tokensExample2 = {"4", "13", "5", "/", "+"};
        System.out.println("Input 2: 4 13 5 / +");
        System.out.println("Output 2: " + evaluate_rpn(tokensExample2));
    }
}