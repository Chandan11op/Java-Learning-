import java.util.Scanner;

class Practice3{
    public static void main(String[] Args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any Number of Week:");
        int week = input.nextInt();
        switch (week) {
            case 1 -> System.out.println("Sunday.");
            case 2 -> System.out.println("Monday.");
            case 3 -> System.out.println("Tuesday.");
            case 4 -> System.out.println("Wednesday.");
            case 5 -> System.out.println("Thursday.");
            case 6 -> System.out.println("Friday.");
            case 7 -> System.out.println("Saturday.");
            default -> System.out.println("Invalid Number!");
        }
        System.out.println("Enter any Number of Month:");
        int month = input.nextInt();
        switch (month) 
        {
            case 1 -> System.out.println("January");
            case 2 -> System.out.println("February");
            case 3 -> System.out.println("March");
            case 4 -> System.out.println("April");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("June");
            case 7 -> System.out.println("July");
            case 8 -> System.out.println("August");
            case 9 -> System.out.println("September");
            case 10 -> System.out.println("October");
            case 11 -> System.out.println("November");
            case 12 -> System.out.println("December");
            default -> System.out.println("Invalid Number!");
        }
    }
}