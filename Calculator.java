import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while (true) {

            System.out.print("Enter the operator (+, -, *, /, %, X to exit): ");
            char op = in.next().trim().charAt(0);

            if (op == 'X' || op == 'x') {
                break;
            }

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {

                System.out.print("Enter two numbers: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                int ans;

                if (op == '+') {
                    ans = num1 + num2;
                } 
                else if (op == '-') {
                    ans = num1 - num2;
                } 
                else if (op == '*') {
                    ans = num1 * num2;
                } 
                else if (op == '/') {
                    ans = num1 / num2;
                } 
                else {
                    ans = num1 % num2;
                }

                System.out.println("Answer = " + ans);

            } 
            else {
                System.out.println("Invalid operator");
            }
        }

        in.close();
    }
}