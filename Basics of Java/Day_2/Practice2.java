import java.util.Scanner;
class Practice2{
    public static void main(String[] Args){
        System.out.println("Enter the Number to Print the Table:");
        Scanner tableNumber = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int Number = tableNumber.nextInt();

        for(int i= 1; i<=10; i++){
            
            System.out.println(Number + " x " + i + " = " + (Number * i));
        }
        tableNumber.close();

    }

}