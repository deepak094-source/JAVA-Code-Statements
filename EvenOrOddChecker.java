import java.util.Scanner;

public class EvenOrOddChecker{
    public static void main(String[] args){

        /*Ask the user to enter a number and print Even or Odd using the ternary operator. */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number :");
        int num = sc.nextInt();

        String status = (num % 2 ==0) ? "Even" : "Odd";
        System.out.print("The number you entered is :"+status);

        sc.close();
    }
}