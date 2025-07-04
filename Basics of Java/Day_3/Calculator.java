import java.util.Scanner;

class Calculator {

    // Method that adds two numbers
    public static int add(int a, int b) {
        return a + b;
    }
    // Method that Substracts two numbers
    public static int subtract(int a, int b) {
        return a - b;
    }
    // Method that Multiplies two numbers
    public static int multiply(int a, int b) {
        return a * b;
    }
    // Method that divides two numbers
    public static int divide(int a, int b) {
        return a / b;
    }
    // Main method: program execution starts here
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner op = new Scanner(System.in);
        
        System.out.println("Welcome to Calculator Enter any two numbers to calculate the value");
        System.out.print("Enter first number : ");
        int num1 = input.nextInt();
        
        System.out.print("Enter second number : ");
        int num2 = input.nextInt();
        
        int result;
        System.out.print("What Operation to be perform( +,-,*,/ ):");
        char ch = op.next().charAt(0);

        switch(ch){
            case '+' -> {
                result = add(num1, num2);
                System.out.println("The Sum is " + result );
            }
            case '-' -> {
                result = subtract(num2, num2);
                System.out.println("The Sum is " + result );
            }

            case '*' -> {
                result = multiply(num1, num2);
                System.out.println("The Sum is " + result );
            }

            case '/' -> {
                result = divide(num1, num2);
                System.out.println("The Sum is " + result );
            }
        
            default -> System.out.println("Invalid Expression");

        }
    
    }
}

