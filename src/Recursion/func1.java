package Recursion;

public class func1 {
    public static void main(String[] args) {
        System.out.println(funca(12));

    }

    public static int funca(int n ){
        if (n == 1)
            return 0;
        else
            return 1 + funca(n/2);
    }
}
