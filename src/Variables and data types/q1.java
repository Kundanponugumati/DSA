import java.util.Scanner;
// avg of 3 numbers
public class q1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the value of a");
        int a = scan.nextInt();
        System.out.println("enter the value of b");
        int b = scan.nextInt();
        System.out.println("enter the value of c");
        int c = scan.nextInt();
        float avg = (float)(a+b+c)/3;
        System.out.println("the avg of "+ a+" + " + b+" + " + c+ " is "+avg);

    }
}
