package Recursion;

import java.util.Scanner;

public class Sum {

        public static int sum(int n){
            //write the logic here

            if (n <= 1) {
                return 1;
            }

            return n + sum(n-1);
        }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n>0){
            int value = Sum.sum(n);
            System.out.print(value);
        }
        else{
            System.out.println("Enter a natural number");
        }
    }
}

