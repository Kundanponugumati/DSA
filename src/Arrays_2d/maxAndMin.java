package Arrays_2d;

import java.util.Scanner;

public class maxAndMin {
    public static void maxAndMin(int[][]arr)
    {
        int min=arr[0][0];
        int max=arr[0][0];
        for(int [] insidearr:arr)
        {
            for(int elements:insidearr)
            {
                if(max<elements)
                {
                    max=elements;
                }
                if(min>elements)
                {
                    min=elements;
                }
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
    public static void input(int[][]arr)
    {
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // no.of rows
        int m;
        // no.of columns
        int n;
        System.out.println("enter no.of rows");
        m = sc.nextInt();
        System.out.println("enter no.of columns");
        n = sc.nextInt();
        int [][] arr = new int[m][n];
        System.out.println("enter the elements of the array");
        input(arr);
        System.out.println("Maximum and Minimum elements of the Array are");
        maxAndMin(arr);
    }
}
