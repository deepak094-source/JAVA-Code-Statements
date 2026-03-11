
import java.util.Scanner;

public class largestOfThreeNumber {
    public static void main(String[] args) {
        
        /*
        Take three numbers from the user and print the largest number using if-else-if.

            Example
            Input: 5, 10, 7
            Output: 10 is the largest.
      */

      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number :");
      int x = sc.nextInt();

      System.out.println("Enter the number :");
      int y = sc.nextInt();

      System.out.println("Enter the number :");
      int z = sc.nextInt();

      if(x>=y && x>=z){
        System.out.println(x +" is the Largest number");
      }

      else if(y>=x && y>=z){
        System.out.println(y + " is the largest number");
    
      }

      else{
        System.out.println(z + " is the largest number");
      }

      sc.close();

    }
}
