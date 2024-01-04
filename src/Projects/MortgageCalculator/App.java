package Projects.MortgageCalculator;

import java.text.NumberFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // initializing constants        
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        
        // instantiating scanner class to accept inputs
        Scanner scanner = new Scanner(System.in);
        
        // accepting inputs
        System.out.print("Enter the principal amount (in $USD): ");
        double principal = scanner.nextDouble();
        System.out.print("Enter the annual rate of interest (in %tage): ");
        double roi = scanner.nextDouble();
        System.out.print("Enter the period (in years): ");
        int period = scanner.nextInt();

        // converting annual measures to monthly measures
        double monthlyRoi = roi / MONTHS_IN_YEAR / PERCENT; // converting annual rate of interest to monthly form and in decimal (not %tage)
        double noOfPayments = period * MONTHS_IN_YEAR; // converting period to months

        // System.out.println(principal);
        // System.out.println(roi);
        // System.out.println(period);

        // calculating mortgage
        double mortgage = principal*
                          (monthlyRoi * Math.pow(1 + monthlyRoi, noOfPayments))/
                          (Math.pow(1 + monthlyRoi, noOfPayments) - 1); 
        // printing output
        System.out.println("Mortgagae to be payed is: " + NumberFormat.getCurrencyInstance().format(mortgage));

        scanner.close();
    }
}
