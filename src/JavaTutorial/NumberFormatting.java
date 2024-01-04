package JavaTutorial;

import java.text.NumberFormat;

public class NumberFormatting {
    public static void main(String[] args) {
        // NumberFormat is an ABSTRACT class - A class whose instace can't be created normally...
        // Instance/object creation:
        // NumberFormat instance = NumberFormat.get<type>Instance(); 

        // Formatting currency (USD)
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        currency.format(142857.142); // output: $ 142,857.14
        // Ex:
        System.out.println(currency.format(13313232.324));

        // Formatting percentage
        NumberFormat percent = NumberFormat.getPercentInstance();
        percent.format(0.132);
        // Ex:
        System.out.println(percent.format(0.1428));
    }
}
