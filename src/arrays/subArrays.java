package arrays;

public class subArrays {
    public static void subArrays(int[]arr)
    {
       int noOfSubArrays=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    System.out.print(arr[k]+" ");
                }
                    noOfSubArrays++;
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println(noOfSubArrays);
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        subArrays(arr);
    }
}
