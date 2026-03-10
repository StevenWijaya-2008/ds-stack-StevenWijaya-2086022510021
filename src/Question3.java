import java.util.Scanner;
import java.util.Stack;

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (!scanner.hasNextInt()) {
            scanner.close();
            return;
        }
        int n = scanner.nextInt();
        
        Stack<Long> targetStack = new Stack<>();
        
        for (int i = 0; i < n; i++) {
            targetStack.push(scanner.nextLong());
        }
        

        Stack<String> codeStack = new Stack<>();
        long currentTax = 0;
        

        while (!targetStack.isEmpty()) {
            long target = targetStack.pop(); 
            long neededValue = target + currentTax;
            
            String bin = Long.toBinaryString(neededValue);
            StringBuilder codeBuilder = new StringBuilder("1");
            int plusCount = 0;
            
            for (int j = 1; j < bin.length(); j++) {
                codeBuilder.append("d+");
                plusCount++;
                
                if (bin.charAt(j) == '1') {
                    codeBuilder.append("1+");
                    plusCount++;
                }
            }

            codeStack.push(codeBuilder.toString());

            currentTax += plusCount; 
        }
        
        StringBuilder finalOutput = new StringBuilder();
        while (!codeStack.isEmpty()) {
            finalOutput.append(codeStack.pop());
        }
        
        System.out.println(finalOutput.toString());
        
        scanner.close();
    }
}