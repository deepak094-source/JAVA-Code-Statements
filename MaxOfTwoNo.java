import java.util.Scanner;

public class MaxOfTwoNo{
    public static void main(String[] args){

        /*Ask the user to enter two numbers and print the larger number using the ternary operator.*/

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number :");
        int num1 = sc.nextInt();
        System.out.print("Enter Second Number :");
        int num2 = sc.nextInt();

        int max=(num1>num2) ? num1 : num2;
        System.out.print("The largest no is :"+max);
    }
}