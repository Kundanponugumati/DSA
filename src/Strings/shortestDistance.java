package Strings;
import java.lang.*;
public class shortestDistance {
    public static void main(String[] args) {
        String str="WNEENESENNN";
        int x=0;
        int y=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='W')
            {
                x--;
            System.out.println("x is "+x);
            }
            if(str.charAt(i)=='E')
            {
                x++;
            System.out.println("x is " + x);
            }
            if(str.charAt(i)=='N')
            {
                y++;
                System.out.println("y is " + y);
            }
            if(str.charAt(i)=='S')
            {
                y--;
                System.out.println("y is " + y);
            }
        }
        System.out.println(Math.sqrt(Math.pow(x,2)+Math.pow(y,2)));
    }
}
