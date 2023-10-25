package Recursion;

public class factroialN {
    public static int compute(int n)
    {
        int fact =1;
        if(n==0)
        {
            return fact;
        }
        n = n*compute(n-1);
        return n;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(compute(n));
    }
}
