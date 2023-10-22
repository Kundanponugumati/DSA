package Strings;

public class upperCase {
    public static void findSpace(String str)
    {
        int startpt=1;
        int endpt=str.length();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
            {
                String substring="";
                substring=substring+str.charAt(i+1);
                substring=substring.toUpperCase();
            }
        }

    }
    public static String substring(String str)
    {
        int startpt=1;
        int endpt=str.length();
        String substring="";
        substring=substring+ str.charAt(0);
        substring=substring.toUpperCase();


        for(int i=startpt;i<endpt;i++)
        {
            substring=substring+str.charAt(i);
        }

        return substring;
    }
    public static void main(String[] args) {
        String str = "hi, i am kundan";
        // make first letter of the string to uppercase.
        System.out.println(substring(str));
    }
}
