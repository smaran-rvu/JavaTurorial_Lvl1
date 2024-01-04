package JavaTutorial;

public class Loops {
    public static void main(String[] args) {
        // for loop
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        // for-each loop - similar to "for i in list" 
        // Syntax: for (<datatype> var : <iterable>) - for var in iterable
        String[] fruits = {"Apple", "Orange", "Mango"};
        for (String fruit : fruits) {
            System.out.println(fruit);
        } 

        // while loop
        int i = 5;
        while (i>0) {
            System.out.println(i);
            i--;
        }

        // do-while loop -> always gets exxecuted at least once... even if condition is false 
        i = 0;
        do {
            System.out.println(i);
        } while (i == 1);

        // break statement - breaks out of loop
        for (int j = 0; j < 5; j++) {
            if (i==3)
                break; // loop stops at i=3
            System.out.println(i);
        }

        // continue statement - continues to next iteration of loop
        for (int j = 0; j < 5; j++) {
            if (i==3)
                continue; // loop skips executing all below commands at i=3 and moves to i=4
            System.out.println(i);
        }
    }
}
