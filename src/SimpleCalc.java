import java.util.Scanner;

import static java.lang.System.out;

public class SimpleCalc {
    public static void Calc(Scanner sc) {
        out.println("Calc initiated. input number get started. commas for decimals.");
        double a = sc.nextDouble();
        out.println("Input operation: +, -, /, *, or % (modulo)");
        char operInput = sc.next().charAt(0);
        out.println("Input second number.");
        double b = sc.nextDouble();
        double result = 0;
        switch (operInput) {
            case '+' -> result = a + b;
            case '-' -> result = a - b;
            case '*' -> result = a * b;
            case '/' -> result = a / b;
            case '%' -> result = a % b;
        }
        out.println(result);
    }
}
