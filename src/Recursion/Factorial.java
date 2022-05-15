package Recursion;

import java.util.Arrays;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial2(3));
    }
    public static boolean factorial2(int n) {
        int[] factorials = new int[n + 1];
        Arrays.fill(factorials, 1);
        for (int i = 0; i <= n - 1; i++) {
            factorials[i + 1] = (i + 1) * factorials[i];
        }
        System.out.println(factorials[n]);
        return false;
    }
}
