import java.util.Scanner;

public class postive_or_negative {
    public static void main(String[] args) {
        System.out.println("user please enter the number");
        Scanner sc = new Scanner(System.in);
       int num =  sc.nextInt();
       if(num>0) {
           System.out.println(num + " is Positive");
       }
       else if(num<0) {
           System.out.println(num + " is negative");
       }
       else
           System.out.println("please enter number other than 0");
    }

}
