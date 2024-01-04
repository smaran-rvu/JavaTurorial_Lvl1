package JavaTutorial;

import java.util.Scanner; // Scanner class used for reading inputs

public class Input {
    public static void main(String[] args){
        // taking input from terminal
        Scanner scanner = new Scanner(System.in);

        // read byte
        System.out.print("Enter var1: ");
        byte var1 = scanner.nextByte();
        System.out.println("var1 (byte) = " + var1);
    
        // read int
        System.out.print("Enter var2: ");
        int var2 = scanner.nextInt();
        System.out.println("var2 (int) = "+ var2);

        // read String
        System.out.print("Enter var3 (multi token):");
        String var3 = scanner.next(); // For reading one token (inputs with no spaces)
        System.out.println("var3 (String) = " + var3); // Input: Hello World ; Output: Hello
        
        System.out.print("Enter var4 (multi token):");
        String var4 = scanner.nextLine(); // For reading multi token inputs (inputs with spaces)
        System.out.println("var4 (String) = " + var4); // Input: Hello World ; Output: Hello World
        // Note: Make sure you do not have any other single token inputs before this, execution gets messed up... 

        // to remove extra whitespaces before/after inputted sting, we use trim() method
        System.out.print("Enter var5 (preferable with whitespaces before start of str):");
        String var5 = scanner.nextLine().trim();
        System.out.println("var5 (String) = " + var5);

        // Sclose scanner object (cause it tells you to, otherwise annoying yellow squiggly lines)
        scanner.close();
    }
}
