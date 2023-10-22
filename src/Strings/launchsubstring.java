package Strings;

public class launchsubstring {
    public static void substring(String str,int startindex, int endindex)
    {
        String substring="hello";
        for( int i= startindex;i<endindex;i++)
        {
            substring = substring + str.charAt(i);
        }
        System.out.println(substring);
    }
    public static void main(String[] args) {
        String str= "helloworld";
        int startindex=3;
        int endindex=6;
        substring(str,3,6);
        substring(str,0,5);
        System.out.println(str.substring(0,5));
    }
}
