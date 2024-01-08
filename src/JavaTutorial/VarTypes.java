package JavaTutorial;

import java.util.Date; // For date reference datatype
import java.awt.*; // For point reference datatype

public class VarTypes {
    
    public static void primitiveDatatypes(){
        byte var1 = 10;             // 1 byte  → [-128 - 127]
        short var2 = 3200;          // 2 bytes → [-32K - 32K]
        int var3 = 282283;          // 4 bytes → [-2B - 2B]
        long var4 = 34323424243L;   // 8 bytes → Use L after number for long 
        
        float var5 = 23.12F;        // 4 bytes → Use F after number for float
        double var6 = 5984.848;     // 8 bytes

        char var7 = 'V';            // 2 bytes

        System.out.println(var1); 
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);
        System.out.println(var5);
        System.out.println(var6);
        System.out.println(var7);    

        // constant variables
        final double PI = 3.1415923; // NAMING CONVENTION ALL CAPS
        System.out.println(PI);

    }

    // Note:
    
    // memory allocation and deallocation of primitive datatypes is taken care of by the JRE automatically
    
    // new (keyword) allocates new space for reference datatypes in memory, thus we have to use new before assigning its value
    // deallocation of that memory is taken care by the JRE (Java Runtime Enviroment)
    // all reference datatype variables store a reference to the memory address in which the values are stored

    public static void referenceDatatypes(){
        Date now = new Date();
        Point point1 = new Point(1,2);
        String message1 = new String("Hello World");
        // OR
        String message2 = "Hello World v2.0";

        System.out.println(now);
        System.out.println(point1);
        System.out.println(message1);
        System.out.println(message2);

    }

    public static void typeCast(){
        // default typecasting
        double result = (double)10 / (double)3;
        System.out.println(result);

        // typecasting strings to numerical datatypes
        // Syntax: <datatype>.parse<datatype>(<str>)
        Integer.parseInt("3");
        Float.parseFloat("3.14");
        Double.parseDouble("3.1415923");
        Long.parseLong("142857285714");
        Short.parseShort("14");

    }

    public static void main(String[] args) {
        
        primitiveDatatypes();
        referenceDatatypes();
        typeCast();  
    }
}
