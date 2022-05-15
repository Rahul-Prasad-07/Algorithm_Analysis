package Recursion;

public class func {
    public static int func(int x, int n) {
        if (n == 0)
            return 1;
        else if(n%2 == 0)
            return func(x*x, n/2);
        else
            return x*func(x*x, n/2);
    }

    public static void main(String[] args) {
        System.out.println(func(3 , 3));
    }
}
