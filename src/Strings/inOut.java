package Strings;

import java.util.*;

public class inOut {
    public static void print(String str)
    {
        for(int i=0;i<str.length();i++)
        {
            System.out.print(str.charAt(i)+ " ");
        }
    }
    public static void main(String[] args) {
        String str= "kundan";
        System.out.println(str);
        String str1 = new String("hello");
        System.out.println(str1);
        Scanner sc = new Scanner(System.in);
        String str2=sc.nextLine();
        System.out.println(str2.length());
        str = str1+" " + str2 + " "+ str;
        System.out.println(str);
//        System.out.println(str.charAt(3));
        print(str);
    }
}
