package Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class Prime {

    static void primesLessThanOrEqualTon(int n) {
            // Method to print all primes less than or equal to n in ascending order

                if(n<2){
                    System.out.println("There are no prime numbers less than or equal to "+n);
                }
                else {
                    boolean[] prime = new boolean[n + 1];
                    // Initializing all values in boolean array to true
                    Arrays.fill(prime, true);
                    for (int i = 2; i <= n; i++)
                        if (prime[i])
                            // Marking all multiples of i to false
                            for (int j = 2 * i; j <= n; j += i)
                                prime[j] = false;
                    // Printing all primes in ascending order
                    for (int i = 2; i <= n; i++)
                        if (prime[i])
                            System.out.print(i + " ");
                }
            }


        public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        primesLessThanOrEqualTon(n);
    }
}
