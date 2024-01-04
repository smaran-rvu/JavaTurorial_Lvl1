package JavaTutorial;

public class MathClass {
    public static void main(String[] args) {
        // round a float/double into its nearest int/long
        long res1 = Math.round(2322.423);
        System.out.println(res1);

        // ceiling operator
        double res2 = Math.ceil(131.2);
        System.out.println(res2);

        // floor operator
        double res3 = Math.floor(131.2);
        System.out.println(res3);

        // power operator
        double res4 = Math.pow(4, 3);
        System.out.println(res4);
        
        // max of 2 nos
        int res5 = Math.max(1,4);
        System.out.println(res5);

        // return a random number b/w 0 and 1
        double res6 = Math.random();
        System.out.println(res6);

    }
}
