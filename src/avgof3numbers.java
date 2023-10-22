import java.util.Scanner;



public class avgof3numbers {
    public static void main(String[] args) {
        System.out.println("enter 3 numbers");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        avg av = new avg();
        av.average(a,b,c);
    }
}

class avg {
    void average(int a ,int b, int c) {
        System.out.println((a+b+c)/3);
    }
}


