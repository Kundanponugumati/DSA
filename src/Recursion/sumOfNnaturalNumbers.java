package Recursion;

public class sumOfNnaturalNumbers {
    public static int compute(int n)
    {
        if(n==1)
        {
            return 1;
        }

        n=compute(n-1)+n;
        return n;
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println(compute(n));
    }
}
