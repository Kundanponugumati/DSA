import java.util.Scanner;

class compute1 {
    void sod (int a){
        int sum=0;
        while(a>0) {
            int temp = a % 10;
            sum = sum + temp;
            a = (a - temp) / 10;
        }
        System.out.println(sum);
    }
}
public class sumofdigits {
    public static void main(String[] args) {
        System.out.println("please enter the number");
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        compute1 c1 = new compute1();
        c1.sod(num);
    }
}
