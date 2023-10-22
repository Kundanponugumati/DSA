package Arrays_2d;

import java.util.Scanner;

public class create2dmatirx {
    public static void main(String[] args) {
        int [][] arr= new int[3][3];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i< arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }

        for(int [] insideaaray:arr)
        {
            for(int element:insideaaray)
            {
                System.out.print(element+" ");

            }
            System.out.println();
        }
    }
}
