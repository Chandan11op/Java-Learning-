
import java.util.Scanner;

class Practice3{
    

    public static void main(String[] Args){
        Scanner Scan = new Scanner(System.in);
        System.out.println("Adding Two Numbers by Taking User Input:");
        System.out.println("Enter First number:");
        int num1 = Scan.nextInt();
        System.out.println("Enter Second number:");
        int num2 = Scan.nextInt();
        int Sum = num1 + num2;
        System.out.println("Sum of " + num1 + " and "+ num2 + " is " + Sum );
           

    }

}