import java.util.Scanner;

class checkpalindrome {
    void palin(int a) {
        int store = a;
      int reverseNum=0;
      while(a>0) {
          int temp = a%10;
          reverseNum = reverseNum*10+temp;
          a = (a-temp)/10;
      }
        System.out.println(reverseNum);
        System.out.println(store);
      if(store==reverseNum) {
          System.out.println("The given number is palindrome");
      }
      else {
          System.out.println("The given number is not a palindrome");
      }
    }
}

public class palindrome {
    public static void main(String[] args) {
        System.out.println("please enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        checkpalindrome cp = new checkpalindrome();
        cp.palin(num);
    }
}
