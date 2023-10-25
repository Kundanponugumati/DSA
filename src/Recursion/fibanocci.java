package Recursion;

public class fibanocci {
    public static int compute(int n)
    {
     if(n==1)
     {
         return 0;
     }
     if(n==2)
     {
         return 1;
     }

     n = compute(n-1)+compute(n-2);
     return n;
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println(compute(25));
    }
}
