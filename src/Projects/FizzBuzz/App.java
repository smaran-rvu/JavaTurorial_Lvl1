package Projects.FizzBuzz;

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        // initializing scanner for input
        Scanner scanner = new Scanner(System.in);

        // explaining rules:
        System.out.println("Welcome to FizzBuzz:");
        System.out.println("1. If you enter a number divisible by 5 - you get FIZZ");
        System.out.println("2. If you enter a number divisible by 3 - you get BUZZ");
        System.out.println("3. If you enter a number divisible by both - you get FIZZBUZZ");
        System.out.println("4. Else... you get the same number");

        // asking for user input
        System.out.print("Enter a number: ");
        int userInput = scanner.nextInt();

        // FizzBuzz calculation
        if (userInput % 3 == 0 && userInput % 5 == 0)
            System.out.println("FIZZBUZZ");

        else if (userInput % 5 == 0) 
            System.out.print("FIZZ");
            
        else if (userInput % 3 == 0)
            System.out.println("BUZZ");
            
        else
            System.out.println(userInput);
            
        // close scanner instance
        scanner.close();

    }
}
