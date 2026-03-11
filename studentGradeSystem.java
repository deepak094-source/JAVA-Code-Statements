
import java.util.Scanner;

// Write a program that takes marks (0-100) as input and prints the grade.

public class studentGradeSystem{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of Student :");
        double marks = sc.nextDouble();

        if(marks >=90 && marks <=100){
            System.out.println("A");
        }

        else if (marks >=75 && marks <=89){
            System.out.println("B");
        }

        else if (marks >=60 && marks <=74){
            System.out.println("C");
        }

        else if (marks >=40 && marks <=59){
            System.out.println("D");
        }

        else if (marks < 40){
            System.out.println("Fail");
        }

        else{
            System.out.println("Wrong Input..!");
        }

        sc.close();


    }
}