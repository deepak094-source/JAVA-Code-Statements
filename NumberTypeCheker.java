
import java.util.Scanner;

public class NumberTypeCheker {
    public static void main(String[] args) {
        /*Ask the user to enter a number.
                Check if it is:
                Positive
                Negative
                Zero */
               
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num = sc.nextInt();

        if(num >0){
            System.out.println("Positive Number");
        }
        else if(num<0){
            System.out.println("Negative Number");
        }
        else {
            System.out.println("Zero");
        }
        sc.close();
    }  
}
