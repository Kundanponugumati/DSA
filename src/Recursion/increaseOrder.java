package Recursion;

public class increaseOrder {
    public static void compute(int n)
    {
        if(n==1)
        {
            System.out.println(1);
            return;
        }
        compute(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        int n=10;
        compute(n);
    }
}
