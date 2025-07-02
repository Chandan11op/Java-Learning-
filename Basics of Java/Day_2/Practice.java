import java.util.Scanner;

class Practice{
    public static void main(String[] Args){
        System.out.println("Enter your age to check whether you are eligilble to vote or not!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Age: ");
        int age= sc.nextInt();
        if(age>= 18){
            System.out.println("You are Eligilble to vote.");
        }else{
            System.out.println("You are not Eligilble to vote.");
        }

    }
}