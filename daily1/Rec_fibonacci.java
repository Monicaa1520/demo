package Addon;

public class Rec_fibonacci {
    public static int fibonacci(int n) {      
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static void main(String[] args) {
        int number = 5; 
        int result = fibonacci(number);
        System.out.println("Fibonacci of " + number + " is: " + result);
    }
}
