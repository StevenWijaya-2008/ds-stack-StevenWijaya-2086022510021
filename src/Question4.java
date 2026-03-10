import java.util.Scanner;
import java.util.Stack;

public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            String[] parts = input.split("\\s+");
            
            Stack<Integer> mainStack = new Stack<>();
            Stack<Integer> tempStack = new Stack<>();

            for (String part : parts) {
                int current = Integer.parseInt(part);

                while (!mainStack.isEmpty() && mainStack.peek() > current) {
                    tempStack.push(mainStack.pop());
                }

                mainStack.push(current);

                while (!tempStack.isEmpty()) {
                    mainStack.push(tempStack.pop());
                }
            }


            while (!mainStack.isEmpty()) {
                tempStack.push(mainStack.pop());
            }

            while (!tempStack.isEmpty()) {
                System.out.print(tempStack.pop() + (tempStack.isEmpty() ? "" : " "));
            }
            System.out.println();
        }
        scanner.close();
    }
}