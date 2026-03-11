import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        /*Ask the user to enter their age and print:
                Age < 18 → "Not eligible to vote"
                Age 18–60 → "Eligible to vote"
                Age above 60 → "Senior voter" */

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your Age :");
        int age = sc.nextInt();        

        if(age <= 0 || age > 120){
            System.out.println("Invalid Age!");
        }
        else if(age < 18){
            System.out.println("Not eligble to vote");
        }
        else if(age <= 60){
            System.out.println("Eligble to vote");
        }
        else{
            System.out.println("Senior voter");
        }
        sc.close();
    }
}