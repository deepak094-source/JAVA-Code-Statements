
import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        /*Ask the user to enter a year and determine whether it is a leap year or not.
                        Rules:
                        Divisible by 4
                        Not divisible by 100 unless divisible by 400 */
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year :");  
        int year = sc.nextInt();
         
        
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            System.out.println("Entered year is leep year");
        }
        
        else{
            System.out.println("year is not leap");
        }

        sc.close();
            
    }
}
    

