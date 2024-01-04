package JavaTutorial;

import java.util.Arrays;

public class Array {
    public static void main(String[] args){
        // There can be multiple arrays of different datatypes... Yes even strings
        // <datatype>[] <var_name> = new <datatype>[<arr_size>]

        int[] arr1 = new int[5];            // All elements initialized to zero
        String[] arr2 = new String[10];     // All elements initialized to null 
        // OR
        int[] arr3 = {5,4,3,2,1};

        // Printing array contents
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));

        // Printing length of array (NOTE THIS IS NOT A METHOD/FUNCTION... IT'S A FIELD i.e. a variable in a class)
        System.out.println(arr1.length); 

        // Sort array in ascending order
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));
    
        // Multi dimensional array
        int[][] arr4 = new int[3][2];
        System.out.println(Arrays.deepToString(arr4));

    }
}
