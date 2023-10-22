package Arrays_2d;

import java.util.Scanner;

public class diagnoalSum {
    public static void diagnolSum(int[][]arr)
    {
        int sum=0;
//        for(int i=0;i< arr.length;i++)
//        {
//            for(int j=0;j<arr[i].length;j++)
//            {
//                // 1st Diagonal
//
//                if(i==j)
//                {
//                    sum=sum+arr[i][j];
//                }
//                // 2nd Diagonal
//                else if (i+j== arr.length-1) {
//                    sum=sum+arr[i][j];
//                }
//            }
//        }
        // this method time Complexity is O(n^2)

        for(int i=0;i<arr.length;i++)
        {
            // 1st diagonal
            sum=sum+arr[i][i];
            //2nd diagonal
            if(i!=arr.length-1-i)
                sum =sum+arr[i][arr.length-i-1];
        }

        // this method time Complexity is O(n)
        System.out.println(sum);
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
        int[][] arr = new int[m][n];
        System.out.println("enter the elements of the array");
        input(arr);
        diagnolSum(arr);
    }
}
