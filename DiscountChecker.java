import java.util.Scanner;

public class DiscountChecker {
    public static void main(String[] args){
        /*Ask the user to enter shopping amount.
            Amount ≥ 1000 → "Discount Applied"
            Otherwise → "No Discount"
            Use ternary. */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Shopping amount :");
        int amount = sc.nextInt();

        String check=(amount>=1000) ? "Discount Applied" : "No Discount";
        System.out.println(check +" on your Shopping");
    }
}
