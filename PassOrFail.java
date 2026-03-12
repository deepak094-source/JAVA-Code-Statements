import java.util.Scanner;

public class PassOrFail {
    public static void main (String[] args){
        /*Ask the user to enter marks.
            Marks ≥ 40 → "Pass"
            Marks < 40 → "Fail"
            Use a ternary operator.*/
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks :");
        int marks = sc.nextInt();


        String total = (marks>=40) ? "Passed": "Failed";
        System.out.println("Your Total Marks is "+marks+" you have "+total+ " the exam.");
    }
}
