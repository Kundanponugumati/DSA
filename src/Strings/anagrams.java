package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class anagrams {
    public static boolean anagrams(String str1,String str2)
    {
        String newstr="";
        char [] str1Array=new char[str1.length()];
        char [] str2Array=new char[str2.length()];
        if(str1.length()==str2.length())
        {
//            for(int i=0;i< str1.length();i++)
//            {
//                for(int j=0;j<str2.length();j++)
//                {
//                    if(str1.charAt(i)==str2.charAt(j))
//                    {
//                        newstr=newstr+str2.charAt(j);
//                    }
//                }
//            }
//            if(str1.equals(newstr))
//                return true;

            for(int i=0;i<str1.length();i++)
            {
                str1Array[i]=str1.charAt(i);
            }
            Arrays.sort(str1Array);
            for(char data : str1Array)
            {
                System.out.println(data);
            }
            for(int i=0;i<str2.length();i++)
            {
                str2Array[i]=str2.charAt(i);
            }
            Arrays.sort(str2Array);
            for(char data : str1Array)
            {
                System.out.println(data);
            }
            if(Arrays.equals(str1Array, str2Array))
            {
                return true;
            }

        }
        return false;
    }
    public static void main(String[] args) {
        String str1;
        String str2;
        Scanner sc = new Scanner(System.in);
        str1= sc.nextLine();
        str2= sc.nextLine();
        boolean result=anagrams(str1,str2);
        if(result)
            System.out.println("anagrams");
        else
            System.out.println("not anagrams");
    }
}

