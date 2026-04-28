import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args){
        /*Enter a number and print:
              "Positive"
              "Negative"
              Using ternary. */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num =sc.nextInt();

        String print =(num>0) ? "Positive" : (num<0) ? "Negative" : "Zero";
        System.out.println("The number you entered is "+print);
    }
}
