package JavaTutorial;

public class Conditions {
    public static void main(String[] args){
        // if, else if, else
        // taking example of temperature
        int temp = 30;
        if (temp>30){
            System.out.println("Yikes, that's a hot day!");
            System.out.println("Reminder for you to stay hydrated 🥛");
        }

        else if (temp > 20)
            System.out.println("What a nice day...");

        else
            System.out.println("Brrrr, that's cold!!");

        // ternary operator
        // Syntax: <datatype> varName = (<condition> ? <output1> : <output2>) -> if true: output1 ; else: output2
        int income = 120_000;
        String className = (income > 100_000 ? "First Class" : "Economy class");
        System.out.println(className);

        // switch case - can use every datatype EXCEPT long
        String role = "";
        switch (role) {
            case "admin":
                System.out.println("Greetings admin!!");
                break;
        
            default:
                System.out.println("Greetings user!!");
                break;
        }
    }
}
