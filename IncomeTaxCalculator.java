import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args){

        /*Take annual salary as input and calculate tax:
                Up to 2,50,000 → No tax
                2,50,001 – 5,00,000 → 5%
                5,00,001 – 10,00,000 → 20%
                Above 10,00,000 → 30%
                Print the tax amount. */

                Scanner sc = new Scanner(System.in);

            System.out.println("Enter the annual salary :");
            double salary = sc.nextDouble();

            double tax = 0;

            if(salary < 0){
                System.out.println("Invalid input!!");
            }

            else if(salary <= 250000){
                tax = 0;
            }

            else if(salary <= 500000){
                tax = salary * 0.05;
            }

            else if(salary <= 1000000){
                tax = salary * 0.20;
            }
            else{
                tax = salary * 0.30;
            }

        System.out.println("Tax amount $"+tax);  
        
        sc.close();

    }
    
}
