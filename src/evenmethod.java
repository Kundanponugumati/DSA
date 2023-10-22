import java.util.Scanner;

class compute {
    boolean isEven (int a){
    if(a%2==0) {
//        System.out.println(true);
        return true;
    }
    else {
//        System.out.println(false);
        return false;
    }
    }
}


public class evenmethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        compute c = new compute();
        boolean result = c.isEven(a);
        System.out.println(result);


    }
}
