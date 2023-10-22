package Strings;

import java.util.Scanner;

public class lowecaseVowels {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        int sum=0;
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch=='a' || ch=='e'|| ch=='i' || ch=='o' || ch=='u')
            {
                sum++;
            }
        }
        System.out.println(sum);
    }
}
