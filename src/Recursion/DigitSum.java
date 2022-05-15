package Recursion;

import java.util.Scanner;

public class DigitSum {

        public static int sum(int n) {
            //write the logic here

                if (n == 0) {
                    return 0;
                }
                return (n % 10) + sum(n / 10);
            }
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int num = sc.nextInt();
                System.out.println(sum(num));
            }
        }


