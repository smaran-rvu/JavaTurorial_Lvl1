package Projects.MortgageCalculator;

import java.text.NumberFormat;
import java.util.Scanner;

public class App {
    // initializing constants        
    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;
    public static void main(String[] args) {
        
        double principal;
        float roi, period;

        // accepting inputs
        principal = parameterInput("Enter your principle amount (in USD): ", 1000, 1_000_000);
        roi = (float) parameterInput("Enter your annual rate of interest: ", 0, 100);
        period = (float) parameterInput("Enter your paymenyt period (in years): ", 1, 30);

        // mortgage calculation
        double mortgage = calculateMortgage(principal, roi, period);
 
        printPayments(principal, roi, period, mortgage);

    }

    public static double parameterInput(String inputString, double lowerLimit, double upperLimit){
        // instantiating scanner class to accept inputs 
        Scanner scanner = new Scanner(System.in); 
            double number = 0;
            // infinite loop
            while (true) {
                System.out.print(inputString);
                number = scanner.nextDouble();
                if(number >= lowerLimit && number <= upperLimit)
                    break;
                System.out.println("\tPlease enter a value between " + lowerLimit + " and " + upperLimit);
            }

            // scanner.close();
            return number;
        
    }
    
    public static double calculateMortgage(double principal, float roi, float period){
        // converting annual measures to monthly measures
        float monthlyRoi = roi / MONTHS_IN_YEAR / PERCENT; // converting annual rate of interest to monthly form and in decimal (not %tage)
        float noOfPayments = period * MONTHS_IN_YEAR; // converting period to months

        // calculating mortgage
        double mortgage = principal*
                          (monthlyRoi * Math.pow(1 + monthlyRoi, noOfPayments))/
                          (Math.pow(1 + monthlyRoi, noOfPayments) - 1);
        
        return mortgage;
    }

    public static double calculateBalence(double principal, float roi, float period, short noOfPaymentsMade){
        // converting annual measures to monthly measures
        float monthlyRoi = roi / MONTHS_IN_YEAR / PERCENT; // converting annual rate of interest to monthly form and in decimal (not %tage)
        float noOfPayments = period * MONTHS_IN_YEAR; // converting period to months

        double balence = principal
            *(Math.pow(1 + monthlyRoi, noOfPayments) - Math.pow(1 + monthlyRoi, noOfPaymentsMade))
            / (Math.pow(1 + monthlyRoi, noOfPayments) - 1);

        return balence;

    }
    
    private static void printPayments(double principal, float roi, float period, double mortgage) {
        double balence;
        // printing output
        System.out.println("Mortgagae to be payed per month is: " + NumberFormat.getCurrencyInstance().format(mortgage));

        System.out.println("Payment Schedule:");
        for (short month = 1; month <= period * MONTHS_IN_YEAR; month++) {
            balence = calculateBalence(principal, roi, period, month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balence));
        }
    }

}
