package arrays;

public class maxSubArray1 {
    public static void sumOfSubArrays(int[]arr)
    {
        int noOfSubArrays=0;
        int maxsum=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                int sum=0;
                for(int k=i;k<=j;k++)
                {
                    System.out.print(arr[k]+" ");
                    sum=sum+arr[k];
                }
                if(maxsum<sum)
                {
                    maxsum=sum;
                }
                noOfSubArrays++;
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println(noOfSubArrays);
        System.out.println(maxsum);
    }
    public static void main(String[] args) {
        int[] arr = {1,-2,6,-1,3};
        sumOfSubArrays(arr);
    }
}
