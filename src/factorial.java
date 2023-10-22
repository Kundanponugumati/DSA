import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        System.out.println("please enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact=1;
        while(n>=1) {
            fact = fact*n;
            n=n-1;
        }
        System.out.println("the factorial of the number "+n+" is "+fact);
    }
}
