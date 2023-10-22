package Arrays_2d;

import java.util.Scanner;

public class searchingIn2DArray {
    public static void input(int[][]arr)
    {
        Scanner sc1 = new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j]=sc1.nextInt();
            }
        }
    }
    public static int search(int[][]arr,int element)
    {
        for(int [] insidearr:arr)
        {
            for(int elements :insidearr)
            {
                if(elements==element)
                {
                    return 1;
                }
            }
        }
        return -1;


    }
    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);
        // no.of rows
        int m;
        // no.of columns
        int n;
        System.out.println("enter no.of rows");
         m = sc2.nextInt();
        System.out.println("enter no.of columns");
        n = sc2.nextInt();
        int[][]arr= new int[m][n];
        System.out.println("enter the elements of the array");
        input(arr);
        System.out.println("enter the element you want to search");
        int element = sc2.nextInt();
        int result = search(arr,element);
        if(result==1)
        {
            System.out.println(element+" is present in the given Array");
        }
        if(result==-1)
        {
            System.out.println(element+" is not present in the given Array");
        }

    }
}
