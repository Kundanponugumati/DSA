package Arrays_2d;

import java.util.Scanner;

public class spiralMatrix {
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
    public static void spiral(int [][]arr)
    {
        int startRow=0;
        int endRow=arr.length-1;
        int startCol=0;
        int endCol=arr.length-1;
      while((startRow<=endRow) && (startCol<=endCol))
      {
          for(int j=0;j<endCol;j++)
          {
              System.out.print(arr[startRow][j]+ " ");
          }
          for(int i=0;i<endRow;i++)
          {
              System.out.print(arr[i][endCol]+ " ");
          }
          for(int j=endCol;j>startCol;j--)
          {
              System.out.print(arr[endRow][j]+ " ");
          }
          for(int i= endRow;i>startRow;i--)
          {
              System.out.print(arr[i][startCol]+ " ");
          }

          startRow++;
          endRow--;
          startCol++;
          endCol--;


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
        spiral(arr);

    }
}
