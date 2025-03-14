import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter a non-negative integer: ");
            int number = scanner.nextInt();
            
            if (number < 0) {
                System.out.println("Please enter a non-negative integer.");
                continue;
            }
            
            System.out.println("The factorial of " + number + " is: " + factorial(number));
        }
    }
    
    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        }
        
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        
        return result;
    }
}