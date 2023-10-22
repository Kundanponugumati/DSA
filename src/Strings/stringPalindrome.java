package Strings;

import java.util.Scanner;

public class stringPalindrome {
    public static boolean palindrome(String str)
    {
        int i=0;
        int j= str.length()-1;
        for(i=0;i<j/2;i++)
        {
            if(str.charAt(i)!=str.charAt(j-i))
            {
             return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean result = palindrome(str);
        if(result)
        {
            System.out.println(str+ "  is palindrome");
        }
        else
            System.out.println(str+ "  is not palindrome");
    }
}
