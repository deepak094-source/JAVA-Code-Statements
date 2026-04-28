import java.util.Scanner;

public class SalaryBonusCalculator {
    public static void main(String[] args){
        /*
        Salary Bonus Calculator
        Ask the user for salary and years of experience.
          📌 Conditions
               Experience ≥ 5 years → Bonus = 20%
               Otherwise → Bonus = 10%                   */

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your Salary: ");
        double salary = scanner.nextDouble();

        System.out.println("What is the year of Experience do you have: ");
        double exp = scanner.nextDouble();

        double bonus = (exp>=5) ? salary *0.20 : salary *0.10;

        System.out.println("Your bonus will be :"+ bonus);
    }
}
