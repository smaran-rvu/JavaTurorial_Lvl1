package JavaTutorial;

public class Strings {
    public static void main(String[] args) {
        // Definition
        String str1 = "Hello World";
        
        // Str concatination
        str1 += "!!";
        
        // endsWith returns a boolean value of whether the given string ends with a defined substring
        System.out.println(str1.endsWith("!!")); // true
        System.out.println(str1.endsWith("~~")); // false

        // startsWith returns a boolean value of whether the given string starts with a defined substring
        System.out.println(str1.startsWith("He")); // false
        System.out.println(str1.startsWith("Ho")); // false

        // length returns the length of a string
        System.out.println(str1.length()); //

        // indexOf returns the index of the first occurance of a substring
        System.out.println(str1.indexOf("W")); // 6
        System.out.println(str1.indexOf("dir")); // -1

        // replace returns a string with all target substings replaced by the replacement substring 
        System.out.println(str1.replace(" ", "_"));

        // toLowerCase returns a string with all lower case letters
        System.out.println(str1.toLowerCase());

        // toUpperCase returns a string with all upper case letters
        System.out.println(str1.toUpperCase());

        // trim returns a string with no whitespaces before and after the sting
        System.out.println(str1.trim());

        // equals checks if a string is equal to another string
        str1.equals("Hello World"); // flase
    }
}
