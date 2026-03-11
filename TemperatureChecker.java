import java.util.Scanner;

public class TemperatureChecker {
    public static void main(String[] args) {
        /*Ask the user to enter temperature in Celsius and print:
                                Above 35 → "Very Hot"
                                25–35 → "Warm"
                                15–24 → "Normal"
                                5–14 → "Cold"
                                Below 5 → "Very Cold" */
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Temperature in C°");       
        double temp = sc.nextDouble();
        
        if(temp > 35){
            System.out.println("Very Hot");
        }
        else if(temp >= 25){
            System.out.println("Warm");
        }
        else if(temp >= 15){
            System.out.println("Normal");
        }
        else if(temp >= 5){
            System.out.println("Cold");
        }
        else{
            System.out.println("Very Cold");
        }

        sc.close();
    }
    
}
