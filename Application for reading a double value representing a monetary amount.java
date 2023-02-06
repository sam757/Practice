
import java.util.Scanner; //You have to import Scanner if you want to use it

class One {
    public static void main(String[] args) {
                    Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        double amount = scanner.nextDouble(); //Java is case sensitive so nextDouble() != nextdouble
        //You set the coins and/or notes denominations here
                        // 1c     5c  10c  25c   50c  $1  $5 $10
        double[] coins = {0.01, 0.05, .1,  0.25, 0.5,  1,  5, 10}; //Put your denominations here
        double[] soln = new double[coins.length];
        double current = 0.0;
        int i = coins.length - 1;
        while(i >= 0) {
            double val = coins[i];
            while((val + current) <= amount) {
                current = current + val;
                soln[i] = soln[i] + coins[i];
            }
            i--;
        }
        System.out.println(current); // Check this value for amounts containing .1
        for(int j = 0;j < coins.length; j++) {
            System.out.println(coins[j] + " : " + soln[j] / coins[j]);
        }
 
    }
}