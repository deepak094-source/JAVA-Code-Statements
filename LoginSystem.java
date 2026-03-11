import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {

        String user = "deepak69";
        String pws = "deepak00";

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String username = sc.nextLine();

        System.out.print("Enter the password: ");
        String password = sc.nextLine();

        if (username.equals(user) && password.equals(pws)) {
            System.out.println("Login Successful");
        }
        else if (username.equals(user)) {
            System.out.println("Incorrect Password");
        }
        else {
            System.out.println("User not found");
        }

        sc.close();
    }
}