import java.util.Scanner;
import java.util.Stack;

public class Question1 {
    public static boolean is_balanced(String s) {
        if (s.length() % 2 != 0) return false;

        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        int tengah = s.length() / 2;

        for (int i = 0; i < tengah; i++) {
            stack1.push(s.charAt(i));
        }

        for (int i = tengah; i < s.length(); i++) {
            stack2.push(s.charAt(i));
        }

        while (!stack1.isEmpty() && !stack2.isEmpty()) {
            char buka = stack1.pop();
            char tutup = stack2.pop();

            if (!isMatchingPair(buka, tutup)) {
                return false;
            }
        }

        return true;
    }

    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '[' && close == ']') ||
               (open == '{' && close == '}');
    }

    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);

        System.out.println("=== Program Cek Bracket Balanced ===");
        System.out.print("Masukkan urutan bracket (contoh: {([])}): ");
            
        String input = inputUser.nextLine();

        if (is_balanced(input)) {
            System.out.println("Hasil: BALANCED (Seimbang)");
        } else {
            System.out.println("Hasil: NOT BALANCED (Tidak Seimbang)");
        }

        inputUser.close();
    }
}