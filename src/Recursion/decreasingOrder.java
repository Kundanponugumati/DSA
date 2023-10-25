package Recursion;

public class decreasingOrder {
    public static void compute(int n)
    {
        if(n==1)
        {
            System.out.println(1);
            return;
        }
        System.out.println(n);
        compute(n-1);
    }
    public static void main(String[] args) {
        int n=10;
        compute(n);
    }
}
