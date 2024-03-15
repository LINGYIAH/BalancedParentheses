import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an expression with only parentheses {}, (), []: ");
        String expression = scanner.nextLine();

        BalancedParentheses parenthesesChecker = new BalancedParentheses();
        boolean isBalanced = parenthesesChecker.checkBalancedParentheses(expression);

        if (isBalanced) {
            System.out.println("The expression has balanced parentheses.");
        } else {
            System.out.println("The expression does not have balanced parentheses.");
        }

        scanner.close();
    }
}
