import java.util.Scanner;
import java.util.Stack;

public class Question5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input momentum awal (N)
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            
            Stack<Integer> stack = new Stack<>();
            
            int current = n;
            while (current >= 1) {
                stack.push(current);
                current = current / 2;
            }
            
            while (!stack.isEmpty()) {
                System.out.print(stack.pop() + (stack.isEmpty() ? "" : " "));
            }
            System.out.println();
        }
        
        scanner.close();
    }
}